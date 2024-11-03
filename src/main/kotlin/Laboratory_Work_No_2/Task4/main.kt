package Laboratory_Work_No_2.Task4

import Laboratory_Work_No_2.Task1.Intensity
import Laboratory_Work_No_2.Task1.SyrupType
import Laboratory_Work_No_2.Task4.Coffee.Barista

fun main() {
    var coffeTypes = listOf(CoffeeType.AMERICANO, CoffeeType.CAPPUCCINO, CoffeeType.PUMPKIN_SPICE_LATTE, CoffeeType.SYRUP_CAPPUCCINO)
    var coffeIntensities = listOf(Intensity.LIGHT, Intensity.NORMAL, Intensity.STRONG)
    var listSyrups = listOf(SyrupType.VANILLA, SyrupType.CARAMEL, SyrupType.COCONUT, SyrupType.POPCORN, SyrupType.CHOCOLATE, SyrupType.MACADAMIA)
    var barista = Barista(coffeTypes, coffeIntensities, listSyrups)
    var order = barista.takeOrder()
    if (order != null) {
        order.printCoffeeDetails()
    }
    barista.sayWish()
}
