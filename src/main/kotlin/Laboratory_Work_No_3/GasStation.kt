package Laboratory_Work_No_3

class GasStation : Refuelable {
    override fun refuel(carId: String) {
        println("Refueling gas car #$carId.")
        Refuelable.incrementGasCarsCount()
    }
}