
/**
 * Create an application that will accept 2 string inputs.
 * Your application will print all unique characters in both Strings.
 */

package Activity_01_F
import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {

    var string1: String = ""
    var string2: String = ""
    var index: Int = 0

    //declare Unique characters variable as SET to combine duplicate values
    var string1Unique:HashSet<Char> = hashSetOf()
    var string2Unique:HashSet<Char> = hashSetOf()

    logger.info { "Enter first String: " }
    string1 = readln()
    logger.info { "Enter second String: " }
    string2 = readln()

    do {
        if (string1[index].uppercase() !in string2.uppercase()) {
            string1Unique.add(string1[index])
        }
        index++
    }while(index < string1.length)

    index = 0 //assign index to 0 to be used for another loop

    do {
        if (string2[index].uppercase() !in string1.uppercase()) {
            string2Unique.add(string2[index])
        }
        index++
    }while(index < string2.length)

    logger.info { "Unique elements in the first string: $string1Unique" }
    logger.info { "Unique elements in the second string: $string2Unique" }

}