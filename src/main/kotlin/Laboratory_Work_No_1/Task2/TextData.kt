package Laboratory_Work_No_1.Task2

import java.util.*

class TextData(
    private val fileName: String,
    private var text: String,
    private var numberOfVowels: Int = -1,
    private var numberOfConsonants: Int = -1,
    private var numberOfLetters: Int = -1,
    private var numberOfSentences: Int = -1,
    private var longestWord: String = ""
) {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val punctuationList = listOf(
        '.', ',', '!', '?', ':', ';',
        '\'', '"', '(', ')', '[', ']',
        '{', '}', '-', '_', '—', ' '
    )

    public fun TextData(text: String) {
        this.text = text
    }

    public fun getFilename(): String {
        return fileName
    }

    public fun getText(): String {
        return text
    }

    public fun getNumberOfVowels(): Int {
        if (numberOfVowels == -1) {
            numberOfVowels = 0
            for (char in text.lowercase()) {
                if (char in vowels) {
                    numberOfVowels++
                }
            }
        }
        return numberOfVowels
    }

    public fun getNumberOfConsonants(): Int {
        if (numberOfConsonants == -1) {
            numberOfConsonants = 0
            for (char in text.lowercase()) {
                if (!(char in vowels) && !(char in punctuationList)) {
                    numberOfConsonants++
                }
            }
        }
        return numberOfConsonants
    }

    public fun getNumberOfLetters(): Int {
        if (numberOfLetters == -1) {
            numberOfLetters = 0
            for (char in text) {
                if (!(char in punctuationList)) {
                    numberOfLetters++
                }
            }
        }
        return numberOfLetters
    }

    public fun getNumberOfSentences(): Int {
        if (numberOfSentences == -1) {
            numberOfSentences = 0
            for (char in text) {
                if (char == '.' || char == '!' || char == '?') {
                    numberOfSentences++
                }
            }
        }
        return numberOfSentences
    }

    public fun getLongestWord(): String {
        if (longestWord == "") {
            val words = text.split(Regex("[^\\w]"))
            for (word in words) {
                if (word.length > longestWord.length) {
                    longestWord = word
                }
            }
        }
        return longestWord
    }
}