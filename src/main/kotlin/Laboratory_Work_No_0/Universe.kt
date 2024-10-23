package Laboratory_Work_No_0

// Class for defining universe
data class Universe(
    val name: String,
    val individuals: MutableList<Creature> = mutableListOf()
)