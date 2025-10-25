package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiresClearance: Int,
    val isCovert: Boolean
): Mission(title, reward) {
    fun showReward(){
        println("Требуемый допуск: $requiresClearance")
        println("Режим секретности: ${if(isCovert)"Совершенно секретно" else "Обычный"}")
    }
}