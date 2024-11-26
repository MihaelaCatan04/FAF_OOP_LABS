package Laboratory_Work_No_3.Task1

class ArrayDownQueue<T>(
    private val initialSize: Int
) : Queue<T> {
    private val queue = arrayOfNulls<Any>(initialSize) as Array<T?>
    private var free = initialSize

    override fun enqueue(node: T) {
        if (free == 0) {
            println("Queue is full! First empty it before proceeding.")
        } else {
            queue[free - 1] = node
            free--
        }
    }

    override fun dequeue(): T? {
        if (free == initialSize) {
            println("Queue is empty!")
            return null
        } else {
            if (initialSize - free == 1) {
                val node = queue[free]
                queue[initialSize - 1] = null
                free++
                return node
            } else {
                val node = queue[initialSize - 1]
                for (i in free..initialSize - 2) {
                    queue[i + 1] = queue[i]
                }
                free++
                return node
            }
        }
    }

    override fun peek(): T? {
        return queue[initialSize - 1]
    }

    override fun isEmpty(): Boolean {
        return free == initialSize
    }

    override fun size(): Int {
        return initialSize - free
    }
}