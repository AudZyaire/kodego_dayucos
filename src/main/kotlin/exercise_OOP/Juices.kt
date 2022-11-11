package exercise_OOP

class Juices(private var juices: ArrayList<String> = arrayListOf("Apple Juice", "Orange Juice", "Mango Juice", "Banana Juice", "Peach Juice")) : FastfoodItems() {

    override fun printItems() {
        var i = 0
        println("Available Juices are: ")
        for (juice in juices) {
            print(juice)
            if (i < juices.lastIndex) print(", ")
            i++
        }
        println()
        println()
    }
}