fun main() {
    var userName:String? = null
    var needAnyHelp:String? = null
    print("Enter your name: ")
    userName = readln()
    println("Hi $userName")

    print("Do you need any help? (Y/N) ")
    needAnyHelp = readln()

    if (needAnyHelp[0].uppercase() == "Y") {

        println("How may I help you?")
    }  else if (needAnyHelp.uppercase() == "N") {
        println("Don't forget I am here ...")
    } else {
        println("Oh okay ...")
    }
    println("Thank you $userName.")
}