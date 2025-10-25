package pets
open class Pet(
    val name: String ,
    val maxHealth: Int ,
    val speed: Int
){
    fun describe(){
    println("Питомец: $name, Здоровье:$maxHealth, Скорость: $speed")
    }
    fun makeSound(){
        println("$name подает голос")
    }
}

