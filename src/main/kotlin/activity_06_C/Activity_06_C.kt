package activity_06_C

import activity_04_C.Fruits
import activity_04_C.Poultry
import activity_05_C_OOP.*

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
    main1.addToCart_(cart1, Poultry("Egg", 2.0), 3.0)
    main1.addToCart_(cart1, Fruits("Mango", 10.2), 5.0)
    main1.addToCart_(cart1, Fruits("Apple", 10.0), 4.0)
    main1.addToCart_(cart1, Fruits("Banana", 2.0), 3.0)

//    checkOutExceptions(cart1)
}
class InvalidProductQuantityException(message: String = "Quantity of any item can't be 0!") : Exception(message)
class InvalidProductPriceException(message: String = "Price of any item can't be equal to 0!") : Exception(message)
class InvalidProductNameException(message: String = "Product name of any product can't be empty") : Exception(message)
class EmptyCartException(message: String = "Cart is empty!") : Exception(message)

fun checkOutExceptions(cart: Cart_) {

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

fun addToCartExceptions(item: Products, quantity: Double) {

    if(quantity <= 0.0)
        throw InvalidProductQuantityException()

    if(item.price <= 0.0)
        throw InvalidProductPriceException()

    if(item.name == "")
        throw InvalidProductNameException()

}