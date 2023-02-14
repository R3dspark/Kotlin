fun main() {
   println("Введите начальный х ")
   var x_start = readLine()!!.toInt()
   println("Введите конечный х ")
   var x_end = readLine()!!.toInt()
   val a = (x_start..x_end).random()
   if (x_end > x_start)
       x_end = x_start.also { x_start = x_end}
   println("""Значение а = $a
       |Изменённый x_start = $x_start
       |Изменённый x_end = $x_end
   """.trimMargin())
}