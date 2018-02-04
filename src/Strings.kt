fun main(args: Array<String>) {
    val str = "May the force be with you."


    val str1 = "My dad said the funniest thing he said"
    println(str1)

    val rawCrawl = """A long time ago,
        ina a galaxy,
        far far far,away..
        bum bum """.trimMargin(">")
    println(rawCrawl)

//    for (char in str) {
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    var contains = str.contains("force", true)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    print(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,14)
    println(subsequence)


    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    var age = 24

    println(luke + " has a " + lightSaberColor)
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old, and his name have  ${luke.length} characters")
}