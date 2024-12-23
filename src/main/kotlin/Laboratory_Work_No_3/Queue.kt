package Laboratory_Work_No_3

// Interface to implement the queues
interface Queue<T> {
    fun enqueue(node: T)
    fun dequeue(): T?
    fun peek(): T?
    fun isEmpty(): Boolean
    fun size(): Int
}