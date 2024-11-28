package Laboratory_Work_No_3

class ArrayUpQueue<T>(
    private val initialSize: Int
) : Queue<T> {
    private val queue = arrayOfNulls<Any>(initialSize) as Array<T?>
    private var count = 0

    override fun enqueue(node: T) {
        if (count == initialSize) {
            println("Queue is full! First empty it before proceeding.")
        } else {
            queue[count] = node
            count++
        }
    }

    override fun dequeue(): T? {
        if (count == 0) {
            println("Queue is empty!")
            return null
        } else {
            val node = queue[0]
            for (i in 0 until count - 1) {
                queue[i] = queue[i + 1]
            }
            queue[count - 1] = null
            count--
            return node
        }
    }

    override fun peek(): T? {
        return queue[0]
    }

    override fun isEmpty(): Boolean {
        return count == 0
    }

    override fun size(): Int {
        return count
    }
}
