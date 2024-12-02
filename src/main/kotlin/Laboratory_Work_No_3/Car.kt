package Laboratory_Work_No_3

// Later refactor code using ENUM
// Data class for car
data class Car(
    val id: Int,
    val type: CarTypes,
    val passengers: PassengerTypes,
    val isDining: Boolean,
    val consumption: Int
)
