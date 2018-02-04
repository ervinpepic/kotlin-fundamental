fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder", "Boba" to "Rocket Pack")

    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((character, vehicle) in rebelVehicles) {
        println("$character gets around in their $vehicle")
    }

    var x = 0

    while (x <= 10) {
        println(x)
        x ++
    }
}