package activity_04_B

import java.util.*
import kotlin.collections.ArrayList

//1. Use class to represent the Book rather string.
//A book has a title, authors, year published, edition, ISBN, publisher.
//A book may have a list of chapters.
//A book has a number of pages.

fun main() {
    var author1 = Author("George","Martin")
    var author2 = Author("Stephen","Hawkings")
    var author3 = Author("Juan","Dela Cruz")
    var book1 = Book("A Brief History of Time",author1)
    var book2 = Book("A Song of Ice and Fire",author1)
    var book3 = Book("Psychology 101", author3)
    var bookList : ArrayList<Book> = arrayListOf(book1, book2,book3)

    var magazine1 = Magazine(author = author3, title = "Top 10 things to do before 30")
    var magazine2 = Magazine(author = author2, title = "Top 5 things you need to do to work faster")
    var magazineList: ArrayList<Magazine> = arrayListOf(magazine1,magazine2)

    var comicList: ArrayList<Comic> = arrayListOf()
    var newsPaperList: ArrayList<Newspaper> = arrayListOf()

    searchByAuthor("Juan Dela Cruz",magazineList,newsPaperList,comicList,bookList)
    searchTitle("A Brief History of Time",magazineList,newsPaperList,comicList,bookList)



}
open class LibraryItems(){
    open var reserved: Boolean = false
    open var internalUse : Boolean = false
    open var itemForFixing : Boolean = false

}
open class Book(
    var title: String = "",
    var author: Author = Author(),
    var yearPublished: Date = Date(),
    var edition: Int = 0,
    var isbn: Int = 0,

): LibraryItems()

//2. Add a class for magazines.
//A magazine has an editor, a title, a month published, a year published
//A Newspaper, and magazine have articles.
open class Magazine(
    var editor: String = "",
    var author: Author = Author(),
    var title: String = "",
    var monthPublished: Date = Date(),
    var yearPublished: Date = Date(),
    var article: Article = Article(),
): LibraryItems()

//3. Add a class for newspaper.
//A newspaper has a name, day published, month published, year published and headline.
//A Newspaper, and magazine have articles.
open class Newspaper(
    var name: String = "",
    var author: Author = Author(),
    var dayPublished: Date = Date(),
    var monthPublished: Date = Date(),
    var yearPublished: Date = Date(),
    var headline: String = "",
    var article: Article = Article(),
): LibraryItems()

//4. Add a class Authors.
//Authors have firstName, lastName, middleName, date of birth.
class Author(
    var firstName: String = "",
    var lastName: String = "",
    var dateOfBirth: Date = Date(),
) {
}

//5. Add a class Comics.
//A comic has a title, month published, year published, illustrators, publisher.
open class Comic(
    var title: String = "",
    var author: Author = Author(),
    var monthPublished: Date = Date(),
    var illustrators: Illustrator = Illustrator(),
    var publisher: Publisher = Publisher(),
): LibraryItems()

//Create a class illustrator.
//Illustrator have firstName, lastName, middleName, date of birth.
class Illustrator(
    var firstName: String = "",
    var lastName: String = "",
    var middleName: String = "",
    var dateOfBirth: Date = Date(),
)

//6. Add a class Article.
//An article has a title, content, author.
class Article(
    var title: String = "",
    var content: String = "",
    var author: Author = Author(),
)


//7. Create a search function to search for the title of a magazine, newspaper, comics.
fun searchTitle(titleToSearch: String, magazines: ArrayList<Magazine>, newspapers: ArrayList<Newspaper>, comics: ArrayList<Comic>, books: ArrayList<Book>) {
    println("Searching by title...")
    for (magazine in magazines) {
        if (magazine.title.uppercase() == titleToSearch.uppercase()){
            println("${magazine.title} magazine found and is authored by: ${magazine.author.firstName}  ${magazine.author.lastName}")
        }
    }
    for (newspaper in newspapers) {
        if (newspaper.headline.uppercase() == titleToSearch.uppercase()){
            println("${newspaper.headline} headline found in News Papers and is authored by: ${newspaper.author.firstName}  ${newspaper.author.lastName}")
        }
    }
    for (comic in comics) {
        if (comic.title.uppercase() == titleToSearch.uppercase()){
            println("${comic.title} comic found and is authored by: ${comic.author.firstName}  ${comic.author.lastName}")
        }
    }
    for (book in books) {
        if (book.title.uppercase() == titleToSearch.uppercase()){
            println("${book.title} book found and is authored by: ${book.author.firstName}  ${book.author.lastName}")
        }
    }
}

//8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.
fun searchByAuthor(author: String, magazines: ArrayList<Magazine>, newspapers: ArrayList<Newspaper>, comics: ArrayList<Comic>, books: ArrayList<Book>) {
   println("Searching by author...")
    for (magazine in magazines) {
        if (magazine.author.firstName.uppercase() + " " + magazine.author.lastName.uppercase() == author.uppercase()){
            println("${magazine.title} magazine is authored by: $author")
        }
    }

    for (newspaper in newspapers) {
        if (newspaper.author.firstName.uppercase() + " " + newspaper.author.lastName.uppercase() == author.uppercase()){
            println("${newspaper.headline} is authored by: $author")
        }
    }

    for (comic in comics) {
        if (comic.author.firstName.uppercase() + " " + comic.author.lastName.uppercase() == author.uppercase()){
            println("${comic.title} is authored by: $author")
        }
    }
    for (book in books) {
        if (book.author.firstName.uppercase() + " " + book.author.lastName.uppercase() == author.uppercase()){
            println("${book.title} is authored by: $author")
        }
    }
}

//9. Create a class for Audio / Video recording.
//The class should show whether the recording has a video or audio or both.
//It has a length, date recorded, title, publisher.
class AudioOrVideoRecording(
    var audio: Boolean = false,
    var video: Boolean = false,
    var audioAndVideo: Boolean = false,
    var length: Int = 0,
    var dateRecorded: Date = Date(),
    var title: String = "",
    var published: Publisher = Publisher(),
)


//10. Create a Publisher class.
//A publisher a name, address and date established.
open class Publisher(
    var name: String = "",
    var address: String = "",
    var dateEstablished: Date = Date(),
) {
}