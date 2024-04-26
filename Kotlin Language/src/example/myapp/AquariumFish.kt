package example.myapp

//abstract class AquariumFish : FishAction {
//    abstract val color : String
//    override fun eat() = println("yum")
//}

//class Shark : AquariumFish(), FishAction {
//    override val color = "grey"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}
//
//class Plecostomus : AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

interface FishAction {
    fun eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishColor {
    val color : String
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("eat algae"), FishColor by fishColor {
    //override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
}

class Shark(fishColor: FishColor = GrayColor) : FishAction by PrintingFishAction("hunt and eat fish"), FishColor by fishColor {
//    override val color = "gray"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food : String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GrayColor : FishColor {
    override val color = "gray"
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal : Seal) : String {
    return when(seal) {
        is SeaLion -> "Sea lion"
        is Walrus -> "Walrus"
    }
}