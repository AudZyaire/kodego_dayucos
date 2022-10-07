package exercise_1

class Main {
}
    fun main() {

        /* var fName:String?=null
        var lName:String?=null
        var mName:String?=null */
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
        /*print("Age: ")
        age = readln()
        if (age.toIntOrNull()!= null)
            print("It's a number! ")
        else
            print("Not a number") */
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


    }

