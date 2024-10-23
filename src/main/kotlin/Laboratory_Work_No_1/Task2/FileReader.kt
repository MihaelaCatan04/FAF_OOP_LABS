package Laboratory_Work_No_1.Task2

import kotlin.io.path.Path
import kotlin.io.path.readText

class FileReader() {
    public fun readFileIntoString(path: String): String {
        val text = Path(path).readText()
        if (!text.isNullOrBlank()){
            return text
        } else {
            error("File is empty.")
        }

    }
}