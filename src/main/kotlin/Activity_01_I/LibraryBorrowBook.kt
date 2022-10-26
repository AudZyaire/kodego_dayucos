package Activity_01_I
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
fun main() {
    var studentIDList: ArrayList<String> = arrayListOf()
    var lastNameList: ArrayList<String> = arrayListOf()
    var firstNameList: ArrayList<String> = arrayListOf()
    var bookTitleList: ArrayList<String> = arrayListOf()
    var dateBorrowedList: ArrayList<String> = arrayListOf()
    var dateReturnList: ArrayList<String> = arrayListOf()
    var dateTimeNow = LocalDateTime.now()
    var dateFormat1 = DateTimeFormatter.ofPattern("M/d/y H:m:ss")
    var daysBorrowed: String
    var lastName: String
    var firstName: String
    var dateBorrowed: String
    var dateReturn: String
    var yesNo = "y"
    var guiAnswer:String? = null
    var exitProgram = true

        do { //Show GUI
            //error handling
            do {
                logger.info { "-- Library System --" }
                logger.info { "1. Book Borrow" }
                logger.info { "2. Show Books Borrowed/ Borrower information" }
                logger.info { "3. Exit Program" }
                logger.info { "Enter a number to proceed:" }
                guiAnswer = readln()
                if (guiAnswer.toIntOrNull() == null)
                    logger.info { "Enter a valid choice." }
            } while (guiAnswer?.toIntOrNull() == null)
            if (guiAnswer.toInt() == 1) {

                do {
                    logger.info {"Enter Student ID: "}
                    var studId = readln()
                    logger.info {"Enter Last Name: "}
                    var lastName = readln()
                    logger.info {"Enter First Name: "}
                    var firstName = readln()
                    logger.info {"Enter Title: "}
                    var title = readln()
                    logger.info {"How long can it be borrowed?"}
                    //loop until daysBorrowed is an Integer
                    do {
                        logger.info {"Enter number of days: "}
                        daysBorrowed = readln()
                    }while (daysBorrowed.toIntOrNull()==null)

                    //add to arrays
                    studentIDList.add(studId)
                    lastNameList.add(lastName)
                    firstNameList.add(firstName)
                    bookTitleList.add(title)
                    dateBorrowed=dateTimeNow.format(dateFormat1)
                    dateBorrowedList.add(dateBorrowed)
                    dateReturn = dateTimeNow.plusDays(daysBorrowed.toLong()).format(dateFormat1)
                    dateReturnList.add(dateReturn)
                    do {
                        println("Another student wants to borrow? Y/N")
                        yesNo = readln()
                    }while (yesNo.uppercase() != "Y" && yesNo.uppercase() != "N")

                }while (yesNo.uppercase() == "Y")
                exitProgram = false
            } else if (guiAnswer.toInt() == 2) {
                logger.info { "-----------------------" }
                logger.info { "-- List of borrowers --" }
                for (i in studentIDList.indices) {
                    logger.info { "Student ID: ${studentIDList[i]}" }
                    logger.info { "Student's Name: ${lastNameList[i]}, ${firstNameList[i]}"}
                    logger.info {"Book Title: ${bookTitleList[i]}"}
                    logger.info {"Date Borrowed: ${dateBorrowedList[i]}"}
                    logger.info {"Date to be Returned: ${dateReturnList[i]} "}
                    logger.info {"-----------------------"}
                }
                exitProgram = false
            } else if (guiAnswer.toInt() == 3) {
                logger.info { "Program exits..." }
                exitProgram = true
            } else {
                exitProgram = false
                logger.warn { "Enter a valid choice." }
            }
        } while (exitProgram == false || guiAnswer?.toIntOrNull() == null)
}