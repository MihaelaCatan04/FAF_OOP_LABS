package Laboratory_Work_No_1.Task3

import Laboratory_Work_No_1.Task1.Display

class Assistant(
    private var assistantName: String,
    private var assignedDisplays: MutableList<Display>
) {
    public fun assignDisplay(d: Display) {
        assignedDisplays.add(d)
    }

    public fun assist() {
        val comparer = MonitorComparer()
        comparer.compareMonitors(assignedDisplays)
    }

    public fun buyDisplay(d: Display): Display {
        if (assignedDisplays.remove(d)) {
            return d
        } else {
            error("The display is not in the list.")
        }
    }
}