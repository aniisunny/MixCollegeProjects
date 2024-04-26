import java.util.*

fun shouldChangeWater(day : String, temperature : Int = 22, dirty : Int = 20) : Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater1(day : String, temperature: Int = 22, dirty : Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change Water: ${shouldChangeWater(day)}")
    println("Change Water: ${shouldChangeWater1(day)}")
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "Nothing"
    }
}

fun swim(speed : String = "fast") {
    println("Swimming $speed")
}

fun updateDirty(dirty : Int, operation : (Int) -> Int) : Int {
    return operation(dirty)
}

fun increaseDirty(start : Int) = start + 1

fun main() {
    val decorations = listOf("rocks", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter { it[0] == 'p' })
    val eager = decorations.filter { it[0] == 'p' }  // eager filters
    println("Eager: $eager")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }  // lazy filter
    println("Filtered: " + filtered)
    val newList = filtered.toList()
    println("Filtered: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("--------------")
    println("first: ${lazyMap.first()}")
    println("--------------")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }

    println("-------------")
    println("filtermap: ${lazyMap2.toList()}")
}

fun main(args : Array<String>) {
    println("Hello, ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if(temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${ if(temperature > 50) "too warm" else "OK" }"
    println(message)

    feedTheFish()

    swim()  // uses default speed
    swim("slow")  // positional argument
    swim(speed = "turtle-like")  // named parameter

    main()

    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = updateDirty(dirtyLevel) {dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}
