package magic

fun main(){
    val fireball = Spell(name="огненная стена", width = 5, height = 3, symbol = "\uD83D\uDD25")
    fireball.cast()
    val heal = InstantSpell(name = "Лечение", symbol = "\uD83D\uDC9A", power = 5)
    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration}")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration}")
}