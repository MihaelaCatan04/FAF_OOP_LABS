package Laboratory_Work_No_3.Task4

import Laboratory_Work_No_3.Task2.ElectricStation
import Laboratory_Work_No_3.Task2.GasStation
import Laboratory_Work_No_3.Task2.PeopleDinner
import Laboratory_Work_No_3.Task2.RobotDinner
import Laboratory_Work_No_3.Task3.Car
import Laboratory_Work_No_3.Task3.CarStation

class Semaphore (
    private val carStationList: List<CarStation>
) {
    fun guideCar(car: Car) {
        if (car.type == "ELECTRIC" && car.passengers == "PEOPLE") {
            carStationList.find {it.getRefuellingService() == ElectricStation::class.java && it.getDinningService() == PeopleDinner::class.java}?.addCar(car)
        }
        if (car.type == "GAS" && car.passengers == "PEOPLE") {
            carStationList.find {it.getRefuellingService() == GasStation::class.java && it.getDinningService() == PeopleDinner::class.java}?.addCar(car)
        }
        if (car.type == "ELECTRIC" && car.passengers == "ROBOTS") {
            carStationList.find {it.getRefuellingService() == ElectricStation::class.java && it.getDinningService() == RobotDinner::class.java}?.addCar(car)
        }
        if (car.type == "GAS" && car.passengers == "ROBOTS") {
            carStationList.find {it.getRefuellingService() == GasStation::class.java && it.getDinningService() == RobotDinner::class.java}?.addCar(car)
        }

    }
}