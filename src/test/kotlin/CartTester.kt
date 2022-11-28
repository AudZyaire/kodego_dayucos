import activity_05_C_OOP.Cart_
import activity_05_C_OOP.Fruit
import activity_05_C_OOP.Main
import activity_06_C.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

//Create the unit test for adding items in the Cart as well as checking out the items in cart.
//key = product (Name, Price)
// value = quantity

internal class CartTester {
    //ADD ITEMS TO CART
    @Test
    fun addToCartLessZeroQuantity() {
        val main: Main = Main()
        var cart = Cart_()
        assertThrows<InvalidProductQuantityException> { main.addToCart_(cart,Fruit("Mango", 2.2), -2.5) }
    }

    @Test
    fun addToCartLessZeroPrice() {
        val main: Main = Main()
        var cart = Cart_()
        assertThrows<InvalidProductPriceException> { main.addToCart_(cart,Fruit("Mango", 0.0), 2.5) }
    }

    @Test
    fun addToCartEmptyProductName() {
        val main: Main = Main()
        var cart = Cart_()
        assertThrows<InvalidProductNameException> { main.addToCart_(cart,Fruit("", 10.0), 2.5) }
    }


    //CHECK OUT CART
    @Test
    fun checkOutProductQuantityLessZero() {
        val main: Main = Main()
        var cart = Cart_()
        cart.items.put(Fruit("Mango", 2.2), -1.0)
        assertThrows<InvalidProductQuantityException> { main.checkOutCart_(cart) }
    }

    @Test
    fun checkOutProductPriceLessZero() {
        val main: Main = Main()
        var cart = Cart_()
        cart.items.put(Fruit("Mango", -5.3), 2.0)
        assertThrows<InvalidProductPriceException> { main.checkOutCart_(cart) }
    }

    @Test
    fun checkOutProductNameEmpty() {
        val main: Main = Main()
        var cart = Cart_()
        cart.items.put(Fruit("", 2.3), 2.0)
        assertThrows<InvalidProductNameException> { main.checkOutCart_(cart) }
    }

    @Test
    fun checkOutEmptyCartException() {
        val main: Main = Main()
        var cart = Cart_()
        assertThrows<EmptyCartException> { main.checkOutCart_(cart) }
    }


}