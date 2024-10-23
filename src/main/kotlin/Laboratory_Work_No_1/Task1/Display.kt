package Laboratory_Work_No_1.Task1

class Display(
    private var width: Int,
    private var height: Int,
    private var ppi: Float,
    private var model: String,
) {
    public fun compareSize(m: Display) {
        val selfArea = width * height
        val mArea = m.width * m.height
        when {
            selfArea > mArea -> println("The screen of the $model monitor is bigger than the screen of the ${m.model} monitor.")
            selfArea < mArea -> println("The screen of the ${m.model} monitor is bigger than the screen of the $model monitor.")
            else -> println("The screen of the $model monitor and the screen of the ${m.model} monitor have the same size.")
        }
    }

    public fun compareSharpness(m: Display) {
        when {
            ppi > m.ppi -> println("The screen of the $model monitor is sharper than the screen of the ${m.model} monitor.")
            ppi < m.ppi -> println("The screen of the ${m.model} monitor is sharper than the screen of the $model monitor.")
            else -> println("The screen of the $model monitor and the screen of the ${m.model} monitor have the same sharpness.")
        }
    }

    public fun compareWithMonitor(m: Display) {
        compareSharpness(m);
        compareSize(m);
    }

}