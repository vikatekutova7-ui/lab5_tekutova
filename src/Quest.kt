class Quest {
    var title: String = "Безымянное задание"
    var duration: Int = 1
    var reward: Int = 100
    var difficulty: String = "Легкий"
    fun printInfo(){
        println("Название квеста: ${this.title}\nВремя выполнения: ${this.duration}\nНаграда: ${this.reward} золотых\nУровень сложности: ${this.difficulty}")
    }
}