package Laboratory_Work_No_1.Task1

fun main() {
    // Instantiate 3 objects of the Display class
    val monitors = listOf(
        Display(1600, 900, 100.5f, "ASUS"),
        Display(1920, 1200, 106.99f, "Samsung"),
        Display(2560, 1080, 98.0f, "Dell")
    )
    // Compare the objects in between them
    for (firstMonitor in monitors) {
        for (secondMonitor in monitors)
            if (firstMonitor != secondMonitor) {
                firstMonitor.compareSize(secondMonitor)
                firstMonitor.compareSharpness(secondMonitor)
                firstMonitor.compareWithMonitor(secondMonitor)
            }
    }
}