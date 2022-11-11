package exercise_OOP

class Shakes(
    private var shakes: ArrayList<String> = arrayListOf(
        "Apple Shake",
        "Orange Shake",
        "Mango Shake",
        "Banana Shake",
        "Peach Shake"
    ),
) : FastfoodItems() {
    override fun printItems() {
        var i = 0
        println("Available Shakes are: ")
        for (shake in shakes) {
            print("$shake")
            if (i < shakes.lastIndex) print(", ")
            i++
        }
        println()
        println()
    }
}
