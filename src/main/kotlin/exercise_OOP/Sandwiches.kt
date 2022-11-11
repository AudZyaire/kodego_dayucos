package exercise_OOP

class Sandwiches(
    private var sandwiches: ArrayList<String> = arrayListOf(
        "Tuna Sandwich",
        "Egg Sandwich",
        "Mayonnaise Sandwich",
        "Cheese Sandwich",
        "Butter and Jelly Sandwich"
    ),
) : FastfoodItems() {
    override fun printItems() {
        var i = 0
        println("Available Sandwiches are: ")
        for (sandwich in sandwiches) {
            print("$sandwich")

            if (i < sandwiches.lastIndex) print(", ")
            i++
        }
        println()
        println()
    }


}