package exercise_OOP

fun main() {
    var customer1 = Customer("Lyle", "Brook", "Cebu", "0999992222")
    var cartt1 = Cartt(customer1)
//    cartt1.addItems("Mango Juice", 3.0)
    cartt1.addItems(OreoMilkshake(), 3)
    cartt1.addItems(Palamig(), 3)
    cartt1.addItems(Peach(), 3)
    cartt1.addItems(Orange(), 5)
    cartt1.addItems(Peach(), 2)
    cartt1.addItems(Peach(), 10)
    println()
    cartt1.itemShow()

}

open class Product {
    var name: String = ""
        private set
    var price: Double = 0.0

    constructor(name: String, price: Double) {
        this.name = name
        this.price = price
    }

    fun printAdd() {
        println("Added $name -- price: $price")
    }

    fun totalPayable(quantity: Int): Double {
        return price * quantity
    }

    fun totalPayable(quantity: Float): Double {
        return price * quantity
    }

    fun totalPayable(quantity: Double): Double {
        return (price * quantity).toDouble()
    }


}

open class Fruits(name: String = "", price: Double) : Product(name, price) {
    var quantity: Float = 0.0F
    var quantityUnits: String = "per piece"
}

class Apple(name: String = "Apple", price: Double = 5.6) : Fruits(name, price)
class Orange(name: String = "Orange", price: Double = 0.0) : Fruits(name, price)
class Mango(name: String = "Mango", price: Double = 4.5) : Fruits(name, price)
class Banana(name: String = "Banana", price: Double = 0.0) : Fruits(name, price)
class Peach(name: String = "Peach", price: Double = 5.9) : Fruits(name, price)


open class Shake(name: String, price: Double) : Product(name, price) {
    var size: Any = ""
    var ingredients: ArrayList<String> = ArrayList()
    var addons: ArrayList<Any> = ArrayList()
}

class OreoMilkshake(name: String = "Oreo Milkshake", price: Double = 10.5) : Shake(name, price)
class BananaShake(name: String = "Banana Shake", price: Double = 0.0) : Shake(name, price)
class MangoMilkshake(name: String = "Mango Milkshake", price: Double = 0.0) : Shake(name, price)
class ChocolateShake(name: String = "Chocolate Shake", price: Double = 0.0) : Shake(name, price)
class AppleShake(name: String = "Apple Shake", price: Double = 0.0) : Shake(name, price)


open class Juices(name: String, price: Double) : Product(name, price) {
    var ingredients: ArrayList<String> = ArrayList()
    var size: Any = ""

}

class LemonJuice(name: String = "Lemon Juice", price: Double = 0.0) : Juices(name, price)
class OrangeJuice(name: String = "Orange Juice", price: Double = 0.0) : Juices(name, price)
class MangoJuice(name: String = "Mango Juice", price: Double = 0.0) : Juices(name, price)
class CucumberJuice(name: String = "Cucumber Juice", price: Double = 0.0) : Juices(name, price)
class Palamig(name: String = "Palamig", price: Double = 3.3) : Juices(name, price)


open class Sandwiches(name: String, price: Double) : Product(name, price) {
    var ingredients: ArrayList<String> = ArrayList()
    var addons: ArrayList<Any> = ArrayList()
    var breadType: Any = ""
}

class TunaSandwich(name: String = "Tuna Sandwich", price: Double = 0.0) : Sandwiches(name, price)
class EggSandwich(name: String = "Egg Sandwich", price: Double = 0.0) : Sandwiches(name, price)
class MayonnaiseSandwich(name: String = "Mayonnaise Sandwich", price: Double = 0.0) : Sandwiches(name, price)
class CheeseSandwich(name: String = "Tuna Sandwich", price: Double = 0.0) : Sandwiches(name, price)
class ButterAndJellySandwich(name: String = "Butter and Jelly Sandwich", price: Double = 0.0) : Sandwiches(name, price)

open class Salad(name: String, price: Double) : Product(name, price) {
    var ingredients: ArrayList<String> = ArrayList()
    var dressing: Any = ""
    var addons: ArrayList<Any> = ArrayList()
    var size: Any = ""

}

class MacaroniSalad(name: String = "Macaroni Salad", price: Double = 0.0) : Salad(name, price)
class PastaSalad(name: String = "Pasta Salad", price: Double = 0.0) : Salad(name, price)
class SummerAsianSlaw(name: String = "Summer Asian Slaw", price: Double = 0.0) : Salad(name, price)
class Broccoli(name: String = "Brocolli Salad", price: Double = 0.0) : Salad(name, price)
class RainbowOrzoSalad(name: String = "Rainbow Orzo Salad", price: Double = 0.0) : Salad(name, price)

enum class StatusOrder {
    SENT_TO_THE_KITCHEN,
    BEING_PREPARED,
    FOR_PICK_UP,
    FOR_DELIVERY,
    DELIVERED,
    PICKED_UP,
    CANCELLED,
    UNKNOWN;
}

class Cartt(var customer: Customer) {
    var uniqueID: String = ""
    var items: HashMap<Product, Float> = hashMapOf<Product, Float>()
    var status: StatusOrder = StatusOrder.UNKNOWN

    fun OrderUpdate(status: StatusOrder) {
        this.status = status
    }

    fun addItems(productName: Product, quantity: Float) {
        items.put(productName, quantity)
        productName.printAdd()
    }


    fun addItems(productName: Product, quantity: Int) {
        items.put(productName, quantity.toFloat())
        productName.printAdd()
    }

    fun addItems(productName: Product, quantity: Double) {
        items.put(productName, quantity.toFloat())
        productName.printAdd()
    }


    fun itemShow() {
        var totalAllItem = 0.0
        for (item in items) {
            var totalPerItem = item.key.price * item.value

            println("Item: ${item.key.name} | Quantity: ${item.value} | Price: ${item.key.price} | Total: $totalPerItem")
//            println("Total: ${item.key.price * item.value}")
            totalAllItem += item.key.totalPayable(item.value)
        }
        println("Total of items in the cart: $totalAllItem")
        println("Customer info: ${this.customer.firstName} ${this.customer.lastName} ")
    }

}

data class Customer(var firstName: String, var lastName: String, var address: String, var mobileNumber: String)