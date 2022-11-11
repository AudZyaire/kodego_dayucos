package exercise_OOP

import exercise_OOP.Cart.OrderStatus.*

fun main() {
    val cart1 = Cart()
    val customer1 = Cart.Customer()
    val cartID = cart1.id
    println("What is your last name?")
    var lastName = readln()
    println("What is your first name?")
    var firstName = readln()
    var concatenatedName = customer1.addCustomerName(lastName,firstName)

    FreshFruits().printItems()
    Shakes().printItems()
    Juices().printItems()
    Sandwiches().printItems()
    Salads().printItems()

    var stillOrder = true
    while (stillOrder) {
        println("What is your order? : ")
        var order = readln()
        println("How many? : ")
        var quantity = readln().toInt()
        cart1.addToCart(order,quantity)
        println("Do you still want to order? Y/N")
        var answer = readln()
        if (answer.uppercase() == "N") stillOrder = false
    }

    cart1.showItemsInCart(concatenatedName,cartID)

    println("Which item do you want to replace?: ")
    var itemReplace = readln()
    cart1.updateOrder(customer1.lastName,itemReplace)
    cart1.showItemsInCart(concatenatedName,cartID)
    println()

    val orderStatus = Cart.OrderStatus.CANCELLED
    cart1.showOrderStatus(orderStatus,cartID)

}
