package example.myapp

import kotlin.math.PI

//class Aquarium {
//
//    var width : Int = 20
//    var height : Int = 40
//    var length : Int = 100
//
//    fun printSize() {
//        println("Width: $width cm  " +
//                "Length: $length cm  " +
//                "Height: $height cm")
//    }
//}

open class Aquarium(open var length : Int = 100, open var width : Int = 20, open var height : Int = 40) {

//    var length : Int = length
//    var width : Int = width
//    var height : Int = height

    open val shape = "rectangle"
    open var water : Double = 0.0
        get() = volume * 0.9

//    init {
//        println("Aquarium initializing")
//    }
//
//    init {
//        println("Volume: ${width * length * height / 1000} l")
//    }

    open var volume : Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    constructor(numberOfFish : Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(shape)
        println("Width: $width cm  Length: $length cm  Height: $height cm")
        println("Volume: $volume l")
        println("Water: $water l")
    }
}

class TowerTank(override var height : Int, var diameter : Int) : Aquarium(height = height, width = diameter, length = diameter) {

    override var volume : Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}