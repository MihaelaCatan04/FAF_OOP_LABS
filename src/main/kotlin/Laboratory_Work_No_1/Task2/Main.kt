package Laboratory_Work_No_1.Task2

import java.io.File

fun main(args: Array<String>) {
    val reader = FileReader()
    if (args.size == 2) {
        val name = args[0]
        val path = args[1]
        // println("File $name content: \n${reader.readFileIntoString(path)}")
        var text1 = TextData(fileName = args[0], text = reader.readFileIntoString(args[1]))
        println ("Filename: ${text1.getFilename()}")
        println ("Text: ${text1.getText()}")
        println ("Number Of Vowels: ${text1.getNumberOfVowels()}")
        println ("Number Of Consonants: ${text1.getNumberOfConsonants()}")
        println ("Number Of Letters: ${text1.getNumberOfLetters()}")
        println ("Number of Sentences: ${text1.getNumberOfSentences()}")
        println ("Longest Word: ${text1.getLongestWord()}")
        val text2 = TextData("Hello, World!")
        println ("Filename: ${text2.getFilename()}")
        println ("Text: ${text2.getText()}")
        println ("Number Of Vowels: ${text2.getNumberOfVowels()}")
        println ("Number Of Consonants: ${text2.getNumberOfConsonants()}")
        println ("Number Of Letters: ${text2.getNumberOfLetters()}")
        println ("Number of Sentences: ${text2.getNumberOfSentences()}")
        println ("Longest Word: ${text2.getLongestWord()}")
    } else {
        error("Command-line arguments need to have the structure: nameOfTheFile pathToTheFile.")
        // example of cmd line arguments: input.txt src/main/resources/Lab1/input.txt
    }
}