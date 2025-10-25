package world

class Quest (
    title: String,
    var duration: Int,
    reward: Int,
    var difficulty: String) : Mission(title, reward) {

    fun printInfo(){
        println("Название квеста: ${this.title}\nВремя выполнения: ${this.duration}\nНаграда: ${this.reward} золотых\nУровень сложности: ${this.difficulty}")
    }
    fun isHard(): Boolean{
        return difficulty.lowercase() == "сложный"
    }
}