package Laboratory_Work_No_3

import Laboratory_Work_No_3.Task1.ArrayDownQueue
import Laboratory_Work_No_3.Task1.ArrayUpQueue
import Laboratory_Work_No_3.Task1.LinkedListQueue
import Laboratory_Work_No_3.Task2.ElectricStation
import Laboratory_Work_No_3.Task2.GasStation
import Laboratory_Work_No_3.Task2.PeopleDinner
import Laboratory_Work_No_3.Task2.RobotDinner
import Laboratory_Work_No_3.Task3.CarStation

fun main(args: Array<String>) {
    val stationsList = buildList {
        add(CarStation(PeopleDinner(), ElectricStation(), ArrayDownQueue(10)))
        add(CarStation(RobotDinner(), ElectricStation(), ArrayUpQueue(10)))
        add(CarStation(PeopleDinner(), GasStation(), LinkedListQueue()))
        add(CarStation(RobotDinner(), GasStation(), LinkedListQueue()))
    }
}