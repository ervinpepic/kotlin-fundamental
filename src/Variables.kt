import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val name:String = "Ervin Pepic"
    var isAwesome = true

    println("Is " + name + " awesome? The answer is: " + isAwesome)

    var a: Int = 3
    var b = 6
    println("result is: " + (a + b))

    val doubleNum: Double = 123.45 // 64 bit number
    val floatNum = 123.45f // 32 bit number

    val longNum: Long = 16543135154541L // 64 bit num

    val aDouble = a.toDouble()
    println(aDouble.absoluteValue)

    var hero: String
    hero = "Superman"
    hero = "Batman"
    println(hero)
}