package Laboratory_Work_No_1.Task1

// Display class as in condition
class Display(
    private var width: Int,
    private var height: Int,
    private var ppi: Float,
    private var model: String,
) {
    // Instantiate an ObjectComparison instance to use it in the methods of the Display class
    private val objectComparer = ObjectComparison()
    // Method to compare size
    public fun compareSize(m: Display) {

        val selfArea = width * height
        val mArea = m.width * m.height
        objectComparer.compareValues(selfArea.toFloat(), mArea.toFloat(), "size", model, m.model)

    }
    // Method to compare sharpness
    public fun compareSharpness(m: Display) {
        objectComparer.compareValues(ppi, m.ppi, "sharpness", model, m.model)
    }
    // Method to compare both sharpness and size
    public fun compareWithMonitor(m: Display) {
        compareSize(m);
        compareSharpness(m);
    }

}