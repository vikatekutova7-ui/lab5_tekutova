class Enemy {
    var name: String = "Враг"
    var hp: Int = 50
    var element: String = " Огонь"
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