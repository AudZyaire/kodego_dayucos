package exercise_1
import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

    fun main() {

        var positionApply:String? = null
        var dateAvailForWork = LocalDate.parse("")
        var dateFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy")
        var formattedWorkStartDate = dateAvailForWork.format(dateFormatter)
        var desiredSalary:Double? = null
        var lastName:String? = null
        var firstName:String? = null
        var middleName:String? = null
        var age:Int? = null
        var birthDate:String? = null
        var address:String? = null
        var city:String? = null
        var state:String? = null
        var zip:String? = null
        var homePhone:String? = null
        var cellPhone:String? = null
        var emailAddress:String? = null
        var socialSecurityNumber:String? = null
        var usCitizen:Boolean? = null
        var convictedOfAFelony:Boolean? = null
        var submitDrugScreen:Boolean? = null
        var schoolName1:String? = null
        var schoolLocation1:String? = null
        var yearsAttended1:Int? = null
        var degreeReceived1:String? = null
        var major1:String? = null
        var schoolName2:String? = null
        var schoolLocation2:String? = null
        var yearsAttended2:Int? = null
        var degreeReceived2:String? = null
        var major2:String? = null
        var schoolName3:String? = null
        var schoolLocation3:String? = null
        var yearsAttended3:Int? = null
        var degreeReceived3:String? = null
        var major3:String? = null



/*
        var age: String
        //Ask user for input

        do {
            println("--------APPLICATION FOR EMPLOYMENT--------")
            print("Position You're Applying For: ")
            var position = readln()
            print("Desired Salary: ")
            var salary = readln()
            print("Date Available for Work: ")
            var dateAvailable = readln()
        } while (position == "" || salary == "" || dateAvailable == "")  //loop until these vars are not empty
        do {
            println("  ------Personal Information------")
            print("First Name: ")
            var fName = readLine()
            print("Last Name: ")
            var lName = readLine()
            print("Middle Name: ")
            var mName = readLine()
        } while (fName == "" || lName == "" || mName == "")

        do {
            println("-----Enter a valid number-----")
            print("Age: ")
            age = readln()
        } while (age.toIntOrNull() == null) //loop until user input a valid Integer
        val agerange = 0..17
        if ((age.toInt() in agerange) == true) { //check if user input age is within the agerange
            print("You need to be 18+ to be able to apply")
        } else //if age is not in range do the rest of the application form
        {
            do {
                println("-----Mailing Address-----")
                print("Enter Address: ")
                var address = readLine()
                print("Enter City: ")
                var city = readLine()
                print("Enter State: ")
                var state = readLine()
                print("Enter Zip: ")
                var zip = readLine()
            } while (address == "" || city == "" || state == "" || zip == "")
            do {
                println("-----Contact Information-----")
                print("Enter Home Phone: ")
                var homePhone = readLine()
                print("Enter Cell Phone: ")
                var cellPhone = readLine()
                print("Enter E-mail Address: ")
                var email = readLine()
                print("Enter Social Security Number: ")
                var sss = readLine()
            } while (homePhone == "" || cellPhone == "" || email == "" || sss == "")
            do {
                print("Have you ever been convicted of a felony?: Y or N: ")
                var convict: String? = readLine()
                println(convict!!.uppercase())
            } while ((convict!!.uppercase() != "Y") and (convict!!.uppercase() != "N"))
            do {
                print("If selected for employment are you willing to submit to a pre-employment drug screening test? Y or N: ")
                var drugTest: String? = readln()
            } while ((drugTest?.uppercase() != "Y") and (drugTest?.uppercase() != "N"))


            do {
                println("  -----Education------")
                print("School Name: ")
                var school = readln()
                print("School Location: ")
                var schoolLocation = readln()
                print("Years Attended: ")
                var yearsAttended = readln()
                print("Degree Received: ")
                var degree = readln()
                print("Major: ")
                var major = readln()

            } while (school == "" || schoolLocation == "" || yearsAttended == "" || degree == "" || major == "")
            println("Thanks for applying, expect a call or an email from us for an interview")
        }
        */
    }

