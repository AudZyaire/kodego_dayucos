package exercise_OOP

class Salads(private var salads: ArrayList<String> = arrayListOf("Macaroni Salad", "Pasta Salad", "Summer Asian Slaw", "Broccoli Salad", "Rainbow Orzo Salad")) : FastfoodItems() {
    override fun printItems() {
        var i = 0
        println("Available Salads are: ")
        for (salad in salads) {
            print("$salad")
            if (i < salads.lastIndex) print(", ")
            i++
        }
        println()
        println()
    }
}