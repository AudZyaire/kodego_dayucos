fun main() {
    var grade:Float = 90.0F
    var gradeInCard:Float = 0.0F
    when(grade) {
        in (94.0F).rangeTo(Float.MAX_VALUE) -> {
        gradeInCard = 1.0F
        }
        in (89.0F).rangeTo(93.9F) -> {
            gradeInCard = 1.5F
        }
    }
    println("You got $gradeInCard")
}