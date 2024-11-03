package Laboratory_Work_No_2.Task2

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
        println("Adding $mlOfWater ml of water")
    }
}