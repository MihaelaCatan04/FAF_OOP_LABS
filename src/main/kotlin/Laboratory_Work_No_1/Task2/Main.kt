package Laboratory_Work_No_1.Task2

import java.io.File

fun main(args: Array<String>) {
    val reader = FileReader()
    if (args.size == 2) {
        var printer = InfoDisplay()
        val name = args[0]
        val path = args[1]
        // println("File $name content: \n${reader.readFileIntoString(path)}")
        var text1 = TextData(fileName = name, text = reader.readFileIntoString(path))
        printer.displayInformation(text1)
        val text2 = TextData("Hello, people!")
        printer.displayInformation(text2)
        } else {
        error("Command-line arguments need to have the structure: nameOfTheFile pathToTheFile.")
        // example of cmd line arguments: input.txt src/main/resources/Lab1/input.txt
    }
}