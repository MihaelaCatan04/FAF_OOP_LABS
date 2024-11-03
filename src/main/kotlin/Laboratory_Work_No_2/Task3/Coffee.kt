package Laboratory_Work_No_2.Task2

import Laboratory_Work_No_2.Task1.Intensity

// Parent class Coffee
open class Coffee(
    private var coffeeIntensity: Intensity,
    private val name: String = "Coffee"
) {
    // Creating base function printCoffeeDetails
    public open fun printCoffeeDetails() {
        println("Making $name")
        println("Intensity set to $coffeeIntensity")
    }
}