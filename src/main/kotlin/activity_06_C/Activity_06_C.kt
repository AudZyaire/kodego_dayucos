package activity_06_C

import activity_05_C_OOP.Cart_
import activity_05_C_OOP.Fruit
import activity_05_C_OOP.Main
import activity_05_C_OOP.Shampoo

//When a customer checks out an item, identify the possible scenarios where a cart can not be checked out properly.
//
//Name at least 5 scenarios.
//
//Create a function that will check the cart for the exceptions.

//1. Quantity of a product is <= 0
//2. Price of a product is <= 0
//3. Product Name is empty
//4. Cart is empty
//5.

fun main() {
    var cart1 = Cart_()
    var main1 = Main()
    main1.addToCart_(cart1, Shampoo("Palmolive", 3.0), 5.0)
    main1.addToCart_(cart1, Fruit("Mango", 10.2), 5.0)
    main1.addToCart_(cart1, Fruit("Apple", 10.0), 4.0)
    main1.addToCart_(cart1, Fruit("Banana", 2.0), 3.0)

    checkForExceptions(cart1)
}
class InvalidProductQuantityException(message: String = "Quantity of any item can't be 0!") : Exception(message)
class InvalidProductPriceException(message: String = "Price of any item can't be equal to 0!") : Exception(message)
class InvalidProductNameException(message: String = "Product name of any product can't be empty") : Exception(message)
class EmptyCartException(message: String = "Cart is empty!") : Exception(message)

fun checkForExceptions(cart: Cart_) {

    for(i in cart.items) {

        if (i.value <= 0.0)
            throw InvalidProductQuantityException()

        if (i.key.price <= 0.0)
            throw InvalidProductPriceException()

        if(i.key.name == "")
            throw InvalidProductNameException()
    }

    if (cart.items.size == 0)
        throw EmptyCartException()

}