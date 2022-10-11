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
    var dividedAnswer:Double? = null

    println("Int values only or program will exit.")
    print("1. Input money: ")
    amount1 = readln()
    //checking if value is Int
    print("2. Input money: ")
    amount2 = readln()
    print("3. Input money: ")
    amount3 = readln()
    print("4. Input money: ")
    amount4 = readln()
    print("5. Input money: ")
    amount5 = readln()

    if (amount1.toIntOrNull() == null || amount2.toIntOrNull() == null || amount3.toIntOrNull() == null || amount4.toIntOrNull() == null || amount5.toIntOrNull() == null) {
        println("You entered an invalid value, program will exit now. ")
    } else {
        totalAmount = amount1.toInt() + amount2.toInt() + amount3.toInt() + amount4.toInt() + amount5.toInt()
        println("Sum of the amount you entered is: $totalAmount")
        print("Divide the value by how many?: ")
        divideBy = readln()
        dividedAnswer = totalAmount / divideBy.toDouble()
        println("$totalAmount divided by $divideBy is: $dividedAnswer")
    }
}