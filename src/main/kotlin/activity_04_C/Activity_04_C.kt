package activity_04_C

import activity_05_C_OOP.Products
import java.util.Date

//Covered Topic(s) : Classes
//Create class for
//Poultry *
//Fish *
//Canned goods *
//Snacks *
//Frozen Products *
//Fruits *
//Vegetables *
//Condiments *
//Furniture *
//Appliances *
//Clothes *
//Pet Items *
//Sanitary Products *
//Personal Care *
// Liquor *
// Baby Products *
// Soap
//Add 5 more type of items you can find in the grocery.
//
//Identify the attributes for all the classes mentioned.


class Poultry (name: String = "", price: Double = 0.0) : Products(name, price) {
    var harvestDate: Date = Date()
    var consumeBefore: Date = Date()
}
class Fish (name: String = "", price: Double = 0.0) : Products(name, price) {
    var harvestDate: Date = Date()
    var consumeBefore: Date = Date()
}
class CannedGoods (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var consumeBefore: Date = Date()
}
class Snacks (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var consumeBefore: Date = Date()
}
class FrozenProducts (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var consumeBefore: Date = Date()
}

class Fruits (name: String = "", price: Double = 0.0) : Products(name, price) {
    var harvestDate: Date = Date()
    var consumeBefore: Date = Date()
}

class Vegetables (name: String = "", price: Double = 0.0) : Products(name, price) {
    var harvestDate: Date = Date()
    var consumeBefore: Date = Date()
}

class Condiments (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var consumeBefore: Date = Date()
}

class Furniture (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var materialUsed: String = ""
}

class Appliances (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var powerConsumptionWattage: Int = 0
    var voltage: Int = 0
}

class Clothes (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var materialUsed: String = ""
}

class PetItems (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var forWhatPet: String = ""
}

class SanitaryProducts (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var useBefore: Date = Date()

}

class PersonalCare (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var useBefore: Date = Date()

}

class Liquor (name: String = "", price: Double = 0.0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var typeOfLiquor: String = ""
    var manufacturingDate: Date = Date()
    var consumeBefore: Date = Date()

}

class BabyProducts (name: String = "", price: Double = 0.0, stocksLeft: Int = 0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()
    var useBefore: Date = Date()
    var ageBracketInMonths: IntRange = 0 .. 0

}

class RainProtection (name: String = "", price: Double = 0.0, stocksLeft: Int = 0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()

}

class Sunglasses (name: String = "", price: Double = 0.0, stocksLeft: Int = 0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()

}

class CookingWares (name: String = "", price: Double = 0.0, stocksLeft: Int = 0) : Products(name, price) {
    var brandName: String = ""
    var manufacturer: String = ""
    var manufacturingDate: Date = Date()

}




