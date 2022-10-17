import mu.KotlinLogging
import kotlin.math.roundToInt

private val logger = KotlinLogging.logger{}

/* Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done. */
fun main() {
    var counter: Int = 1
    var money: String? = null
    var moneySum: Double = 0.0
    var divideBy: String = ""
    var quotient: Double = 0.0
    var continueTheProgram = true
    var quotientRound:Double = 0.0

    do { //ask for input 5 times, program will end if input is not a Number
        logger.info { "$counter. Input money: " }
        money = readln()

        if (money?.toDoubleOrNull() == null) {
            logger.warn { "You entered an invalid number, program will exit now." }
            continueTheProgram = false //assign false to be used as exit code below if input is not a number
        } else {
            moneySum += money.toDouble()
            counter += 1
        }

    } while (counter < 6 && money?.toDoubleOrNull() != null) //break the loop if input is not a Number or counter is 6

    if (continueTheProgram) {

        do{ //Keep asking for input UNTIL a number is entered.
            logger.info { "Divide $moneySum by?: " }
            divideBy = readln()

            if (divideBy.toDoubleOrNull() == null) {
                logger.warn { "Enter a valid number." }
            }

        }while (divideBy.toDoubleOrNull() == null) //will break loop ONLY IF divideBy value is number

        quotient = moneySum / divideBy.toDouble()
        quotientRound = (quotient * 100).roundToInt().toDouble() / 100 //reduce decimal places to TWO
        logger.info { "$moneySum divided by $divideBy is equal to ${quotientRound}"}

    } else {
        logger.warn { "---------------------Program End---------------------" }
    }
}