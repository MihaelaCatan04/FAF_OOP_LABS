package Laboratory_Work_No_0

import java.io.File

// Class to view the output json files content
class View() {
    fun showContent() {
        for (universe in UniverseClassifier().universes) {
            val fileName = "src/main/resources/Lab0/output/${universe.name.lowercase()}.json"
            val file = File(fileName)

            if (file.exists()) {
                println("Creatures from the ${universe.name} universe:")
                file.forEachLine {
                    println(it)
                }
            } else {
                error("File for universe ${universe.name} does not exist.")
            }
        }
    }
}