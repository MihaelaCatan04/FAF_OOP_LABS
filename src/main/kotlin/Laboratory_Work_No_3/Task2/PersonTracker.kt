package Laboratory_Work_No_3.Task2

class PersonTracker {
    companion object {
        private var countPerson = 0
        fun trackPerson() {
            countPerson++
        }
        fun getCountPeople(): Int {
            return countPerson
        }
    }
}