package Laboratory_Work_No_3

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

    fun getRefuellingService(): Refuelable {
        return refuellingService
    }

    fun getDinningService(): Dineable {
        return dinningService
    }
}