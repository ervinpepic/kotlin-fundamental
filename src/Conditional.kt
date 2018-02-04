fun main(args: Array<String>) {
    val a = 10
    val b = 20

    if (a == b) {
        println("a does in fact equal b")
    }
    if (a != b) {
        println("a does not equal to b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("You cannot buy this item, you do not have money!")
    }

    val degrees = 70

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap it's cold!")
    }

    val isHungry = false
    val isBored  = true

    if (isHungry|| isBored) {
        println("Let's get pizza!")
    }

    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not = 1 or = 2")

    }

    fun vaderIsFeeling(mood: String = "Angry") {
        if (mood == "Angry") {
            println("Run for the hills, Vade is $mood")
        } else {
            println("Whatever you do, don't make him angry!!!")
        }
    }

    vaderIsFeeling()
}