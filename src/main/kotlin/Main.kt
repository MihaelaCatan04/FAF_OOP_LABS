import java.io.File
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

// Class for a creature
data class Creature(
    private var id: Int,
    private var isHumanoid: Boolean?,
    private var planet: String?,
    private var age: Int?,
    private var traits: List<String>?
) {
    // Getter methods to access private properties
    fun getId() = id
    fun getIsHumanoid() = isHumanoid
    fun getPlanet() = planet
    fun getAge() = age
    fun getTraits() = traits
}

// Class for a list of creatures
data class CreatureList(
    val data: List<Creature>
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

            for (creature in response.data) {
                println("Creature: $creature")
            }
        } else {
            println("File does not exist")
        }
    }


}

fun main() {
    val fileReader = FileReader("src/main/resources/test-input.json")
    fileReader.readAndParseJson()
}