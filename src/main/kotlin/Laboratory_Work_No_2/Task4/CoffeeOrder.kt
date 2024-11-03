package Laboratory_Work_No_2.Task4

import Laboratory_Work_No_2.Task1.Intensity

// Data class for CoffeeOrder for Barista
data class CoffeeOrder(
    val coffeeType: String,
    val intensity: Intensity,
    val mlOfWater: Int = 0,
    val mlOfMilk: Int = 0,
    val mgOfPumpkinSpice: Int = 0
)
