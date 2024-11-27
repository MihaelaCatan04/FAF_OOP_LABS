package Laboratory_Work_No_3.Task2

class GasStation : Refuelable {
    override fun refuel(carId: String) {
        println("Refueling gas card $carId.")
        Refuelable.incrementGasCarsCount()
    }
}