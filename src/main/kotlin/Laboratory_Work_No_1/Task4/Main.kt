package Laboratory_Work_No_1.Task4

import Laboratory_Work_No_1.Task2.FileReader
import Laboratory_Work_No_1.Task2.InfoDisplay
import Laboratory_Work_No_1.Task2.TextData

import java.io.File

fun main(args: Array<String>) {
    // Instantiate a FileReader object
    val reader = FileReader()
    // Check if the command line arguments satisfy the lab condition
    if (args.size >= 2 && args.size % 2 == 0) {
        // Instantiate an InfoDisplay object to print information
        val printer = InfoDisplay()
        for (i in 0 until args.size step 2) {
            // Name of the file sent as a command line argument
            val name = args[i]
            // Filepath sent as a command line argument
            val path = args[i + 1]
            // Create a TextData object using the default constructor
            val text = TextData(fileName = name, text = reader.readFileIntoString(path))
            // Call the methods of the TextData using the printer object
            printer.displayInformation(text)
        }
    } else {
        // if the command line argument don't satisfy the lab condition, throw an error
        error("Command-line arguments need to have the structure: nameOfTheFile pathToTheFile.")
        // example of cmd line arguments:
        // faf_life.txt src/main/resources/Lab1/faf_life.txt input.txt src/main/resources/Lab1/input.txt lab_opinion.txt src/main/resources/Lab1/lab_opinion.txt
    }
}