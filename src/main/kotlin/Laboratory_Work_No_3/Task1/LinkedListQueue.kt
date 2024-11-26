package Laboratory_Work_No_3.Task1

class LinkedListQueue<T> : Queue<T> {
    private var front: Node<T>? = null
    private var back: Node<T>? = null
    private var size: Int = 0
    override fun enqueue(node: T) {
        val newNode = Node(node)
        if (back == null) {
            front = newNode
            back = newNode
        } else {
            newNode.next = back
            back = newNode
        }
        size++
    }

    override fun dequeue(): T? {
        val nodeToReturn = front
        if (nodeToReturn == null) {
            println("Queue is empty")
            return null
        }
        if (front == back) {
            front = null
            back = null
        } else {
            var node = back
            while (node?.next != front) {
                node = node?.next
            }
            front = node
            front?.next = null
        }
        size--
        return nodeToReturn.data
    }


    override fun peek(): T? {
        return front?.data
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun size(): Int {
        return size
    }

}