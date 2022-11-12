package exercise_OOP

import kotlin.random.Random


open class Cart {
    var itemsInCart: ArrayList<String>
    var quantityOfItemsInCart: ArrayList<Int>
    var id: Int

    constructor(itemsInCart:ArrayList<String> = arrayListOf(), quantityOfItemsInCart: ArrayList<Int> = arrayListOf(), id: Int = (101..999).random()) {
        this.itemsInCart = itemsInCart
        this.quantityOfItemsInCart = quantityOfItemsInCart
        this.id = id
    }

    fun showOrderStatus(status: Cart.OrderStatus, cartID: Int){
        println("Order with cart ID: $cartID status: $status")

    }

    enum class  OrderStatus{
        SENT_TO_THE_KITCHEN,
        BEING_PREPARED,
        FOR_PICK_UP,
        FOR_DELIVERY,
        DELIVERED,
        CANCELLED,
        PAID,
        UNKNOWN
    }
    fun updateOrder(customerName: String, whichItem: String) {
        var i = 0
        println("Replace $whichItem with?: ")
        var itemReplacement = readln()
        println("Quantity: ")
        var replacementQuantity = readln().toInt()
        for (item in itemsInCart) {
            if (whichItem.uppercase() == item.uppercase()) {
//                itemsInCart.removeAt(i)
//                quantityOfItemsInCart.removeAt(i)
                itemsInCart.set(i,itemReplacement)
                quantityOfItemsInCart.set(i,replacementQuantity)
            }
                i++
        }

    }

    fun addToCart(item: String, quantity: Int) {
        println("Successfully added to cart!")
        itemsInCart.add(item)
        quantityOfItemsInCart.add(quantity)
    }

    fun showItemsInCart(whosCart: String, cartID: Int) {
        var i = 0
        println("Showing items of $whosCart's cart (Cart ID: $cartID)")
        for (item in itemsInCart) {
            if (item != "") {
                println("${itemsInCart[i]} -- ${quantityOfItemsInCart[i]}")

            }
            i++
        }
    }


    class Customer{
        var lastName: String
        var firstName: String

        constructor(lastName: String = "", firstName: String = "") {
            this.lastName = lastName
            this.firstName = firstName
        }

        fun addCustomerName(lastName: String, firstName: String): String {
            val customer1 = Customer()
            customer1.lastName = lastName
            customer1.firstName = firstName
            return "$firstName $lastName"

        }
    }
}