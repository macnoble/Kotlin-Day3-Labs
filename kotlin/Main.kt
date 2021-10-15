import java.util.stream.IntStream
import kotlin.streams.toList

fun main(args: Array<String>) {
    // println(calculateFactorial(5))

//    val double = {i : Int -> i * 2}   // function is of type (Int)
//    // println(double(9))
//    val intToCompose: Int = 10
//    val multiply = {i : Int -> i*intToCompose}
//    val composition =  {i:Int -> double(multiply(i)) }
//    println(composition(3))

    // println(totalLength(listOf("Hello", "World", "How", "Are", "You")))

    val string : List<String>  = listOf("Hello", "World", "How", "Are", "You")



}

fun totalLength(strings : List<String>) : Int = strings.sumOf{it.length}

// fun totalLength(strings : List<String>): Int = strings.map{it.length}.reduce { acc,a ->a+acc  }


tailrec fun calculateFactorial (n : Int) : Int {
    return if (n < 0) 0 else when (n) {
        0, 1 -> 1
        else -> n * calculateFactorial(n - 1)
    }
}

