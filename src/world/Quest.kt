package world

class Quest (
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {
    override fun describe(){
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.descriptor}")
    }
    fun printInfo(){
        println("Название квеста: ${this.title}\nВремя выполнения: ${this.duration}\nНаграда: ${this.reward} золотых\nУровень сложности: ${this.difficulty}")
        println("Тип квеста: ${questType.descriptor}")
    }
    fun isHard(): Boolean{
        return difficulty.lowercase() == "сложный"
    }
}