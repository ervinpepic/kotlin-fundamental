fun main(args: Array<String>) {

    fun forceChoke() {
        println("Testing Kotlin functions, it's really funny")
    }
    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }
    makeAnEntrance("Ervin")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberGoodGuys(4324, 121321)
    println(rebels)
    println(" hello ${calculateNumberGoodGuys(5, 3)} world")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("great")

}