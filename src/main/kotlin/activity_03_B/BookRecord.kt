package activity_03_B

fun main() {
    //1. Create an ArrayList of bookname with 20 entries.
    var bookName: ArrayList<String> = arrayListOf(
        "Cinder", "Caraval", "Fairest", "Cinderella", "Insurgent",
        "Divergent", "Lore", "Verity", "Circe", "Allegiant",
        "Speak", "Stormbringer", "Lolita", "Island", "Kindred",
        "Dawn", "Dracula", "Vicious", "Cress", "Scarlet"
    )
searchBookWildSearch("cin", bookName)

}

//2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
fun isBookInRecord(searchBook: String, bookName: ArrayList<String>): Boolean {
    return bookName.contains(searchBook)
}

//3. Create a function "addBook" that will accept a String and add it to the ArrayList.
fun addBook(bookToAdd: String, bookName: ArrayList<String>) {
    bookName.add(bookToAdd)
}

//4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
fun removeBook(bookToRemove: String, bookName: ArrayList<String>) {
    bookName.remove(bookToRemove)
}

//5. Create a function "countBooks" that will return the size of the ArrayList.
fun countBooks(bookName: ArrayList<String>): Int {
    return bookName.size
}

//6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
fun searchBookWildSearch(bookToSearch: String, bookName: ArrayList<String>) {
    var booksFound = arrayListOf<String>()
    for (book in bookName) {
        if (bookToSearch.uppercase() == book.uppercase().subSequence(bookToSearch.indices) ){
            booksFound.add(book)
        }
    }
    for (book in booksFound) {
        println(book)
    }
}

//7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
fun searchBookName(bookToSearch: String, bookName: ArrayList<String>) {
    var booksFound = arrayListOf<String>()
    for (book in bookName) {
        if (bookToSearch == book) booksFound.add(book)
    }
    for (book in booksFound) println("Found: $book")
}

//8.  Create a function "showBooks" that will print all the entries in the ArrayList.
fun showBooks(bookName: ArrayList<String>) {
    println(bookName)
}