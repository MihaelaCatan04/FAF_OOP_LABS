package Laboratory_Work_No_3.Task2

class ElectricCarTracker {
    companion object {
        private var countElectricCars = 0
        fun trackElectricCars() {
            countElectricCars++
        }
        fun getCountElectricCars(): Int {
            return countElectricCars
        }
    }
}