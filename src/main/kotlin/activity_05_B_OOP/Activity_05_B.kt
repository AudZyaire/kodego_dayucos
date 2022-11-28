package activity_05_B_OOP

import activity_04_B.*
import activity_04_B.Book
import activity_04_B.Comic
import activity_04_B.Magazine
import activity_05_A_OOP.Person
import java.util.*

//1. A book, a magazine, a newspaper and comics inherits from a Publication class.
//// Identify the attributes and the methods for the publication.

interface Publication {
    var publisherName: Publisher
    var datePublished: Date
    var hasDigitalCopy: Boolean
    var hasPrintedCopy: Boolean
    var typeOfPayment: TypeOfPayment
}


enum class TypeOfPayment {
    FLAT_FEE,
    ROYALTIES,
    ADVANCE_AGAINST_ROYALTIES,
    UNKNOWN
}

class Book(
    title: String = "",
    author: Author = Author(),
    yearPublished: Date = Date(),
    edition: Int = 0,
    isbn: Int = 0,
    reserved: Boolean = false,
    internalUse: Boolean = false,
    itemForFixing : Boolean = false
) : activity_04_B.Book(title, author, yearPublished, edition, isbn), Publication {
    override var publisherName: Publisher = Publisher()
    override var datePublished: Date = Date()
    override var hasDigitalCopy: Boolean = false
    override var hasPrintedCopy: Boolean = false
    override var typeOfPayment: TypeOfPayment = TypeOfPayment.UNKNOWN
    override var reserved = reserved
    override var internalUse = internalUse
    override var itemForFixing = itemForFixing


}

class Magazine(
    editor: String = "",
    author: Author = Author(),
    title: String = "",
    monthPublished: Date = Date(),
    yearPublished: Date = Date(),
    article: Article = Article(),
    reserved: Boolean = false,
    internalUse: Boolean = false,
    itemForFixing : Boolean = false
) : Magazine(editor, author, title, monthPublished, yearPublished, article), Publication {
    override var publisherName: Publisher = Publisher()
    override var datePublished: Date = Date()
    override var hasDigitalCopy: Boolean = false
    override var hasPrintedCopy: Boolean = false
    override var typeOfPayment: TypeOfPayment = TypeOfPayment.UNKNOWN
    override var reserved = reserved
    override var internalUse = internalUse
    override var itemForFixing = itemForFixing


}

class NewsPaper(
    name: String = "",
    author: Author = Author(),
    dayPublished: Date = Date(),
    monthPublished: Date = Date(),
    yearPublished: Date = Date(),
    headline: String = "",
    article: Article = Article(),
    reserved: Boolean = false,
    internalUse: Boolean = false,
    itemForFixing : Boolean = false
) : Newspaper(name, author, dayPublished, monthPublished, yearPublished, headline, article), Publication {
    override var publisherName: Publisher = Publisher()
    override var datePublished: Date = Date()
    override var hasDigitalCopy: Boolean = false
    override var hasPrintedCopy: Boolean = false
    override var typeOfPayment: TypeOfPayment = TypeOfPayment.UNKNOWN
    override var reserved = reserved
    override var internalUse = internalUse
    override var itemForFixing = itemForFixing

}

class Comic(
    title: String = "",
    author: Author = Author(),
    monthPublished: Date = Date(),
    illustrators: Illustrator = Illustrator(),
    reserved: Boolean = false,
    internalUse: Boolean = false,
    itemForFixing : Boolean = false
) : Comic(title, author, monthPublished, illustrators), Publication {
    override var publisherName: Publisher = Publisher()
    override var datePublished: Date = Date()
    override var hasDigitalCopy: Boolean = false
    override var hasPrintedCopy: Boolean = false
    override var typeOfPayment: TypeOfPayment = TypeOfPayment.UNKNOWN
    override var reserved = reserved
    override var internalUse = internalUse
    override var itemForFixing = itemForFixing

}

//2. There are several Audio / Video materials, Recordings, Documentary, Movies and powerpoint materials.
////What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
//Implement your answer in code.
enum class AVMaterials {
    RECORDINGS,
    DOCUMENTARY,
    MOVIES,
    POWERPOINT
}

//3. Authors and Illustrators seem to have similar data? What will you use to present the two a class or an enum or will you keep them as is? Why?
//Implement your answer in code.

class Authors(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Person(firstName, middleName, lastName, address, birthDay)

class Illustrators(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Person(firstName, middleName, lastName, address, birthDay)


fun main() {
    var maga1 = activity_05_B_OOP.Magazine(author = Author("Bill", "Clinton"), title = "Magazine for All")
    var book1 = activity_05_B_OOP.Book(author = Author("Stephen", "Hawkings"), title = "A Tour Around The Galaxy")
    maga1.datePublished = Date(2022)
    println(book1.hasPrintedCopy)
    var newsPaper1 = NewsPaper(name = "A day to remember")
    var comic1 = activity_05_B_OOP.Comic()

}