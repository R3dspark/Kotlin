import kotlin.random.Random
import kotlin.math.*


fun main() {
   println("Введите начальный х ")
   var x_start = readLine()!!.toDouble()
   println("Введите конечный х ")
   var x_end = readLine()!!.toDouble()

    val a = Random.nextDouble(x_start, x_end)
    val diff = (x_end - x_start)
    val Step =  diff/100
    val numSteps = (diff/Step).toInt() + 1
    if (x_end > x_start)
        x_end = x_start.also { x_start = x_end}
    for (i in 0 until numSteps){
        val x = x_start + i * Step
        val y = (x+5.0/(3*x/a)+ln(abs(cos(x)))/2/exp(x)+1.0e-5*x.pow(3))
        println("Значение а = " + String.format("%.3f", a))
        println("""Изменённый x_start = $x_start
Изменённый x_end = $x_end
Шаг = $Step
Значение у = 
   """.trimMargin()+ String.format("%.3f", y))
        break
    }
    }
