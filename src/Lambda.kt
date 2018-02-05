fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message) }

//    fun printMessage(message: String) {
//        println(message)
//    }

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y}
    println(sumA(5,3))

    val sumB : (Int, Int) -> Int = { x,y -> x + y }

    fun downloadData(url: String, completion: () -> Unit) {
        //Sent a download request
        //We got back data
        //there were no network errors
//        completion()
    }

    // call downloadDataFunction
    downloadData("someUrl.com", {
        println("Code in this block will only run" + "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //Sent a download request
        //We got back some car data
        //there were no network errors
        val car = Car("Tesla 2", "Model X", "Blue")
        completion(car)
    }

    downloadCarData("Myurl.com"){ car ->
        println(car.color)
        println(car.make)

    }

    downloadCarData("Myurl.com"){
        println(it.color)
        println(it.make)

    }

    fun downloadTrucData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //Making web request
        //afet getting result back

        val webRequestSuccess = true
        if (webRequestSuccess) {
            val truck = Truck("FAP", "F/13/14", 213)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTrucData("fake.com") { truck, success ->
        if (success == true) {
            //some task
            truck?.climb()
        } else {
            //no network
            println("Nooo network.")
        }
    }
}