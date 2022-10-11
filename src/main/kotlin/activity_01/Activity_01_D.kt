/* Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done. */
fun main() {
    var amount1:String? = null
    var amount2:String? = null
    var amount3:String? = null
    var amount4:String? = null
    var amount5:String? = null
    var totalAmount:Int? = null
    var divideBy:String? = null
    var dividedAnswer:Int? = null

    println("Int values only or program will exit.")
    print("1. Input money: ")
    amount1 = readln()
    if (amount1.toIntOrNull() == null) {
        println("You entered $amount1, program will exit now. ")
    }
    print("2. Input money: ")
    amount2 = readln()
    if (amount2.toIntOrNull() == null) {
        println("You entered $amount2, program will exit now. ")
    }
    print("3. Input money: ")
    amount3 = readln()
    if (amount3.toIntOrNull() == null) {
        println("You entered $amount3, program will exit now. ")
    }
    print("4. Input money: ")
    amount4 = readln()
    if (amount4.toIntOrNull() == null) {
        println("You entered $amount4, program will exit now. ")
    }
    print("5. Input money: ")
    amount5 = readln()
    if (amount5.toIntOrNull() == null) {
        println("You entered $amount5, program will exit now. ")
    }
    totalAmount = amount1.toInt() + amount2.toInt() + amount3.toInt() + amount4.toInt() + amount5.toInt()
    println("Sum of the amount you entered is: $totalAmount")
    print("Divide the sum by: ")
    divideBy = readln()
    dividedAnswer = totalAmount / divideBy.toInt()
    println("$totalAmount divided by $divideBy is: $divideBy")
}