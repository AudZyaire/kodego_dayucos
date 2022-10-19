package Activity_01_H
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {

    var first: String
    var second: String
    var lowerNum:Int
    var higherNum:Int
    var divisible:Boolean?
    //var primeSet = arrayListOf<Int>()
    var primeSet: String = ""
    logger.info { "Enter First Number: " }
    first = readln()
    logger.info { "Enter Second Number: " }
    second = readln()
    if (first > second) {
        higherNum = first.toInt()
        lowerNum = second.toInt()
    } else {
        higherNum = second.toInt()
        lowerNum = first.toInt()
    }
    logger.info { "Prime numbers from $lowerNum to $higherNum are:" }

    while (lowerNum < higherNum+1) {
        divisible = false
        for (i in 2..lowerNum-1) {
            if (lowerNum % i == 0) {
                divisible=true
            }
        }
       if (divisible==false) {
           primeSet +="[$lowerNum] "
       }
        lowerNum++
    }
    logger.info { "$primeSet" }

}