package Laboratory_Work_No_1.Task2

import java.io.File

fun main(args: Array<String>) {
    val reader = FileReader()
    val name = args[0]
    val path = args[1]
    println("File $name content: \n${reader.readFileIntoString(path)}")
}