package Laboratory_Work_No_2.Task4

import Laboratory_Work_No_2.Task1.Intensity
import Laboratory_Work_No_2.Task1.SyrupType

// Class for a barista
class Barista(
    val availableCoffee: List<CoffeeType>,
    val availableIntensities: List<Intensity>,
    val availableSyrups: List<SyrupType>
) {
    private fun <T> takeUserInput(prompt: String, options: List<T>): T {
        println(prompt)
        for (i in options.indices) {
            println("${i + 1}. ${options[i]}")
        }
        var choice: Int
        do {
            println("Your choice must be a number between 1 and ${options.size}.")
            choice = readLine()!!.toInt()
        } while (choice !in 1..options.size)
        return options[choice - 1]
    }
    private fun takeCoffeeKind(): CoffeeType {
        return takeUserInput("What kind of coffee would you like?", availableCoffee)
    }

    private fun takeIntensity(): Intensity {
        return takeUserInput("What kind of intensity would you like?", availableIntensities)
    }

    private fun takeSyrupType(): SyrupType {
        return takeUserInput("What kind of syrup would you like?", availableSyrups)
    }
    private fun takeMililitersOfWater(): Int {
        var mlOfWater: Int;
        do {
            println("How many ml of water would you like?")
            mlOfWater = readLine()!!.toInt()
        } while (mlOfWater <= 0)
        return mlOfWater

    }
    private fun takeMililitersOfMilk(): Int {
        var mlOfMilk: Int;
        do {
            println("How many ml of milk would you like?")
            mlOfMilk = readLine()!!.toInt()
        } while (mlOfMilk <= 0)
        return mlOfMilk
    }
    private fun takeMiligramsOfPumpkinSpice(): Int {
        var mgOfPumpkinSpice: Int;
        do {
            println("How many mg of pumpkin spice would you like?")
            mgOfPumpkinSpice = readLine()!!.toInt()
        } while (mgOfPumpkinSpice <= 0)
        return mgOfPumpkinSpice
    }
    public fun takeOrder(): Coffee? {
        println("Welcome to the Coffee Shop!")
        var coffeeKind = takeCoffeeKind()
        var coffeeIntensity = takeIntensity()
        when (coffeeKind) {
            CoffeeType.AMERICANO -> {
                var mlOfWater = takeMililitersOfWater()
                return Americano.makeAmericano(coffeeIntensity, mlOfWater)
            }
            CoffeeType.CAPPUCCINO -> {
                var mlOfMilk = takeMililitersOfMilk()
                return Cappuccino.makeCappuccino(coffeeIntensity, mlOfMilk)
            }
            CoffeeType.PUMPKIN_SPICE_LATTE -> {
                var mlOfMilk = takeMililitersOfMilk()
                var mgOfPumpkinSpice = takeMiligramsOfPumpkinSpice()
                return PumpkinSpiceLatte.makePumpkinSpiceLatte(coffeeIntensity, mlOfMilk, mgOfPumpkinSpice)
            }
            CoffeeType.SYRUP_CAPPUCCINO -> {
                var mlOfMilk = takeMililitersOfMilk()
                var syrup = takeSyrupType()
                return SyrupCappuccino.makeSyrupCappuccino(coffeeIntensity, mlOfMilk, syrup)
            }
            else -> {
                println("Sorry! We do not currently serve this coffee type.")
                return null
            }
        }
    }
    public fun sayWish() {
        var randomNumber = (0..3).random()
        when (randomNumber) {
            0 -> println("Have a brew-tiful day!")
            1 -> println("Take life one sip at a time!")
            2 -> println("May your coffee be strong and your day be smooth!")
            3 -> println("Have a frappé-tastic day!")
        }
    }
}
