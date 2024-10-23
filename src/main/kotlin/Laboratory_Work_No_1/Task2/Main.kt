package Laboratory_Work_No_1.Task2

import java.io.File

fun main(args: Array<String>) {
    val reader = FileReader()
    if (args.size == 2) {
        val name = args[0]
        val path = args[1]
        // println("File $name content: \n${reader.readFileIntoString(path)}")
        var text = TextData(fileName = args[0], text = reader.readFileIntoString(args[1]))
        println("Filename: ${text.getFilename()}")
        println("Text: ${text.getText()}")
        println("Number Of Vowels: ${text.getNumberOfVowels()}")
        println("Number Of Consonants: ${text.getNumberOfConsonants()}")
        println("Number Of Letters: ${text.getNumberOfLetters()}")
        println("Number of Sentences: ${text.getNumberOfSentences()}")
        println("Longest Word: ${text.getLongestWord()}")
    } else {
        error("Command-line arguments need to have the structure: nameOfTheFile pathToTheFile.")
        // example of cmd line arguments: input.txt src/main/resources/Lab1/input.txt
    }
}