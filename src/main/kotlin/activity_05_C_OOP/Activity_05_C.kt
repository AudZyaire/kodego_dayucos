package activity_05_C_OOP


//1. Create a parent class for all the products in the grocery.
open class Products {
    var name = ""
    var price = 0.0

    constructor(name: String, price: Double) {
        this.name = name
        this.price = price
    }

}

class Shampoo(name: String, price: Double) : Products(name, price)
class PowderedMilk(name: String, price: Double) : Products(name, price)
class Fruit(name: String, price: Double) : Products(name, price)
class Deodorant(name: String, price: Double) : Products(name, price)
class BottledWater(name: String, price: Double) : Products(name, price)

//2. Create a cart to store the groceries.
class Cart_ {
    var items: HashMap<Products, Double> = hashMapOf()


}

//3. Create a Main class where you will add the Cart.
//4. In the main class add the following functions
//a - add to cart > add an item in the cart
//b - remove from cart > remove item in the cart
//c - check out cart > compute the total cost of the cart.
class Main {

    fun addToCart_(cart: Cart_, item: Products, quantity: Double) {
        cart.items.put(item, quantity)
    }


    fun removeFromCart_(cart: Cart_,itemToRemove: String) {
        var removeItem = Products(itemToRemove,0.0)
        var found = false
        for (item in cart.items.keys) {
            if (removeItem.name == item.name) {
                cart.items.remove(item)
                found = true
            }
        }
        if (found == true) {
            println("$itemToRemove Successfully Removed!")

        }else {
            println("$itemToRemove Not Found!")
        }
    }

    fun checkOutCart_(cart: Cart_) {
        var number = 1
        for (item in cart.items) {
            var eachItemCost = 0.0
            eachItemCost = item.key.price * item.value
            println("Item $number: ${item.key.name} - Price: ${item.key.price} - QTY: ${item.value} = $eachItemCost")
            number++
        }
    }
}

fun main() {
    var cart = Cart_()
    val cart1 = Main()
    cart1.addToCart_(cart, Shampoo("Palmolive", 4.0), 12.0)
    cart1.addToCart_(cart, Fruit("Mango", 10.2), 5.0)
    cart1.addToCart_(cart, Fruit("Apple", 10.0), 3.0)
    cart1.addToCart_(cart, Fruit("Art", 10.0), 3.0)
    cart1.removeFromCart_(cart, "Palmolive")
    cart1.checkOutCart_(cart)
    println("${cart.items.size}")
    var map = hashMapOf<String, Int>()



}