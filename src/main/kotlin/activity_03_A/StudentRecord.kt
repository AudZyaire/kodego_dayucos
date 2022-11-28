package activity_03_A
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}


fun main() {
    var studentNames: ArrayList<String> = arrayListOf("Marco", "Eugene", "Sarah", "Isiah", "Anthony",
                                                      "Henry", "Marc", "Mark", "Arssen", "Jane",
                                                      "Stephen", "Arnel", "Marx", "Jessy", "Brim",
                                                       "Viper", "Jett", "Gereon", "Charlotte", "Toni")

    var choice: String
    var continueProgram: String
do {
    do {
        var exit: Boolean = false
        logger.info { "1. Check Student Record" }
        logger.info { "2. Add Student" }
        logger.info { "3. Remove Student" }
        logger.info { "4. Count Students in the record" }
        logger.info { "5. Search Student Wild Card" }
        logger.info { "6. Search Student Name" }
        logger.info { "7. Search Student" }
        logger.info { "8. Show Student" }
        logger.info { "Enter a number: " }
        choice = readln()
    } while(choice.toIntOrNull() == null)

        if (choice.toIntOrNull() != null) {
           // println("Do this code")

            when (choice.toInt()) {
                1 -> {
                    var x = isStudentInRecord(studentNames)
                    logger.info { x }
                }

                2 -> addStudent(studentNames)
                3 -> removeStudent(studentNames)
                4 -> countStudent(studentNames)
                5 -> {
                    logger.info { "Enter name: " }
                    var name = readln()
                    searchStudentWildSearch(name, studentNames)
                }

                6 -> {
                    logger.info { "Enter name: " }
                    var name = readln()
                    searchStudentName(name, studentNames)
                }

                7 -> {
                    logger.info { "Enter name: " }
                    var name = readln()
                    searchStudent(name, studentNames)
                }

                8 -> showStudents(studentNames)
                else -> {
                    logger.info { "Your Choice is not in the list.." }
                }
            }

        }
    logger.info { "Do you want to continue using the program? Enter Y to continue. " }
    continueProgram = readln().uppercase()
} while (continueProgram == "Y" )

}

fun isStudentInRecord (record:ArrayList<String>) : Boolean {
    logger.info{"Enter name: "}
    var name = readln()
    for (i in record) {
        if (name.uppercase() == i.toString().uppercase()) {
            return true
        }
    }
    return false
}

fun addStudent(record:ArrayList<String>) {
    logger.info{"Enter name: "}
    var name = readln()
    record.add(name)
    logger.info { "Name Successfully Added" }
}

fun removeStudent(record: ArrayList<String>) {
    logger.info{"Enter name: "}
    var name = readln()
    var found = 0
    for (i in 0 ..record.lastIndex) {
        if (name.uppercase() == record[i].uppercase()) {
            found = 1
            logger.info{"${record[i]} is successfully removed "}
            record.removeAt(i)
            break

        } else {
            found = 0
        }
    }
    if (found == 0) {
        logger.info { "Found no match in the record." }
    }

}

fun countStudent(record: ArrayList<String>) {
    var count = record.lastIndex + 1
    logger.info{"There are $count students in the list."}
}


fun searchStudentWildSearch (name: String, record: ArrayList<String>) {
    for (i in record) {
        if (i.uppercase().contains(name.uppercase())) {
            logger.info { "Found: $i" }
        }
    }
}

fun searchStudentName(name: String, record: ArrayList<String>) {
    for (i in record) {
        if (name == i) {
            logger.info{"Found: $i"}
        }
    }
}

fun searchStudent (name: String, record: ArrayList<String>): String {
    if (name.length > 3) {
        logger.info{"Deploying searchStudentName Function"}
        searchStudentName(name, record)
    } else {
        logger.info{"Deploying searchStudentWildCard Function"}
        searchStudentWildSearch(name, record)
    }
    return name
}

fun showStudents (record: ArrayList<String>) {
    for (i in record) {
        logger.info{i}
    }
}

