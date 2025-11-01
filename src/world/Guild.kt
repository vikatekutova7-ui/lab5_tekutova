package world

fun main() {
    val quest = Quest(title = "охота на гоблинов", duration = 2, reward = 3400, difficulty = "легкий", questType = QuestType.ESCORT)
    quest.printInfo()
    val contract = Contract(title = "Защита каравана", clientName = "Гильдия купцов", taskDescription = "Охрана груза", reward = 1200)
    val specialOp = SpecialOperation(title = "Операция 'Тень", reward = 2500, requiresClearance = 2, isCovert = true)
    println("Информация о квесте:")

    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения в часах: ")
    val dirution = readln().toInt()
    print("Введите награду(в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности")
    val difficulty = readln()
//    quest.title = title
//    quest.duration = dirution
//    quest.reward = reward
//    quest.difficulty = difficulty
    println("Название квеста: ${quest.title}\nВремя выполнения: ${quest.duration}\nНаграда: ${quest.reward} золотых\nУровень сложности: ${quest.difficulty}")
//    val quest2 = Quest(title = "побег из замка", duration = 5, reward = 700, difficulty = "сложный")
//    println("квест сложный? ${quest2.isHard()}")
}