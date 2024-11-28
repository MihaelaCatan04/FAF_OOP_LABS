import Laboratory_Work_No_3.ArrayDownQueue
import Laboratory_Work_No_3.ArrayUpQueue
import Laboratory_Work_No_3.LinkedListQueue
import Laboratory_Work_No_3.Queue
import Laboratory_Work_No_3.ElectricStation
import Laboratory_Work_No_3.GasStation
import Laboratory_Work_No_3.PeopleDinner
import Laboratory_Work_No_3.RobotDinner
import Laboratory_Work_No_3.Car
import Laboratory_Work_No_3.CarStation
import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.test.assertEquals

class CarStationTests {

    private fun createElectricCarWithPeopleQueue(): Queue<Car> {
        val carArray = ArrayUpQueue<Car>(3)
        for (i in 0 until 3) {
            val car = Car(
                id = Random.nextInt(1000, 9999),
                type = "ELECTRIC",
                passengers = "PEOPLE",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
            carArray.enqueue(car)
        }
        return carArray
    }

    private fun createGasCarWithRobotsQueue(): Queue<Car> {
        val carArray = ArrayDownQueue<Car>(3)
        for (i in 0 until 3) {
            val car = Car(
                id = Random.nextInt(1000, 9999),  // Assign unique ID
                type = "GAS",
                passengers = "ROBOTS",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
            carArray.enqueue(car)
        }
        return carArray
    }

    private fun createGasCarWithPeopleQueue(): Queue<Car> {
        val carArray = LinkedListQueue<Car>()
        for (i in 0 until 3) {
            val car = Car(
                id = Random.nextInt(1000, 9999),
                type = "GAS",
                passengers = "PEOPLE",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
            carArray.enqueue(car)
        }
        return carArray
    }

    private fun createElectricPeopleCarStation(): CarStation {
        val carArray = createElectricCarWithPeopleQueue()
        return CarStation(PeopleDinner(), ElectricStation(), carArray)
    }

    private fun createGasRobotCarStation(): CarStation {
        val carArray = createGasCarWithRobotsQueue()
        return CarStation(RobotDinner(), GasStation(), carArray)
    }

    private fun createGasPeopleCarStation(): CarStation {
        val carArray = createGasCarWithPeopleQueue()
        return CarStation(PeopleDinner(), GasStation(), carArray)
    }

    @Test
    fun testElectricCarStation() {
        val carStation = createElectricPeopleCarStation()
        carStation.serveCars()
        assertEquals(carStation.getQueue().size(), 0)
        carStation.addCar(
            Car(
                id = 4,
                type = "ELECTRIC",
                passengers = "PEOPLE",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
        )
        assertEquals(carStation.getQueue().size(), 1)
    }

    @Test
    fun testGasCarStation() {
        val carStation = createGasRobotCarStation()
        carStation.serveCars()
        assertEquals(carStation.getQueue().size(), 0)
        carStation.addCar(
            Car(
                id = 4,
                type = "GAS",
                passengers = "ROBOTS",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
        )
        assertEquals(carStation.getQueue().size(), 1)
        var CarStation2 = createGasPeopleCarStation()
        CarStation2.serveCars()
        assertEquals(CarStation2.getQueue().size(), 0)
        CarStation2.addCar(
            Car(
                id = 4,
                type = "GAS",
                passengers = "PEOPLE",
                isDining = Random.nextBoolean(),
                consumption = Random.nextInt(0, 50)
            )
        )
        assertEquals(CarStation2.getQueue().size(), 1)
    }
}