package Laboratory_Work_No_2.Task1

// Class for Americano that inherits from Coffee
class Americano(
    private var intensityCoffee: Intensity,
    private var mlOfWater: Int,
    private val coffeeName: String = "Americano"
) : Coffee(intensityCoffee, coffeeName) {
    //pass
}