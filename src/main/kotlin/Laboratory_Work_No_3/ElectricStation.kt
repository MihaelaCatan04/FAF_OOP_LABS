package Laboratory_Work_No_3

// Class for electric station
class ElectricStation : Refuelable {
    override fun refuel(carId: String) {
        println("Refueling electric car #$carId.")
        // Increment the number of electric cars served
        Refuelable.incrementElectricCarsCount()
    }
}