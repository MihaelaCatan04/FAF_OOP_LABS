package Laboratory_Work_No_3

class ArrayDownQueue<T>(
    private val initialSize: Int
) : Queue<T> {
    private val queue: Array<T?> = arrayOfNulls<Any>(initialSize) as Array<T?>
    private var free = initialSize

    override fun enqueue(node: T) {
        if (free == 0) {
            println("Queue is full! First empty it before proceeding.")
        } else {
            queue[initialSize - free] = node
            free--
        }
    }

    override fun dequeue(): T? {
        if (free == initialSize) {
            println("Queue is empty!")
            return null
        } else {
            val node = queue[0]
            for (i in 0 until initialSize - free - 1) {
                queue[i] = queue[i + 1]
            }
            queue[initialSize - free - 1] = null
            free++
            return node
        }
    }

    override fun peek(): T? {
        return if (free == initialSize) null else queue[0]
    }

    override fun isEmpty(): Boolean {
        return free == initialSize
    }

    override fun size(): Int {
        return initialSize - free
    }
}
