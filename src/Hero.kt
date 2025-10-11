class Hero {
    var name: String = "Undefined"
    var gender: String = "не указан"
    var role: String = "бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "Огонь"
    fun sayHello(){
        println("Всем привет, мое имя - $name")
    }
    fun showStats(){
        println("Name: $name\nGender: $gender\nRole: $role\nHP: $hp\nMP: $mp")
    }
    fun meditate(){
        println("$name медитирует")
        mp+=20
        println("$name восстановил ману, текущая мана: $mp")
    }
    fun takeDamage(){
        println("$name получает урон!")
        hp-=10
        println("Осталось здоровья: $hp")
    }
    fun cellSpell(){
        if (mp>0){
            println("герой применяет магию. осталось: $mp")
        }
        else
            println("недостаточно маны! у вас осталось $mp")
    }
    fun heal(){
        if (mp<10){
            println("недостаточно маны! у вас осталось $mp")
            return
        }
        mp-=10
        mp+=10
        println("Лечусь! Восстановлено здоровье, потрачено 10 маны")
        println("здоровье: $hp")
    }
    fun  great(name: String){
        println("Hello $name")
    }
    fun takeDamage(amount: Int){
        println("$name получает урон")
        hp-=amount
        println("Здоровья осталось: $hp")
        if (hp<0){
            die()
            println("конец")

        }
    }
    fun die(){
        println("вы умерли")
    }
    fun duel(opponent: Hero){
        println("Дуэль между $name и ${opponent.name} начинается")
        println("$name атакует первым!")
        opponent.takeDamage(amount = 15)
        println("${opponent.name} отвечает")
        this.takeDamage(amount = 15)
        println("Дуэль завершена")
        println("Состояние героев: ")
        this.showStats()
        opponent.showStats()
    }

}