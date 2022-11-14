package activity_04_B

import java.util.*

//1. Use class to represent the Book rather string.
//A book has a title, authors, year published, edition, ISBN, publisher.
//A book may have a list of chapters.
//A book has a number of pages.

fun main() {
    val x = Magazine()
    val y = Newspaper()
    val z = Comic()
    val a = Book()
    x.title = "Magazine by Joni"
    y.headline = "sample"
    z.title = "sample"
    x.author.firstName = "Joni"
    x.author.lastName = "Dayucos"
    searchTitle("sample",x,y,z)
    searchByAuthor("Joni Dayucos",x,y,z,a)
}

class Book(
    var title: String = "",
    var author: Author = Author(),
    var yearPublished: Int = 0,
    var edition: Int = 0,
    var isbn: Int = 0,
    var publisher: String = "",
)

//2. Add a class for magazines.
//A magazine has an editor, a title, a month published, a year published
//A Newspaper, and magazine have articles.
class Magazine(
    var editor: String = "",
    var author: Author = Author(),
    var title: String = "",
    var monthPublished: Date = Date(),
    var yearPublished: Date = Date(),
    var article: Article = Article(),
)

//3. Add a class for newspaper.
//A newspaper has a name, day published, month published, year published and headline.
//A Newspaper, and magazine have articles.
class Newspaper(
    var name: String = "",
    var author: Author = Author(),
    var dayPublished: Date = Date(),
    var monthPublished: Date = Date(),
    var yearPublished: Date = Date(),
    var headline: String = "",
    var article: Article = Article(),
)

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
class Comic(
    var title: String = "",
    var author: Author = Author(),
    var monthPublished: Date = Date(),
    var illustrators: Illustrator = Illustrator(),
    var publisher: Publisher = Publisher(),
)

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
fun searchTitle(titleToSearch: String, magazine: Magazine, newsPaper: Newspaper, comic: Comic) {
    var title = ""
        //magazine search
    for (item in magazine.title) {
        title+= item
        }
    if (title == titleToSearch) {
        println("Found $title in magazines" )
    }
    title = ""
    //newspaper search
    for (item in newsPaper.headline) {
        title+= item
    }
    if (title == titleToSearch) {
        println("Found $title in newspapers" )
    }
    title = ""
    //comic search
    for (item in comic.title) {
        title+= item
    }
    if (title == titleToSearch) {
        println("Found $title in comics" )
    }
}

//8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.
fun searchByAuthor (author: String, magazine: Magazine, newspaper: Newspaper, comic: Comic, book: Book) {
    if (author == magazine.author.firstName + " " + magazine.author.lastName) {
        println(magazine.title)
    }
    if (author == newspaper.author.firstName + " " + newspaper.author.lastName) {
        println(newspaper.headline)
    }
    if (author == comic.author.firstName + " " + comic.author.lastName) {
        println(comic.title)
    }
    if (author == book.author.firstName + " " + book.author.lastName) {
        println(book.title)
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
class Publisher(
    var name: String = "",
    var address: String = "",
    var dateEstablished: Date = Date(),
)