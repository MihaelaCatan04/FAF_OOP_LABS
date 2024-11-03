package Laboratory_Work_No_2.Task2

import Laboratory_Work_No_2.Task1.Intensity
import Laboratory_Work_No_2.Task1.SyrupType

// Class SyrupCappuccino that inherits from Cappuccino
class SyrupCappuccino(
    private var intensityCoffe: Intensity,
    private var mltrOfMilk: Int,
    private var syrup: SyrupType,
    private val coffee: String = "SyrupCappuccino"
) : Cappuccino(intensityCoffe, mltrOfMilk, coffee) {
    // Inheriting and overriding printCoffeeDetails from Cappuccino
    public override fun printCoffeeDetails() {
        super.printCoffeeDetails()
        println("Adding $syrup syrup")
    }
}