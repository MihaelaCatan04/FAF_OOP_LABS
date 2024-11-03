package Laboratory_Work_No_2.Task1

// Base class for Cappuccino that inherits from Coffee
open class Cappuccino(
    private var intensity: Intensity,
    private var mlOfMilk: Int,
    private val coffee: String = "Cappuccino"
) : Coffee(intensity, coffee) {
    //pass
}