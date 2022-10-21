package Activity_01_I

fun main() {
    var studentID: ArrayList<String> = arrayListOf()
    var bookId: ArrayList<Int> = arrayListOf()
    var bookTitle: ArrayList<String> = arrayListOf()

    do {
        println("Student is borrowing a book? Y/N")
        var yesNo = readln()

        if (yesNo == "y") {
            print("Enter Student ID: ")
            var studId = readln()
            print("Enter Title: ")
            var title = readln()
            studentID.add(studId)
            bookTitle.add(title)
        }
    }while (yesNo == "y")

    for (i in studentID.indices) {
        println("Student ID: ${studentID[i]}")
        println("Book Title: ${bookTitle[i]}")
        println("----")
    }
}