package Activity_01_H

fun main() {

    var first: String
    var second: String
    var lowerNum:Int
    var higherNum:Int
    var divisible:Boolean?
    //var primeSet = arrayListOf<Int>()
    var primeSet: String = ""
    print("Enter First Number: ")
    first = readln()
    print("Enter Second Number: ")
    second = readln()
    if (first > second) {
        higherNum = first.toInt()
        lowerNum = second.toInt()
    } else {
        higherNum = second.toInt()
        lowerNum = first.toInt()
    }
    println("Prime numbers from $lowerNum to $higherNum are:")

    while (lowerNum < higherNum+1) {
        divisible = false
        for (i in 2..lowerNum-1) {
            if (lowerNum % i == 0) {
                divisible=true
            }

        }
       if (divisible==false) {
           primeSet +="[$lowerNum] "
           //primeSet.add(num1)
       }
        lowerNum++
    }

    print(primeSet)

}