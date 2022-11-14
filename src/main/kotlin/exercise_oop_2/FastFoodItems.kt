package exercise_oop_2

fun main() {
    showAllItems()
    var cart1 = Cart()
    cart1.items = arrayListOf("Banana", "Mango", "Apple", "Guava")
    cart1.uniqueId = 201
    cart1.customer.firstName = "Joni"
    cart1.customer.lastName = "Dayucos"
    cart1.customer.address = "Cebu"
    cart1.customer.mobileNumber = "0999999999"
    cart1.orderStatus = OrderStatus1.BEING_PREPARED
    cart1.printInfoOfCart()
    changeOrderStatus(cart1,OrderStatus1.PAID)
    cart1.printInfoOfCart()
    var updatedItems = arrayListOf<String>("Mango")
    cart1.orderStatus = OrderStatus1.BEING_PREPARED
    updateOrder(cart1, updatedItems)
    cart1.printInfoOfCart()
}

//1. Take orders of the customers
//- Create a cart that will contain the items bought by a customer
//- Each cart has a unique id
//- Each card belongs to a customer
//- a customer has an address mobile number  first name and last name.
class Cart(
    var items: ArrayList<String> = arrayListOf(),
    var uniqueId: Int = 0,
    var customer: Customer = Customer(),
    var orderStatus: OrderStatus1 = OrderStatus1.UNKNOWN,
) {

    class Customer(
        var firstName: String = "",
        var lastName: String = "",
        var address: String = "",
        var mobileNumber: String = "",
    )
//    fun addInfoToCart(items: ArrayList<String>, uniqueId: Int, customerName: Customer, status: OrderStatus1) {
//        this.items = items
//        this.uniqueId = uniqueId
//        this.customer.firstName = customer.firstName
//        this.customer.lastName = customer.lastName
//        this.customer.address = customer.address
//        this.customer.mobileNumber = customer.mobileNumber
//        this.orderStatus = status
//    }

    fun printInfoOfCart() {
        println("----------------------------------------------------")
        println("Items in cart[ID:${uniqueId}]: ")
        for (item in items) {
            println("$item")
        }
        println("Order Status: $orderStatus")
        println("Customer: ${customer.firstName} ${customer.lastName}")
        println("Address: ${customer.address}")
        println("Mobile Number: ${customer.mobileNumber}")
        println("----------------------------------------------------")
    }
}

//2. Show the status of the orders if they are sent to the kitchen, being prepared, for pick up, for delivery, delivered, cancelled, paid, unknown.
//- Use enumaration
enum class OrderStatus1 {
    SENT_TO_THE_KITCHEN,
    BEING_PREPARED,
    FOR_PICK_UP,
    FOR_DELIVERY,
    DELIVERED,
    CANCELLED,
    PAID,
    UNKNOWN;
}

fun changeOrderStatus(whichCart: Cart, status: OrderStatus1) {
    whichCart.orderStatus = status
}
//- Create a function "Update order" which will update the cart of a specific customer
fun updateOrder(cartToUpdate: Cart, items: ArrayList<String>) {
    cartToUpdate.items.clear()
    for (item in items) {
        cartToUpdate.items.add(item)
    }
    changeOrderStatus(cartToUpdate, OrderStatus1.BEING_PREPARED)
}

//3. Show the items being sold. The fast food company sells fresh fruits, shakes, juices, sandwiches, and salads.
//- Create 5 items for each category of items being sold.
//- Use OOP concepts to create the classes for the food category.
//- You must use Inheritance, Polymorphism, Encapsulation, Abstraction
fun showAllItems() {
    println("---------AVAILABLE TODAY---------")
    FreshFruits().showItemSold()
    Shakes().showItemSold()
    Juices().showItemSold()
    Sandwiches().showItemSold()
    Salads().showItemSold()
}

open class FastFoodItems {
    open var itemSold: ArrayList<String> = arrayListOf()
    open var category: String = ""

    fun showItemSold() {
        var i = 0
        print("$category: ")
        for (item in itemSold) {
            print("~$item")
            if (i < 4)
                print(" , ")
            i++
        }
        println()

    }
}

class FreshFruits : FastFoodItems() {
    override var itemSold = arrayListOf("Apple", "Orange", "Mango", "Banana", "Peach")
    override var category = "Fresh Fruits"
}

class Shakes : FastFoodItems() {
    override var itemSold =
        arrayListOf("Oreo Milkshake", "Banana Shake", "Mango Milkshake", "Chocolate Shake", "Apple Shake")
    override var category = "Shakes"
}

class Juices : FastFoodItems() {
    override var itemSold =
        arrayListOf("Lemon Juice", "Orange Juice", "Mango Banana Juice", "Cucumber Juice", "Palamig")
    override var category = "Juices"
}

class Sandwiches : FastFoodItems() {
    override var itemSold = arrayListOf(
        "Tuna Sandwich",
        "Egg Sandwich",
        "Mayonnaise Sandwich",
        "Cheese Sandwich",
        "Butter and Jelly Sandwich"
    )
    override var category = "Sandwiches"
}

class Salads : FastFoodItems() {
    override var itemSold =
        arrayListOf("Macaroni Salad", "Pasta Salad", "Summer Asian Slaw", "Broccoli Salad", "Rainbow Orzo Salad")
    override var category = "Salads"
}
