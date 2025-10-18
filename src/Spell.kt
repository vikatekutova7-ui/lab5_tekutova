class Spell(
    val name: String="",
    val  width: Int=0,
    val height: Int=0,
    val symbol: String="") {

    constructor():
            this (name="", width = 0, height = 0, symbol = "")
//    constructor(name: String, width: Int, height: Int,symbol: String){
//        this.name = name
//        this.width=width
//        this.height=height
//        this.symbol= symbol
//
//    }
//    constructor(name: String, size: Int,symbol: String) {
//        this.name = name
//        this.width = size
//        this.height = size
//        this.symbol = symbol
//    }
    fun cast(){
        println("кастуем $name")
        repeat(times=height){
            repeat(times = width){
                print(symbol)
            }
            println()
        }

    }

}