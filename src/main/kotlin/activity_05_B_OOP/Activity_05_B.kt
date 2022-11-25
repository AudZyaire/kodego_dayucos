package activity_05_B_OOP

import activity_04_B.Article
import activity_04_B.Author
import activity_04_B.Publisher
import activity_05_A_OOP.Person
import java.util.*

//1. A book, a magazine, a newspaper and comics inherits from a Publication class.
// Identify the attributes and the methods for the publication.

open class Publication(
    var publisher: Publisher = Publisher(),
    var datePublished: Date = Date(),
    var hasDigitalCopy: Boolean = false,
    var hasPrintedCopy: Boolean = false,
    var typeOfPayment: TypeOfPayment = TypeOfPayment.UNKNOWN,
)

enum class TypeOfPayment {
    FLAT_FEE,
    ROYALTIES,
    ADVANCE_AGAINST_ROYALTIES,
    UNKNOWN
}

class Book(
    publisher: Publisher,
    datePublished: Date,
    hasDigitalCopy: Boolean,
    hasPrintedCopy: Boolean,
    typeOfPayment: TypeOfPayment,
) : Publication(publisher, datePublished, hasDigitalCopy, hasPrintedCopy, typeOfPayment) {
}

class Magazine(
    publisher: Publisher,
    datePublished: Date,
    hasDigitalCopy: Boolean,
    hasPrintedCopy: Boolean,
    typeOfPayment: TypeOfPayment,
) : Publication(publisher, datePublished, hasDigitalCopy, hasPrintedCopy, typeOfPayment) {
}

class Newspaper(
    publisher: Publisher,
    datePublished: Date,
    hasDigitalCopy: Boolean,
    hasPrintedCopy: Boolean,
    typeOfPayment: TypeOfPayment,
) : Publication(publisher, datePublished, hasDigitalCopy, hasPrintedCopy, typeOfPayment) {
}

class Comics(
    publisher: Publisher,
    datePublished: Date,
    hasDigitalCopy: Boolean,
    hasPrintedCopy: Boolean,
    typeOfPayment: TypeOfPayment,
) : Publication(publisher, datePublished, hasDigitalCopy, hasPrintedCopy, typeOfPayment) {
}

//2. There are several Audio / Video materials, Recordings, Documentary, Movies and powerpoint materials.
//What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
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

open class Illustrators(firstName: String, middleName: String, lastName: String, address: String, birthDay: Date) :
    Person(firstName, middleName, lastName, address, birthDay)