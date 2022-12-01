package activity_05_A_OOP

import activity_06_A.checkGrades
import java.util.Date
import kotlin.collections.ArrayList

fun main() {
    //student1
    var stud1 = CertificateStudent("John", "Bayani", "Dela Cruz","Lapu-Lapu",Date(1995))
    var stud1Grades = arrayListOf<Int>(90,89,92,75,23,50,43,23,50,22,23)
    for(grade in stud1Grades) {
        stud1.grades.add(grade)
    }
    println("Name: ${stud1.firstName} ${stud1.middleName} ${stud1.lastName}")
    println("Grades: $stud1Grades")

    //student2
    var stud2 = CertificateStudent("Bill", "Tan", "Clinton","Manila",Date(1995))
    var stud2Grades = arrayListOf<Int>(90,89,92,75,23,50,43,23,0,22)
    for(grade in stud2Grades) {
        stud2.grades.add(grade)
    }
    println("Name: ${stud2.firstName} ${stud2.middleName} ${stud2.lastName}")
    println("Grades: $stud2Grades")


        checkGrades(stud1)
        checkGrades(stud2)



}

//Create a person class with firstname, middlename, lastname, address and birthday.
open class Person {
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthDay: Date = Date()

    constructor()
    constructor(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) {
        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
        this.address = address
        this.birthDay = birthDay
    }
}

//Create a Student class that inherits the Person class. A student has a year he/she entered the school. A student has an ID.
open class Student(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Person(firstName, middleName, lastName, address, birthDay) {
    var grades: ArrayList<Int> = arrayListOf()
    var yearFirstAttended: Date = Date()
    var studentID: String = ""
    var status: Status = Status.UNKNOWN
}

//The Certificate Student has a list of short courses he or she has gotten.
//Example:
//Student 1, Computer Technician, Network Technician, Electrical Technician
//Student 2, Public Speaking, Debate, Advertising Article
class CertificateStudent(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Student(firstName, middleName, lastName, address, birthDay) {
    var shortCoursesTaken: ArrayList<String> = ArrayList()
}

//The Undergraduate Student has a list of college(s) he or she belongs to, there is a year he or she joined the college,
// there is a list degrees he or she is taking, there is a start and year of the degree, there is also different statuses.
//Example :
//Undergraduate Student 1,  College of Engineering, Bachelor of Interior Design, 2020(start), 2022(end)
//Note : end will only contain a value if he or she is done with the course
class UnderGraduateStudent(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Student(firstName, middleName, lastName, address, birthDay) {
    var college: ArrayList<College> = ArrayList()
    var degrees: ArrayList<Degree> = ArrayList()
}
//The Master Student has a list of college(s) he or she belongs to, there is a year he or she joined the college, and has name of the master degree he or she is getting.
class MasterStudent(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Student(firstName, middleName, lastName, address, birthDay) {
        var colleges: ArrayList<College> = ArrayList()
        var mastersDegree: Degree = Degree()
}

class GraduateStudent(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Student(firstName, middleName, lastName, address, birthDay) {

}

//A student has different statuses
//Status : Leave of Absence, Ongoing, Graduated, Will Begin, Unknown, Shifted,
//Create a CertificateStudent, UnderGraduateStudent, MasterStudent, and GraduateStudent.
enum class Status {
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    SHIFTED,
    UNKNOWN
}

class Degree(var degreeName: String = "", var startYear: Date = Date(), var endYear: Date? = Date(), var status: Status = Status.UNKNOWN) {
}
class College(var collegeName: String = "", var startYear: Date)