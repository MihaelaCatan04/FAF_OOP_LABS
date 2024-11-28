package Laboratory_Work_No_3

// Class for dineable for people
class PeopleDinner : Dineable {
    override fun serveDinner(carId: String) {
        println("Serving dinner to people in car #$carId.")
        // Increment the number of people served
        Dineable.incrementPeopleCount()
    }
}