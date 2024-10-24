package Laboratory_Work_No_1.Task3

import Laboratory_Work_No_1.Task1.Display

class MonitorComparer() {
    public fun compareMonitors(monitorList: List<Display>) {
        for (firstMonitor in monitorList) {
            for (secondMonitor in monitorList) {
                if (firstMonitor != secondMonitor) {
                    firstMonitor.compareSize(secondMonitor)
                    firstMonitor.compareSharpness(secondMonitor)
                    firstMonitor.compareWithMonitor(secondMonitor)
                }

            }
        }
    }
}