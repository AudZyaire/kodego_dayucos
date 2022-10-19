/**
 * Create an application that will accept 1 string.
 * Your application will print “Palindrome” if the string is a palindrome.
 */

package Activity_01_G
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {

    print("Enter a string: ")
    var string1 = readln()
/* Using reversed() function
    if (string1.uppercase() == string1.reversed().uppercase()) {
        logger.info { "$string1 is a palindrome." }
    } else {
        logger.info { "$string1 is not a palindrome" }
    }
    logger.info { "$string1 in reverse is ${string1.reversed()}" }
 */
    //using loops
    var index:Int = string1.lastIndex  //assign the last index of string1 to index
    var reversed: String = ""

    for (i in string1.indices) {
        reversed += string1[index] //assigning every character to reversed variable from the last index to index 0
        index--
    }

    if (string1.uppercase() == reversed.uppercase()) {
        logger.info { "$string1 is a palindrome." }
    } else {
        logger.info { "$string1 is not a palindrome" }
    }
    logger.info { "$string1 in reverse is $reversed" }
}

