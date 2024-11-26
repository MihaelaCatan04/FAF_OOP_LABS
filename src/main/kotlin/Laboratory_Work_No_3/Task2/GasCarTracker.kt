package Laboratory_Work_No_3.Task2

class GasCarTracker {
    companion object {
        private var countGasCars = 0
        fun trackGasCars() {
            countGasCars++
        }
        fun getCountGasCars(): Int {
            return countGasCars
        }
    }
}