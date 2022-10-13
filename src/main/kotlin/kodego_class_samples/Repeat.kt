fun main() {
    repeat(10) {
        println("$it -> repeat")
    }
for(counter in 0 .. 10) {
    println("$counter: for loop")
}
    for(counter in 0 until  10) {
        println("$counter: for loop")
    }
    for(counter in 0 .. 10 step 2) {
        println("$counter: for loop")
    }
    for(counter in 10 downTo 0) {
        println("$counter: for loop")
    }
}