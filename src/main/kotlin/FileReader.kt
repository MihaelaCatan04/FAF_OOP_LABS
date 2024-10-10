import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

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