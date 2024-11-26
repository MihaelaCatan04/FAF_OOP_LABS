package Laboratory_Work_No_3.Task2

class ElectricStation : Refuelable {
    override fun refuel(carId: String) {
        println("Refueling electric car $carId.")
    }
}