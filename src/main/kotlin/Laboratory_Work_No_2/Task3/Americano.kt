package Laboratory_Work_No_2.Task3

import Laboratory_Work_No_2.Task1.Intensity

// Class for Americano that inherits from Coffee
class Americano(
    private var intensityCoffee: Intensity,
    private var mlOfWater: Int,
    private val coffeeName: String = "Americano"
) : Coffee(intensityCoffee, coffeeName) {
    // Inheriting and overriding printCoffeeDetails from Coffee
    public override fun printCoffeeDetails() {
        super.printCoffeeDetails()
        println("Water: $mlOfWater ml")
    }
    // Method to print recipe of Americano
    public fun makeAmericano(): Americano {
        super.makeCoffee()
        println("Adding $mlOfWater ml of water")
        return this
    }
}