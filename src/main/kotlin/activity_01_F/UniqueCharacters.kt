/**
 * Create an application that will accept 2 string inputs.
 * Your application will print all unique characters in both Strings.
 */

package activity_01_F

import mu.KotlinLogging
import java.nio.charset.Charset

private val logger = KotlinLogging.logger {}

fun main() {
    logger.info { "Input first string: " }
    var string1 = readln()
    logger.info { "Input second string: " }
    var string2 = readln()
    var concatenated = string1 + string2
    var unique : String = ""

    for(char in concatenated)
        if(!unique.contains(char))
            unique += char

    logger.info { "Unique: $unique" }
}