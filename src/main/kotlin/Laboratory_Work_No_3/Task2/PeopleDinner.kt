package Laboratory_Work_No_3.Task2

class PeopleDinner : Dineable {
    override fun serveDinner(carId: String) {
        println("Serving dinner to people in car #$carId.")
        Dineable.incrementPeopleCount()
    }
}