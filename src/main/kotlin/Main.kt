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
    if (x_end > x_start)
        x_end = x_start.also { x_start = x_end}
println("Значение а = " + String.format("%.3f", a))
println("""Изменённый x_start = $x_start
Изменённый x_end = $x_end
Шаг = $Step""")}

