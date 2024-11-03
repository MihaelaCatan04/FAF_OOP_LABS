package Laboratory_Work_No_2.Task4

import Laboratory_Work_No_2.Task1.Intensity

// Parent class Coffee
open class Coffee(
    private var coffeeIntensity: Intensity,
    private val name: String = "Coffee"
) {
    // Creating base function printCoffeeDetails
    public open fun printCoffeeDetails() {
        println("Recipe for $name")
        println("Coffee intensity: $coffeeIntensity")
    }

    companion object {
        public fun makeCoffee(coffeeIntensity: Intensity): Coffee {
            println("Making Coffee")
            println("Setting intensity to $coffeeIntensity")
            return Coffee(coffeeIntensity)
        }
    }
}