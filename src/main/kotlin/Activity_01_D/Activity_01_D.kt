import kotlin.math.roundToInt
import kotlin.math.roundToLong
import kotlin.system.exitProcess
import kotlin.text.toInt
import kotlin.text.toInt as toInt1

/* Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done. */
fun main() {
    var counter: Int = 1
    var money: String? = null
    var moneySum: Int = 0
    var divideBy: String = ""
    var quotient: Double = 0.0
    var continueTheProgram = true

    do {
        print("$counter. Input money: ")
        money = readln()
        counter += 1

        if (money?.toIntOrNull() == null) {
            println("You entered an Invalid Number, program will exit now.")
            continueTheProgram = false
        } else {
            moneySum += money.toInt()
        }

    } while (counter < 6 && money?.toIntOrNull() != null)

    if (continueTheProgram == true) {
        println()
        print("Divide $moneySum by?: ")
        divideBy = readln()
        quotient = moneySum / divideBy.toDouble()
        print("$moneySum divided by $divideBy is equal to $quotient")
    } else {
        println("Bye~")
    }
}