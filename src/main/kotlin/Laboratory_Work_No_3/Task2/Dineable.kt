package Laboratory_Work_No_3.Task2

interface Dineable {
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
    fun serveDinner(carId: String)
}