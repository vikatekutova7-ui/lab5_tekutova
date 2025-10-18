class Contract (
    val clientName: String,
    val taskDescription: String,
    val reward: Int,
    val isUrgent: Boolean=false
){
    fun printContractInfo(){
        println("Заказчик: $clientName")
        println("Задача: $taskDescription")
        println("Награда: $reward")
        println("Срочность: ${if (isUrgent) "срочно!" else "обычный контракт"}")
    }



}