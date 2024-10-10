import java.io.File
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.util.*

// Enumeration of Planet
enum class Planet {
    Earth, Asgard, Betelgeuse, Vogsphere, Kashyyyk, Endor
}

// Enumeration of Traits
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
    val data: MutableList<Creature>
)

// Class for defining universe
data class Universe(
    val name: String,
    val individuals: MutableList<Creature> = mutableListOf()
)

// Class for file reading
class FileReader(
    private val filePath: String
) {
    // Method to read a JSON from a file and parse it
    fun readAndParseJson(): MutableList<Creature>? {
        val file = File(filePath)
        return if (file.exists()) {
            val mapper = jacksonObjectMapper()
            val creatureList: CreatureList = mapper.readValue(file)
            creatureList.data
        } else {
            println("File does not exist")
            null
        }
    }
}

// Class to write the output
class OutputWriter() {
    fun writeToOutputFiles(path: String, universes: MutableList<Universe>) {
        val mapper = jacksonObjectMapper()
        for (universe in universes) {
            val outputFile = File("$path/${universe.name.lowercase(Locale.getDefault())}.json")
            outputFile.parentFile.mkdirs()
            outputFile.writeText(mapper.writeValueAsString(CreatureList(universe.individuals)))
        }
    }
}

// Class to classify the creatures
class UniverseClassifier {
    val universes = mutableListOf(
        Universe("starWars"),
        Universe("marvel"),
        Universe("hitchHiker"),
        Universe("rings")
    )

    private fun isWookie(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Kashyyyk || creature.planet == null) &&
                (creature.age in 0..400 || creature.age == null) &&
                (creature.traits == null || Traits.HAIRY in creature.traits || Traits.TALL in creature.traits)
    }

    private fun isEwok(creature: Creature): Boolean {
        return (creature.isHumanoid == false || creature.isHumanoid == null) &&
                (creature.planet == Planet.Endor || creature.planet == null) &&
                (creature.age in 0..60 || creature.age == null) &&
                (creature.traits == null || Traits.HAIRY in creature.traits || Traits.SHORT in creature.traits)
    }

    private fun isAsgardian(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Asgard || creature.planet == null) &&
                (creature.age in 0..5000 || creature.age == null) &&
                (creature.traits == null || Traits.BLONDE in creature.traits || Traits.TALL in creature.traits)
    }

    private fun isBetelgeusian(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Betelgeuse || creature.planet == null) &&
                (creature.age in 0..100 || creature.age == null) &&
                (creature.traits == null || Traits.EXTRA_ARMS in creature.traits || Traits.EXTRA_HEAD in creature.traits)
    }

    private fun isVogon(creature: Creature): Boolean {
        return (creature.isHumanoid == false || creature.isHumanoid == null) &&
                (creature.planet == Planet.Vogsphere || creature.planet == null) &&
                (creature.age in 0..200 || creature.age == null) &&
                (creature.traits == null || Traits.BULKY in creature.traits || Traits.GREEN in creature.traits)
    }

    private fun isElf(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Earth || creature.planet == null) &&
                (creature.traits == null || Traits.BLONDE in creature.traits || Traits.POINTY_EARS in creature.traits)
    }

    private fun isDwarf(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Earth || creature.planet == null) &&
                (creature.age in 0..200 || creature.age == null) &&
                (creature.traits == null || Traits.SHORT in creature.traits || Traits.BULKY in creature.traits)
    }

    fun classify(creatures: MutableList<Creature>) {
        for (creature in creatures) {
            when {
                isWookie(creature) || isEwok(creature) -> universes[0].individuals.add(creature)
                isAsgardian(creature) -> universes[1].individuals.add(creature)
                isBetelgeusian(creature) || isVogon(creature) -> universes[2].individuals.add(creature)
                isElf(creature) || isDwarf(creature) -> universes[3].individuals.add(creature)
            }
        }
    }
}

// Class to view the output json files content
class View() {
    fun showContent(){
        for (universe in UniverseClassifier().universes) {
            val fileName = "src/main/resources/output/${universe.name.lowercase()}.json"
            val file = File(fileName)

            if (file.exists()) {
                println("Creatures from the ${universe.name} universe:")
                file.forEachLine {
                    println(it)
                }
            } else {
                println("File for universe ${universe.name} does not exist.")
            }
        }
    }
}
fun main() {
    val fileReader = FileReader("src/main/resources/input.json")
    val data = fileReader.readAndParseJson()
    if (data != null) {
        val classifier = UniverseClassifier()
        classifier.classify(data)
        val outputWriter = OutputWriter()
        outputWriter.writeToOutputFiles("src/main/resources/output", classifier.universes)
        println("Classification complete. Output files written.")
        val view = View()
        view.showContent()
    } else {
        println("Failed to read or parse the input file.")
    }
}
