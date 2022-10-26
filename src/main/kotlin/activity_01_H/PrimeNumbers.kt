package activity_01_H
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

    //determining which is lower and higher number
    if (first > second) {
        higherNum = first.toInt()
        lowerNum = second.toInt()
    } else {
        higherNum = second.toInt()
        lowerNum = first.toInt()
    }
    logger.info { "Prime numbers from $lowerNum to $higherNum are:" }

    while (lowerNum < higherNum+1) {
        divisible = false //set divisible to false at each while iteration

        for (i in 2 until lowerNum-1) { //index starts at 2 to exclude 1. Ends at lowerNum -1 to exclude lowerNum value
            if (lowerNum % i == 0) { //if lowerNum is divisible by a number other than itself, it is not a prime number
                divisible=true
            }
        }

       if (divisible==false) { //if it is not divisible, add lowerNum to primeSet
           if (lowerNum > 1) {
               primeSet += "[$lowerNum] "
           }
       }

        lowerNum++
    }
    logger.info { "$primeSet" }

}