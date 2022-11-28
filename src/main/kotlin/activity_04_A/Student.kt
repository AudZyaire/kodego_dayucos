package activity_04_A

//
//2. Update the searchStudentWildSearch to search for the wild string in the
// lastname, middle name, and firstname. Return the Arraylist of students that match the searched
// string, if there are no entries return an emptry ArrayList.
//


//1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
class Student(
    var firstName: String = "",
    var lastName: String = "",
    var nickName: String = "",
    var id: Int = 0,
    var year: Int = 0,
)

//2. Update the searchStudentWildSearch to search for the wild string in the
// lastname, middle name, and firstname. Return the Arraylist of students that match the searched
// string, if there are no entries return an empty ArrayList.

//3. Add a function searchStudentWildSearch that will accept a string and either of the following values,
// lastname, middlename, nickname. This will search the specific wild string depending where it was mentioned
// to be searched for. Return the Arraylist of students that match the searched string, if there are no entries
// return an emptry ArrayList.

fun searchStudentWildSearch(studentToSearch: String, studentList: ArrayList<Student>) {
    var foundNames: ArrayList<Student> = arrayListOf()
    if (studentToSearch.length < 4) {
        println("Search from:")
        println("A: First Names")
        println("B: Nick Names")
        println("C: Last Names")
        println("D: All Fields")
        var choice = readln().uppercase()
        when (choice) {
            "A" -> println("Searching from First Names...")
            "B" -> println("Searching from Nick Names...")
            "C" -> println("Searching from Last Names...")
            "D" -> println("Searching from All Entries...")
        }

        for (name in studentList) {
            when (choice) {
                "A" -> {
                    if (name.firstName.uppercase().contains(studentToSearch.uppercase())) {
                        foundNames.add(name)
                    }
                }

                "B" -> {
                    if (name.nickName.uppercase().contains(studentToSearch.uppercase())) {
                        foundNames.add(name)
                    }

                }

                "C" -> {
                    if (name.lastName.uppercase().contains(studentToSearch.uppercase())) {
                        foundNames.add(name)
                    }

                }

                "D" -> {
                    if (name.firstName.uppercase().contains(studentToSearch.uppercase()) || name.nickName.uppercase()
                            .contains(studentToSearch.uppercase()) || name.lastName.uppercase()
                            .contains(studentToSearch.uppercase())
                    ) {
                        println("Searching from all fields...")
                        foundNames.add(name)
                    }
                }

                else -> {
                    println("Error")

                }

            }
        }

    } else {
        println("Invalid length")
    }
    if (foundNames.size != 0) {
        for (name in foundNames) {
            println("Found: ${name.firstName} \"${name.nickName}\" ${name.lastName}")
        }
    } else {
        println("Found nothing")
    }
}

fun main() {
    var student1 = Student("Juan", "Dela Cruz", "JD")
    var student2 = Student("Stephen", "Hawkings", "Steph")
    var studentList: ArrayList<Student> = arrayListOf(student1, student2)
    searchStudentWildSearch("a", studentList)

}