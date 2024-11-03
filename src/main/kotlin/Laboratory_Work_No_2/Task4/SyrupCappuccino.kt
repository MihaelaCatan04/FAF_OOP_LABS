package Laboratory_Work_No_2.Task4

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
        println("Syrup type: $syrup")
    }
    companion object {
         public fun makeSyrupCappuccino(intensityCoffe: Intensity, mltrOfMilk: Int, syrup: SyrupType): SyrupCappuccino {
            println("Making Syrup Cappuccino")
            println("Setting intensity to $intensityCoffe")
            println("Adding $mltrOfMilk ml of milk")
            println("Adding $syrup syrup")
            return SyrupCappuccino(intensityCoffe, mltrOfMilk, syrup)
        }
    }
}