package Laboratory_Work_No_0

fun main() {
    // Create an instance of FileReader to read from the specified input JSON file
    val fileReader = FileReader()

    // Read data from the JSON file
    val data = fileReader.readJson("src/main/resources/Lab0/input.json")

    // Parse data from the JSON
    val creatures = fileReader.parseJson(data)

    // Create an instance of UniverseClassifier to classify the creatures
    val classifier = UniverseClassifier()

    // Classify the creatures based on their traits and characteristics
    classifier.classify(creatures)

    // Create an instance of OutputWriter to write classified creatures to output files
    val outputWriter = OutputWriter()

    // Write the classified creatures to respective output JSON files for each universe
    outputWriter.writeToOutputFiles("src/main/resources/Lab0/output", classifier.universes)

    // Print a message indicating that the classification and output writing process is complete
    println("Classification complete. Output files written.")

    // Create an instance of View to display the output to the console
    val view = View()
    // Show the contents of the output files for each universe on the screen
    view.showContent()
}
