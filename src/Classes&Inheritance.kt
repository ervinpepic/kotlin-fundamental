




//class Car (val make: String, val model: String, var color: String) {
//
//    fun accelerate() {
//        println("faasteer")
//    }
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacty: Int) {
//    fun tow() {
//        println("load truck")
//    }
//
//    fun details() {
//        println("The $make $model has a towing capactiy of $towingCapacty T")
//    }
//}


open class Vehicle(val make: String, val model: String) {

    open fun accelerate() {
        println("More thortle ")
    }

    fun park() {
        println("Starting park")
    }

    fun brake() {
        println("Press middle device to brake")
    }

}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {


}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    override fun accelerate() {
        super.accelerate()
        println("Test Truck Speed")
    }

    fun climb() {
        println("Mountain truck")
    }
}

fun main(args: Array<String>) {

    val tesla = Car("Tesla", "Model 3", "Green")
    tesla.accelerate()
    tesla.park()
    tesla.brake()

    val truck = Truck("Tesla", "Tesla Truck",21)
    truck.accelerate()
    truck.climb()
//    val car = Car("VW", "Aerton", "Grey")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Scania","A-Class 12", 123)
//    truck.tow()
//    truck.details()
}