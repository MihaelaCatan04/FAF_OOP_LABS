package Laboratory_Work_No_3

interface Refuelable {
    companion object {
        var electricCarsCount = 0
        fun incrementElectricCarsCount() {
            electricCarsCount++
        }
        var gasCarsCount = 0
        fun incrementGasCarsCount() {
            gasCarsCount++
        }
    }
    fun refuel(carId: String)
}