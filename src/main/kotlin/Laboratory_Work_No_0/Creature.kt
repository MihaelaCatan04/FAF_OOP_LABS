package Laboratory_Work_No_0

// Class for a creature
data class Creature(
    val id: Int,
    val isHumanoid: Boolean? = null,
    val planet: Planet? = null,
    val age: Int? = null,
    val traits: List<Traits>? = null
)