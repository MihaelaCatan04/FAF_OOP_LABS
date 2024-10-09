data class Creature(
    private var id: Int,
    private var isHumanoid: Boolean,
    private var planet: String,
    private var age: Int,
    private var traits: List<String>
) {
    // Getter methods to access private properties
    fun getId() = id
    fun getIsHumanoid() = isHumanoid
    fun getPlanet() = planet
    fun getAge() = age
    fun getTraits() = traits

    // Methods
    fun greet(){
        println("Hello! I am creature No. ${id}")
    }

    fun printInfo() {
        println("Creature: ${id}")
        println("Is Humanoid? ${isHumanoid}")
        println("It is from ${planet}")
        println("It is ${age} years old")
        println("It is ${traits}")
    }
}


fun main() {

    // Create instances of the Creature class
    val creature1 = Creature(1, false, "Mars", 200, listOf("tall", "green"))
    val creature2 = Creature(2, true, "Earth", 16, listOf("intelligent", "blue-eyed"))

    for (creature in listOf(creature1, creature2)) {
        creature.printInfo()
    }

    val creature3 = creature2.copy(id = 3, isHumanoid = false)
    creature3.printInfo()
    creature3.greet()
}