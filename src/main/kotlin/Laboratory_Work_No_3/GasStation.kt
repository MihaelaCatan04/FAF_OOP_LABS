package Laboratory_Work_No_3

// Class for gas station
class GasStation : Refuelable {
    override fun refuel(carId: String) {
        println("Refueling gas car #$carId.")
        // Increment the number of gas cars served
        Refuelable.incrementGasCarsCount()
    }
}