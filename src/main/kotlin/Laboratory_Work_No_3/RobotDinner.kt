package Laboratory_Work_No_3

// Class for dineable for robots
class RobotDinner : Dineable {
    override fun serveDinner(carId: String) {
        println("Serving dinner to robots in car #$carId.")
        // Increment the number of robots served
        Dineable.incrementRobotCount()
    }
}