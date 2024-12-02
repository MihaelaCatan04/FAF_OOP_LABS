package Laboratory_Work_No_3

// Dineable interface
interface Dineable {
    // companion object to store count of people and robots served across all stations
    companion object {
        var robotCount = 0
        fun incrementRobotCount() {
            robotCount++
        }
        var peopleCount = 0
        fun incrementPeopleCount() {
            peopleCount++
        }
    }
    // method definition for serveDinner
    fun serveDinner(carId: String)
}