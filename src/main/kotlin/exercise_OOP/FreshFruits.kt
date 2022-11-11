package exercise_OOP

class FreshFruits(private var fruits: ArrayList<String> = arrayListOf("Apple", "Orange", "Mango", "Banana", "Peach")) :
    FastfoodItems() {

    override fun printItems() {
        var i = 0
        println("Available fruits are: ")
        for (fruit in fruits) {
            print("$fruit")
            if (i < fruits.lastIndex) print(", ")
            i++
        }
        println()
        println()
    }


}