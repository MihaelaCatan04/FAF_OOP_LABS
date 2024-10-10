import java.io.File
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

// Class for Planet
enum class Planet {
    Earth, Asgard, Betelgeuse, Vogsphere, Kashyyyk, Endor
}

enum class Traits {
    HAIRY, TALL, SHORT, BLONDE, EXTRA_ARMS, EXTRA_HEAD, GREEN, BULKY, POINTY_EARS
}

// Class for a creature
data class Creature(
    val id: Int,
    val isHumanoid: Boolean? = null,
    val planet: Planet? = null,
    val age: Int? = null,
    val traits: List<Traits>? = null
)

// Class for a list of creatures
data class CreatureList(
    val data: List<Creature>
)

// Class for defining universe
data class Universe(
    val name: String,
    val individuals: MutableList<CreatureList>
)



// Class for file reading
data class FileReader(
    private val filePath: String
) {
    // Method to read a file and print its content
    fun readAndPrint() {
        val file = File(filePath)
        if (file.exists()) {
            file.forEachLine {
                println(it)
            }
        } else {
            println("File does not exist")
        }
    }
    // Method to read a JSON from a file and parse it
    fun readAndParseJson() {
        val file = File(filePath)
        if (file.exists()) {
            val mapper = jacksonObjectMapper()
            val text = file.readText()
            val response: CreatureList = mapper.readValue(text)
            println("All creatures:");
            for (creature in response.data) {
                println("Creature: $creature")
            }
            println("Creatures with even id:")
            for (creature in response.data) {
                // print event IDs
                if (creature.id % 2 == 0) {
                    println(creature)
                }
            }
            println("Creatures with odd id:")
            for (creature in response.data) {
                if (creature.id % 2 != 0) {
                    println(creature)
                }
            }
            println("Creatures from Earth:")
            for (creature in response.data) {
                if (creature.planet == Planet.Earth) {
                    println(creature)
                }
            }
            println("Very huge creatures:")
            for (creature in response.data) {
                if (creature.traits != null && Traits.TALL in creature.traits) {
                    println(creature)
                }
            }
        } else {
            println("File does not exist")
        }
    }


}

fun main() {
    val fileReader = FileReader("src/main/resources/input.json")
    fileReader.readAndParseJson()
}