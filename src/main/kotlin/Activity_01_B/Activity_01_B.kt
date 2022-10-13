import java.util.Date

fun main() {
    /*
    ---Activity 01 - B---
You are tasked to automate a school’s library.

Identify the items that can be borrowed in a Library.

After listing the different items, identify the characteristics of the items.

Use the proper data types.
//Items that can be borrowed in a Library
A. Books
	a.1 isbn: Int
	a.2 bookIdNumber: Int
	a.3 bookAuthor: String
	a.4 bookTitle: String
	a.5 publicationDate: String
	a.6 bookCategory: String
	a.7 totalQuantityOfBook: Int
	a.8 isBorrowed:Boolean
		a.8.1 quantityBorrowed: Int
		a.8.2 borrowerName: String
		a.8.3 borrowerIdNumber: Int
		a.8.4 borrowedDate: String
		a.8.5 dateNeedToBeReturned: String
	a.9 quantityInLibrary: Int
	a.10 bookAisle: String
	a.11 dateAcquired: String

B. Screen Projector
	b.1 projectorIdNumber: Int
	b.2 brand: String
	b.3 isBorrowed: Boolean
		b.3.1 quantityBorrowed: Int
		b.3.2 borrowerName: String
		b.3.3 borrowerIdNumber: Int
		b.3.4 borrowedDate: String
		b.3.5 dateNeedToBeReturned: String
	b.4 dateAcquired:String
	b.5 quantityInLibrary: Int
	b.6 totalQuantityBorrowed: Int
	b.7 totalQuantityOfProjector: Int

C. Board Games
	c.1 boardGameName: String
	c.2 boardGameIdNumber: Int
	c.3 isBorrowed: Boolean
		c.3.1 quantityBorrowed: Int
		c.3.2 borrowerName: String
		c.3.3 borrowerIdNumber: Int
		c.3.4 borrowedDate: String
		c.3.5 dateNeedToBeReturned: String
	c.4 dateAcquired: String
	c.5 quantityInLibrary: Int
	c.6 totalQuantityBorrowed: Int
	c.7 totalQuantityOfBoardGames: Int
D. Musical Instruments
	d.1 typeOfInstrument: String
	d.2 idNumberOfInstrument: Int
	d.3 isBorrowed: Boolean
		d.3.1 quantityBorrowed: Int
		d.3.2 borrowerName: String
		d.3.3 borrowerIdNumber: Int
		d.3.4 borrowedDate: String
		d.3.5 dateNeedToBeReturned: String
	d.4 dateAcquired: String
	d.5 quantityInLibrary: Int
	d.6 totalQuantityBorrowed: Int
	d.7 totalQuantityOfInstrument: Int
     */
    //books
    var isbn: Int
    var bookIdNumber: Int
    var bookAuthor: String
    var bookTitle: String
    var publicationDate: Date
    var bookCategory: String
    var totalQuantityOfBook: Int
    var isBorrowed:Boolean
    var quantityBorrowedBook: Int
    var borrowerNameBook: String
    var borrowerIdNumberBook: Int
    var borrowedDateBook: Date
    var dateNeedToBeReturnedBook: Date
    var quantityInLibraryBook: Int
    var bookAisle: String
    var dateAcquiredBook: String

    // Screen Projector
    var projectorIdNumber: Int
    var brand: String
    var isBorrowedScreenProj: Boolean
    var quantityBorrowedScreenProj: Int
    var borrowerNameScreenProj: String
    var borrowerIdNumberScreenProj: Int
    var borrowedDateScreenProj: String
    var dateNeedToBeReturnedScreenProj: String
    var dateAcquiredScreenProj:String
    var quantityInLibraryScreenProj: Int
    var totalQuantityBorrowedScreenProj: Int
    var totalQuantityOfProjector: Int

    // Board Games
    var boardGameName: String
    var boardGameIdNumber: Int
    var isBorrowedBGames: Boolean
    var quantityBorrowedBGames: Int
    var borrowerNameBGames: String
    var borrowerIdNumberBGames: Int
    var borrowedDateBGames: String
    var dateNeedToBeReturnedBGames: String
    var dateAcquiredBGames: String
    var quantityInLibraryBGames: Int
    var totalQuantityBorrowedBGames: Int
    var totalQuantityOfBoardGames: Int

    // Musical Instruments
    var typeOfInstrument: String
    var idNumberOfInstrument: Int
    var isBorrowedMusic:Boolean
    var quantityBorrowed:Int
    var borrowerName:String
    var borrowerIdNumber:Int
    var borrowedDate:String
    var dateNeedToBeReturned:String
    var dateAcquired:String
    var quantityInLibrary:Int
    var totalQuantityBorrowed:Int
    var totalQuantityOfInstrument: Int
}