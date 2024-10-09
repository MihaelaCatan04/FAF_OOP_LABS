import java.io.File

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
}

data class FileReader(
    private val filePath: String
) {
    fun readAndPrint() {
        val file = File(filePath) //creates a File object
        if (file.exists()) {
            file.forEachLine {
                println(it)
            }
        } else {
            println("File does not exist")
        }
    }
}

fun main() {
    val fileReader = FileReader("src/main/resources/test-input.json")
    fileReader.readAndPrint()
}