import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.File
import java.util.*

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