
/**
 * Create an application that will accept 2 string inputs.
 * Your application will print all unique characters in both Strings.
 */

package activity_01_F

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {

    var string1: String = ""
    var string2: String = ""
    var string1Unique: String = ""
    var string2Unique: String = ""
    var string1NoDupe: String = ""
    var string2NoDupe: String = ""
    var uniqueCombined: String = ""
    var uniqueCombinedFormat: String = ""
    var counter = 0

    logger.info { "Enter first String: " }
    string1 = readln()
    logger.info { "Enter second String: " }
    string2 = readln()

//compare string1 elements to itself, store to string1Unique if no duplicate
    for (characters in string1) {
        for (characterCompare in string1) {
            if (characters.uppercase() == characterCompare.uppercase()) {
                counter++
            }
        }
        if (counter < 2) {
            // println("$characters is unique")
            string1Unique += characters
        }
        counter = 0
    }
    counter = 0
    //compare string2 elements to itself, store to string2Unique if no duplicate
    for (characters in string2) {
        for (characterCompare in string2) {
            if (characters.uppercase() == characterCompare.uppercase()) {
                counter++
            }
        }
        if (counter < 2) {
            // println("$characters is unique")
            string2Unique += characters
        }
        counter = 0
    }
    counter = 0

    //compare string1Unique characters to string2
    for (characters in string1Unique) {
        for (char in string2) {
            if (characters.uppercase() == char.uppercase()) {
                counter++
            }
        }
        if (counter == 0) {
            string1NoDupe += characters
        }
        counter = 0
    }
    counter = 0

    //comparing string2Unique characters to string1
    for (characters in string2Unique) {
        for (char in string1) {
            if (characters.uppercase() == char.uppercase()) {
                counter++
            }
        }
        if (counter == 0) {
            string2NoDupe += characters
        }
        counter = 0

    }
        logger.info { "Removing duplicates..." }
//        logger.info { "Unique elements in the first string: $string1NoDupe" }
//        logger.info { "Unique elements in the second string: $string2NoDupe" }
    uniqueCombined = string1NoDupe + string2NoDupe
    //added formatting to the unique characters
    for (i in uniqueCombined) {
        uniqueCombinedFormat += "[ $i ]"
    }
    logger.info { "There are ${uniqueCombined.length} unique characters in both strings" }
    logger.info { "Unique from both strings are: $uniqueCombinedFormat" }
}