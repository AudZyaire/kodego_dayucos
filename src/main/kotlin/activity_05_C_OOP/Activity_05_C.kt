package activity_05_C_OOP
import activity_06_C.addToCartExceptions
import activity_06_C.checkOutExceptions


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

    fun addToCart_(cart: Cart_, item: Products, quantity: Double): String {
        addToCartExceptions(item,quantity)

        cart.items.put(item, quantity)
        return "Add to Cart Success"
    }


    fun removeFromCart_(cart: Cart_, itemToRemove: String) {
        println("Removing ${itemToRemove.uppercase()}....")
        var initialCartSize = cart.items.size
        var found = true
        cart.items.keys.removeIf { key -> key.name.uppercase() == itemToRemove.uppercase() }

        if(cart.items.size != initialCartSize) {
            println("${itemToRemove.uppercase()} successfully removed!")
        }else{
            println("${itemToRemove.uppercase()} not in cart")
        }
    }

    fun checkOutCart_(cart: Cart_):String {
        checkOutExceptions(cart)
        var number = 1
        var total = 0.0
        for (item in cart.items) {
            var eachItemCost = 0.0
            eachItemCost = item.key.price * item.value
            total += eachItemCost
            println("Item $number: ${item.key.name} - Unit Price: ${item.key.price} - QTY: ${item.value} = $eachItemCost")
            number++
        }
        println("Total: $total")
        return "Check Out Success"
    }
}

fun main() {
    var cart = Cart_()
    val main = Main()
    main.addToCart_(cart, Shampoo("Palmolive", 4.0), 12.0)
    main.addToCart_(cart, Fruit("Mango", 10.2), 5.0)
    main.addToCart_(cart, Fruit("Apple", 10.0), 4.0)
    main.addToCart_(cart, Fruit("Art", 10.0), 3.0)
    main.removeFromCart_(cart, "apple")
    main.removeFromCart_(cart, "mango")
    main.removeFromCart_(cart, "Sting")
    main.checkOutCart_(cart)
}