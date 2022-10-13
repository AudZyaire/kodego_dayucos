fun main() {
    /*
    Activity 01 - C
You are tasked to automate an inventory system for a grocery.

Identify the items that can be bought in a grocery store.

After listing the different items, identify the characteristics of the items.

You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.


Paper Products - toilet paper, paper towels, tissues, paper plates/cups, etc.
Cleaning Supplies - laundry detergent, dishwashing soap, disinfectant spray
Health & Beauty and Personal Care - shampoo, body soap, toothpaste
Beverage - alcoholic beverage, carbonated drinks
Produce: Fruits & Vegetables

A. Paper Products
	a.1 toiletPaper:String
		a.1.1 brandName: String
		a.1.2 productName: String
		a.1.3 price: Double
		a.1.4 sheetCount: Int
		a.1.5 plyCount: Int
		a.1.6 manufacturingDate: String
		a.1.7 expiryDate: String
	a.2 paperPlates:String
		a.2.1 brandName: String
		a.2.2 productName: String
		a.2.3 price: Double
		a.2.4 quantityPerPack: Int
		a.2.5 laminatedPaper: Boolean
		a.2.6 manufacturingDate: String
		a.2.7 expiryDate: String
B. Cleaning Supplies
	b.1 laundryDetergent: String
		b.1.1 brandName: String
		b.1.2 productName: String
		b.1.3 price: Double
		b.1.4 liquidOrPowder: String
		b.1.5 netWeight: Int
		b.1.6 manufacturingDate: String
		b.1.7 expiryDate: String
	b.2 dishwashingSoap: String
		b.2.1 brandName: String
		b.2.2 productName: String
		b.2.3 price: Double
		b.2.4 netVolume: Double
		b.2.5 manufacturingDate: String
		b.2.6 expiryDate: String
C. Health & Beauty and Personal Care
	c.1 shampoo: String
		c.1.1 brandName: String
		c.1.2 productname: String
		c.1.3 price: Double
		c.1.4 netVolume: Double
		c.1.5 forMenOrWomen: String
		c.1.6 manufacturingDate: String
		c.1.7 expiryDate: String
	c.2 toothpaste: String
		c.2.1 brandName: String
		c.2.2 productName: String
		c.2.3 price: Double
		c.2.4 netWeight: Int
		c.2.5 piecesPerPack: Int
		c.2.6 manufacturingDate: String
		c.2.7 expiryDate: String
D. Beverage
	d.1 alcoholicDrink: String
		d.1.1 brandName: String
		d.1.2 productName: String
		d.1.3 price: Double
		d.1.4 netVolume: Int
		d.1.5 alcoholContent: Int
		d.1.6 manufacturingDate: String
		d.1.7 expiryDate: String
	d.2 carbonatedDrink: String
		d.2.1 brandName: String
		d.2.2 productName: String
		d.2.3 price: Double
		d.2.4 netVolume: Int
		d.2.5 manufacturingDate: String
		d.2.6 expiryDate: String
     */
    // Paper Products
    var toiletPaper:String
    var brandNameToilet: String
    var productNameToilet: String
    var priceToilet: Double
    var sheetCount: Int
    var plyCount: Int
    var manufacturingDateToilet: String
    var expiryDateToilet: String
    var paperPlates:String
    var brandNamePP: String
    var productNamePP: String
    var pricePP: Double
    var quantityPerPack: Int
    var laminatedPaper: Boolean
    var manufacturingDatePP: String
    var expiryDatePP: String
    // Cleaning Supplies
    var laundryDetergent: String
    var brandNameLaundry: String
    var productNameLaundry: String
    var priceLaundry: Double
    var liquidOrPowder: String
    var netWeightLaundry: Int
    var manufacturingDateLaundry: String
    var expiryDateLaundry: String
    var dishwashingSoap: String
    var brandNameSoap: String
    var productNameSoap: String
    var priceSoap: Double
    var netVolumeSoap: Double
    var manufacturingDateSoap: String
    var expiryDateSoap: String
    // Health & Beauty and Personal Care
    var shampoo: String
    var brandNameShampoo: String
    var productnameShampoo: String
    var priceShampoo: Double
    var netVolumeShampoo: Double
    var forMenOrWomen: String
    var manufacturingDateShampoo: String
    var expiryDateShampoo: String
    var toothpaste: String
    var brandNameTooth: String
    var productNameTooth: String
    var priceTooth: Double
    var netWeight: Int
    var piecesPerPack: Int
    var manufacturingDateTooth: String
    var expiryDateTooth: String

    // Beverage
    var alcoholicDrink: String
    var brandNameAlc: String
    var productNameAlc: String
    var priceAlc: Double
    var netVolumeAlc: Int
    var alcoholContent: Int
    var manufacturingDateAlc: String
    var expiryDateAlc: String
    var carbonatedDrink: String
    var brandNameCarbo: String
    var productNameCarbo: String
    var price: Double
    var netVolumeCarbo: Int
    var manufacturingDateCarbo: String
    var expiryDateCarbo: String
}