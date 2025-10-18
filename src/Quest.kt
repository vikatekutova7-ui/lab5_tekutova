import kotlin.time.Duration

class Quest {
    var title: String
    var duration: Int
    var reward: Int
    var difficulty: String
    constructor(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }
    fun printInfo(){
        println("Название квеста: ${this.title}\nВремя выполнения: ${this.duration}\nНаграда: ${this.reward} золотых\nУровень сложности: ${this.difficulty}")
    }
    fun isHard(): Boolean{
        return difficulty.lowercase() == "сложный"
    }
}