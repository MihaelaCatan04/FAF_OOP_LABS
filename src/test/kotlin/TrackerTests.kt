import Laboratory_Work_No_3.Task2.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrackerTests {
    // Not to be run simultaneously, or it will modify the global variables and return errors
    @Test
    fun testPeopleTracker() {
        val peopleDinner1 = PeopleDinner()
        val peopleDinner2 = PeopleDinner()
        peopleDinner1.serveDinner("1")
        peopleDinner2.serveDinner("2")
        peopleDinner1.serveDinner("3")
        peopleDinner2.serveDinner("4")
        val robotDinner1 = RobotDinner()
        robotDinner1.serveDinner("1")
        assertEquals(PersonTracker.getCountPeople(), 4)
    }

    @Test
    fun testRobotTracker() {
        val robotDinner1 = RobotDinner()
        val robotDinner2 = RobotDinner()
        robotDinner1.serveDinner("1")
        robotDinner2.serveDinner("2")
        robotDinner1.serveDinner("3")
        val peopleDinner1 = PeopleDinner()
        peopleDinner1.serveDinner("1")
        assertEquals(RobotTracker.getCountRobots(), 3)
    }

    @Test
    fun testElectricCarTracker() {
        val electricStation1 = ElectricStation()
        val electricStation2 = ElectricStation()
        val gasStation1 = GasStation()
        electricStation1.refuel("1")
        electricStation2.refuel("2")
        electricStation1.refuel("3")
        gasStation1.refuel("4")
        assertEquals(ElectricCarTracker.getCountElectricCars(), 3)
    }

    @Test
    fun testGasCarTracker() {
        val gasStation1 = GasStation()
        val gasStation2 = GasStation()
        val electricStation1 = ElectricStation()
        gasStation1.refuel("1")
        gasStation2.refuel("2")
        gasStation1.refuel("3")
        electricStation1.refuel("4")
        assertEquals(GasCarTracker.getCountGasCars(), 3)
    }

}