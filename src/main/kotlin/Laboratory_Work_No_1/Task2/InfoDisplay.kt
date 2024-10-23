package Laboratory_Work_No_1.Task2
// InfoDisplay class to call the methods of the TextData class
class InfoDisplay {
    public fun displayInformation(text: TextData){
        println ("Filename: ${text.getFilename()}")
        println ("Text: ${text.getText()}")
        println ("Number Of Vowels: ${text.getNumberOfVowels()}")
        println ("Number Of Consonants: ${text.getNumberOfConsonants()}")
        println ("Number Of Letters: ${text.getNumberOfLetters()}")
        println ("Number of Sentences: ${text.getNumberOfSentences()}")
        println ("Longest Word: ${text.getLongestWord()}")
    }
}