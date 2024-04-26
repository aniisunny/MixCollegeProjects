package example.myapp.decor

data class Decoration(val rocks : String) {
}

data class Decoration2(val rocks : String, val wood : String, val diver : String) {

}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
    println(decoration2 == decoration3)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val(rock, _, diver) = d5
    println(rock)
    //println(wood)
    println(diver)
}

enum class Color(val rgb : Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees : Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main(args : Array<String>) {
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}