fun main(){
    val fireWall = Spell(name="огненная стена", width = 5, height = 3, symbol = "\uD83D\uDD25")
    fireWall.cast()
    val iceSheet = Spell(name="Ледяной щит", symbol = "\u2744\uFE0F", size = 4)
    iceSheet.cast()
}