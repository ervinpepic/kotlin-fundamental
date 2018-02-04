fun main(args: Array<String>) {

    var name : String = "ErvinP"
//    name = null

    var nullableName : String? = "Do I Really Exists??!?!?"

    //Null Check
//    nullableName = null
    var length = 0
    if (nullableName != null) {
       length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else - 1

    //Safe Call Operator ?

    println(nullableName?.length)

    //Elvis Operator

    val len = nullableName?.length ?: -1

    val noName = nullableName ?: "No one knows me :("

    println(noName)

    //!!
    println(nullableName!!.length)
}