package activity_06_B

import activity_04_B.LibraryItems
import activity_05_A_OOP.Person
import activity_05_B_OOP.*
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

//Create a function that will accept an item in the library and person
// who will borrow the item, (Use classes in Activity 05 - B).

//Throw the following exceptions :

//1. if the user still has 5 or more items from the library - Cannot
// borrow due to too many items still borrowed
//
//2. if the user has unpaid dues - Cannot borrow Exception due to unpaid dues
//
//3. if the item being borrowed has been reserved - Cannot borrow due to reserved
//
//4. it the item is for internal use - Cannot borrow due to item only used in library
//
//5. if the item if for fixing - Cannot borrow due to item needs to be fixed
//
//
//You will need to add the remaining classes and add the remaining methods
// and attributes in order to implement the functionalities.

class BorrowedItemsLimitException(message: String = "Can't borrow - items borrowed exceeded the limit") :
    Exception(message)

class UnpaidDuesException(message: String = "Borrower has unpaid dues!") : Exception(message)
class ItemReservedException(message: String = "Item is reserved!") : Exception(message)
class ItemInternalUseException(message: String = "Item is for internal use!") : Exception(message)
class ItemForFixingException(message: String = "Item needs to be fixed!") : Exception(message)

class User(
    firstName: String = "",
    middleName: String = "",
    lastName: String = "",
    address: String = "",
    birthDay: Date = Date()
) : Person(firstName, middleName, lastName, address, birthDay) {
    var borrowedItems: ArrayList<LibraryItems> = arrayListOf()
    var unpaidDues: Int = 0


}


fun main() {

    var book1 = Book("Psychology 101", reserved = true)
    var book2 = Book("History")
    var book3 = Book("Book3")
    var magazine1 = Magazine(title = "Magazine1", itemForFixing = true)
    var magazine2 = Magazine(title = "Magazine2")
    var magazine3 = Magazine(title = "Magazine3", internalUse = true)
    var comic1 = Comic(title = "Comic1")
    var comic2 = Comic(title = "Comic2", internalUse = true)
    var comic3 = Comic(title = "Comic3")
    var newsPaper1 = NewsPaper(name = "Newspaper1")
    var newsPaper2 = NewsPaper(name = "Newspaper2")
    var newsPaper3 = NewsPaper(name = "Newspaper3")
    var libraryItems: ArrayList<LibraryItems> =
        arrayListOf(
            book1, book2, book3, magazine1, magazine2, magazine3, comic1, comic2, comic3,
            newsPaper1, newsPaper2, newsPaper3
        )
    var user1 = User("Juan", lastName = "Dela Cruz")
    user1.unpaidDues = 0
    var user2 = User("Bill", lastName = "Clinton")
    user2.unpaidDues = 0

    borrowItem(magazine2, user1, libraryItems)
    borrowItem(book2, user1, libraryItems)
    borrowItem(book3, user1, libraryItems)
    borrowItem(magazine2, user1, libraryItems)
    borrowItem(magazine2, user1, libraryItems)
    borrowItem(comic3, user1, libraryItems)
    borrowItem(comic1, user1, libraryItems)
}

fun borrowItem(itemToBorrow: LibraryItems, borrower: User, fromWhatLibrary: ArrayList<LibraryItems>) {
    if (fromWhatLibrary.contains(itemToBorrow)) {
        if (borrower.borrowedItems.size > 5)
            throw BorrowedItemsLimitException()
        if (borrower.unpaidDues > 0)
            throw UnpaidDuesException()
        if (itemToBorrow.reserved)
            throw ItemReservedException()
        if (itemToBorrow.internalUse)
            throw ItemInternalUseException()
        if (itemToBorrow.itemForFixing)
            throw ItemForFixingException()

        borrower.borrowedItems.add(itemToBorrow)
    } else {
        println("Item does not exist in our database")
    }


}