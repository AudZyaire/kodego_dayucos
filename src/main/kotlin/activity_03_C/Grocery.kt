package activity_03_C

fun main() {
//1. Create an ArrayList of grocery products with 20 entries.
    var groceryProducts = arrayListOf<String>(
        "Tissue", "Paper Plate", "Milk", "ss", "Cheese",
        "Hotdog", "Sliced Bread", "Candy", "Hand Sanitizer", "Cologne",
        "Perfume", "Butter", "Corned Beef", "Dishwashing Liquid", "Soap",
        "Sardines", "Coke", "Rum", "Beef Patty", "Soy Sauce"
    )
    var itemCode = 1
    for (item in groceryProducts) {
        print("$itemCode: $item || ")
        if (itemCode % 5 == 0) {
            println()
        }
        itemCode++
    }
    println()

//2. Create a HashMap called Cart.
//Hint:  Hashmap<String, Int>
    var cart = mutableMapOf<String, Int>()

    addToCart("Hand Sanitizer", 17, cart, groceryProducts)
    addToCart("Tissue", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Coke", 17, cart, groceryProducts)
    addToCart("Hand Sanitizer", 17, cart, groceryProducts)
    addToCart("Tissue", 17, cart, groceryProducts)
    println(cart.keys)
    removeFromCart("Coke", cart)
    println(cart.keys)


}

//2. Create a function "addToCart" that will accept a String and an Int, then it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
fun addToCart(itemName: String, itemCode: Int, cart: MutableMap<String, Int>, groceryList: ArrayList<String>) {
    var howMany = 1

    if (groceryList.contains(itemName)) {
        if (cart.contains(itemName)) {
            for (item in cart.keys) {
                if (item.length > itemName.length) {
                    if (item.uppercase().subSequence(0 until itemName.length) == itemName.uppercase()) {
                        howMany++
                    }
                }
            }
            cart.put(itemName + "_$howMany", itemCode)
        } else {
            cart.put(itemName, itemCode)

//        }

        }
    }
}

//3. Create a function "checkOut". This will compute how many items have been checked out.
fun checkOut(cart: MutableMap<String, Int>) {
    println("${cart.size} items have been checked out.")
}

//4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.
fun removeFromCart(itemToRemove: String, cart: MutableMap<String, Int>) {

    var found = arrayListOf<String>()
    for (item in cart.keys) {
        if (item.contains(itemToRemove)) {
            found.add(item)
        }
    }
    for (index in found.indices) {
        cart.remove(found[index])
    }

}

