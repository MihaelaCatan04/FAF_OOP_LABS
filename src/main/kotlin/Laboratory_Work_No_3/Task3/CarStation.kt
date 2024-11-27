package Laboratory_Work_No_3.Task3

import Laboratory_Work_No_3.Task1.Queue
import Laboratory_Work_No_3.Task2.Dineable
import Laboratory_Work_No_3.Task2.Refuelable

class CarStation(
    private var dinningService: Dineable,
    private var refuellingService: Refuelable,
    private var queue: Queue<Car>,
) {
    fun serveCars() {
        while (queue.size() > 0) {
            var car = queue.dequeue()
            if (car != null) {
                if (car.isDining) {
                    dinningService.serveDinner(car.id.toString())
                }
                refuellingService.refuel(car.id.toString())
            }

        }
    }

    fun addCar(car: Car) {
        queue.enqueue(car)
    }

    fun getQueue(): Queue<Car> {
        return queue
    }
}