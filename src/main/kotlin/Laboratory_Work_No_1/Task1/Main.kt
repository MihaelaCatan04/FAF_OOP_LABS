package Laboratory_Work_No_1.Task1

fun main() {
    val monitor1 = Display(1600, 900, 100.5f, "ASUS")
    val monitor2 = Display(1920, 1200, 106.99f, "Samsung")
    val monitor3 = Display(2560, 1080, 98.0f, "Dell")
    monitor1.compareSize(monitor2)
    monitor1.compareSharpness(monitor2)
    monitor1.compareWithMonitor(monitor2)
    monitor2.compareSize(monitor3)
    monitor2.compareSharpness(monitor3)
    monitor2.compareWithMonitor(monitor3)
    monitor3.compareSize(monitor1)
    monitor3.compareSharpness(monitor1)
    monitor3.compareWithMonitor(monitor1)
}