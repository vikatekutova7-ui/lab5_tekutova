package characters

class Enemy (
    name: String = "Враг",
    hp: Int = 50,
    element: String = " Огонь"):GameCharacter(name, hp, element){
//    constructor(name: String, hp: Int, element: String){
//        this.name = name
//        this.hp = hp
//        this.element = element
//    }
    fun takeDamage(amount: Int){
        println("$name получает урон")
        hp-=amount
        println("Здоровья врага: $hp")
        if (hp<0){
            die()
            println("вы победили")
        }
    }
    fun die(){
        println("враг побежден")
    }
    }