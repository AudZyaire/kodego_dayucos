package activity_01_J
import mu.KotlinLogging
import kotlin.math.roundToInt

private val logger = KotlinLogging.logger{}
fun main() {
    var numberList: ArrayList<Int> = arrayListOf()
    var itemsBoughtList: ArrayList<String> = arrayListOf()
    var pricePerItemList: ArrayList<Double> = arrayListOf()
    var totalPerItemList: ArrayList<Double> = arrayListOf()
    var itemsQuantity: ArrayList<Int> = arrayListOf()
    var numberID: Int = 0
    var quantityTimesPrice: Double
    var item: String
    var quantity: String
    var price: String = ""
    var yesNo: String = "Y"
    var guiAnswer: String? = null
    var guiAnswerTypeCast: Int
    var programExit:Boolean = false

    do { // show gui
        do { // error handling

            logger.info { "1. New Customer" }
            logger.info { "2. Exit Program" }
            guiAnswer = readln()
            if (guiAnswer.toIntOrNull() == null) {
                logger.info { "Enter a valid choice." }
            }
        } while (guiAnswer?.toIntOrNull() == null)

            if (guiAnswer.toInt() == 1) {
                //clear the array lists values
                itemsBoughtList.clear()
                itemsQuantity.clear()
                pricePerItemList.clear()
                totalPerItemList.clear()
                numberList.clear()
                numberID = 0
                do {
                    logger.info { "Enter Item: " }
                    item = readln()

                    //error handling
                    do {
                        logger.info { "Quantity: " }
                        quantity = readln()
                        if (quantity.toIntOrNull() == null) {
                            logger.warn { "Enter a valid quantity" }
                        }
                    } while (quantity.toIntOrNull() == null)

                    do {
                        logger.info { "Price: " }
                        price = readln()
                        if (price.toDoubleOrNull() == null) {
                            logger.warn { "Enter a valid price" }
                        }
                    } while (price.toDoubleOrNull() == null)

                    //add User Input to List
                    itemsBoughtList.add(item)
                    pricePerItemList.add(price.toDouble())
                    itemsQuantity.add(quantity.toInt())
                    quantityTimesPrice = quantity.toDouble() * price.toDouble()
                    totalPerItemList.add(quantityTimesPrice)
                    numberID += 1
                    numberList.add(numberID)

                    //error handling
                    do {
                        logger.info { "Adding more items? Y/N: " }
                        yesNo = readln()
                    } while (yesNo.uppercase() != "Y" && yesNo.uppercase() != "N")

                } while (yesNo.uppercase() == "Y")

                //log all the items like a receipt would
                var q = 0
                for (i in numberList) {
                    q = i - 1
                    logger.info { "Item No. $i: ${itemsBoughtList[q].uppercase()} - QTY: ${itemsQuantity[q]} - Price: ${pricePerItemList[q]} - Total: ${totalPerItemList[q]}" }
                }

                //sum of all totalPerItemList list elements
                var total = 0.0
                for (i in totalPerItemList) {
                    total += i
                }
                logger.info { "----------" }
                total = ((total * 100).roundToInt().toDouble() / 100)
                logger.info { "TOTAL: $total" }
                programExit = false
            } else if (guiAnswer.toInt() == 2) {
                logger.info { "Program Exits..." }
                programExit = true
            } else {
                logger.info { "Enter a valid choice." }
                programExit = false
            }
    } while (programExit == false)
}