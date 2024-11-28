package Laboratory_Work_No_3

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class Semaphore(
    private var carStationList: List<CarStation>,
) {
    fun getCarStationList(): List<CarStation> {
        return carStationList
    }

    private val mapper = jacksonObjectMapper()

    private fun mapCar(text: String): Car {
        val car: Car = mapper.readValue(text)
        return car
    }

    private fun readMultipleCars(stringCarQueue: Queue<String>): Queue<Car> {
        val carQueue = LinkedListQueue<Car>()
        for (i in 0 until stringCarQueue.size()) {
            val carString = stringCarQueue.dequeue() ?: continue
            carQueue.enqueue(mapCar(carString))
        }
        return carQueue
    }


    private fun guideCar(car: Car) {
        if (car.type == "ELECTRIC" && car.passengers == "PEOPLE") {
            carStationList.find {
                it.getRefuellingService() is ElectricStation && it.getDinningService() is PeopleDinner
            }?.addCar(car)
        }

        if (car.type == "GAS" && car.passengers == "PEOPLE") {
            carStationList.find {
                it.getRefuellingService() is GasStation && it.getDinningService() is PeopleDinner
            }?.addCar(car)
        }

        if (car.type == "ELECTRIC" && car.passengers == "ROBOTS") {
            carStationList.find {
                it.getRefuellingService() is ElectricStation && it.getDinningService() is RobotDinner
            }?.addCar(car)
        }

        if (car.type == "GAS" && car.passengers == "ROBOTS") {
            carStationList.find {
                it.getRefuellingService() is GasStation && it.getDinningService() is RobotDinner
            }?.addCar(car)
        }
    }


    fun serveCars(stringCarQueue: Queue<String>) {
        val processedQueue = readMultipleCars(stringCarQueue)
        while (processedQueue.size() > 0) {
            val car = processedQueue.dequeue() ?: continue
            guideCar(car)
        }
    }
}