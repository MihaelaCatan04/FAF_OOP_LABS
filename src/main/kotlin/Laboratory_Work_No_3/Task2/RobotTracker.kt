package Laboratory_Work_No_3.Task2

class RobotTracker {
    companion object {
        private var countRobots = 0
        fun trackRobots() {
            countRobots++
        }
        fun getCountRobots(): Int {
            return countRobots
        }
    }
}