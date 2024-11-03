package Laboratory_Work_No_2.Task3

import Laboratory_Work_No_2.Task1.Intensity

// Class for PumpkinSpiceLatte that inherits from Cappuccino
class PumpkinSpiceLatte(
    private var intensityOfCoffee: Intensity,
    private var mlOfMilk: Int,
    private var mgOfPumpkinSpice: Int,
    private val name: String = "PumpkinSpiceLatte"
) : Cappuccino(intensityOfCoffee, mlOfMilk, name) {
    // Inheriting and overriding printCofeeDetails from Cappuccino
    public override fun printCoffeeDetails() {
        super.printCoffeeDetails()
        println("Pumpkin Spice: $mgOfPumpkinSpice mg")
    }

    companion object {
        public fun makePumpkinSpiceLatte(
            intensityOfCoffee: Intensity,
            mlOfMilk: Int,
            mgOfPumpkinSpice: Int
        ): PumpkinSpiceLatte {
            println("Making Pumpkin Spice Latte")
            println("Setting intensity to $intensityOfCoffee")
            println("Adding $mlOfMilk ml of milk")
            println("Adding $mgOfPumpkinSpice mg of pumpkin spice")
            return PumpkinSpiceLatte(intensityOfCoffee, mlOfMilk, mgOfPumpkinSpice)
        }
    }
}