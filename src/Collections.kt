fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[1])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    println(rebels.count())
    rebels.add("Chewbecca")
    rebels.add(0, "Lando")
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap)
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exists"))
    println(rebelVehiclesMap.values)


    val rebelVehicles = hashMapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder", "Boba" to "Rocket Pack")
    rebelVehicles["Luke"] = "Xwing"
    rebelVehicles.put("Leiah", "Tantive IV")

    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    rebelVehicles.isEmpty()
}