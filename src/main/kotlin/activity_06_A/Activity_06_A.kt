package activity_06_A

import activity_05_A_OOP.Student
import java.lang.Exception

fun checkGrades(student: Student) {
    if (student.grades.size > 10) {
        throw InvalidInput("Grades can't have more than 10 entries!")
    }
    if (student.grades.contains(0)) {
        throw IncompleteGrades("Incomplete Grades!")
    }

}

class InvalidInput(message: String) : Exception(message)
class IncompleteGrades(message: String) : Exception(message)