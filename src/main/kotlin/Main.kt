import kotlin.math.*
import kotlin.random.Random

fun main() {
   val x_start = 0.0
   val x_end = 200.0
   val a = Random.nextDouble(x_start, x_end)
   val x = Random.nextDouble(x_start, x_end)
   val y = (x+5.0/(3*x/a)+ln(abs(cos(x)))/2/exp(x)+1.0e-5*x.pow(3))
   println(x_start)
   println(x_end)
   println(a)
   println(x)
   println(y)
}