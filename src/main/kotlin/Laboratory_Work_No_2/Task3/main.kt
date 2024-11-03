package Laboratory_Work_No_2.Task3

import Laboratory_Work_No_2.Task1.Intensity
import Laboratory_Work_No_2.Task1.SyrupType

fun main() {
    // Test data
    val syrupCappuccino = SyrupCappuccino.makeSyrupCappuccino(Intensity.NORMAL, 150, SyrupType.VANILLA)
    val pumpkinSpiceLatte = PumpkinSpiceLatte.makePumpkinSpiceLatte(Intensity.STRONG, 200, 50)
    val americano = Americano.makeAmericano(Intensity.NORMAL, 200)
    val cappuccino = Cappuccino.makeCappuccino(Intensity.NORMAL, 150)
    val coffeeList: List<Coffee> = listOf(syrupCappuccino, pumpkinSpiceLatte, americano, cappuccino)

    for (coffee in coffeeList) {
        when (coffee) {
            is SyrupCappuccino -> {
                println("Syrup Cappuccino Details")
                coffee.printCoffeeDetails()
            }
            is PumpkinSpiceLatte -> {
                println("Pumpkin Spice Latte Details")
                coffee.printCoffeeDetails()
            }
            is Americano -> {
                println("Americano Details")
                coffee.printCoffeeDetails()
            }
            is Cappuccino -> {
                println("Cappuccino Details")
                coffee.printCoffeeDetails()
            }
            else -> {
                println("Unknown coffee type")
            }
        }
    }
}
