package Laboratory_Work_No_1.Task3

import Laboratory_Work_No_1.Task1.Display

fun main() {
    // Create a list of monitors
    val monitors = mutableListOf(
        Display(1600, 900, 100.5f, "ASUS"),
        Display(1920, 1200, 106.99f, "Samsung"),
        Display(2560, 1080, 98.0f, "Dell")
    )
    // Meet Chaarlie, an assistant - instance of the class Assistant
    val assistant = Assistant("Charlie", monitors)
    // Create a new Display instance to pass as parameter to assignDisplay()
    val newDisplay = Display(2560, 1080, 100.5f, "Xiaomi")
    assistant.assignDisplay(newDisplay)
    assistant.assist()
    // Buy a monitor
    val boughtDisplay = newDisplay
    println("Congratulations! You bought the following display: ${boughtDisplay.getName()}")
}