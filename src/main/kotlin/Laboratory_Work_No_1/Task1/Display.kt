package Laboratory_Work_No_1.Task1

class Display(
    private var width: Int,
    private var height: Int,
    private var ppi: Float,
    private var model: String,
) {
    private val objectComparer = ObjectComparison()
    public fun compareSize(m: Display) {

        val selfArea = width * height
        val mArea = m.width * m.height
        objectComparer.compareValues(selfArea.toFloat(), mArea.toFloat(), "size", model, m.model)

    }

    public fun compareSharpness(m: Display) {
        objectComparer.compareValues(ppi, m.ppi, "sharpness", model, m.model)
    }

    public fun compareWithMonitor(m: Display) {
        compareSize(m);
        compareSharpness(m);
    }

}