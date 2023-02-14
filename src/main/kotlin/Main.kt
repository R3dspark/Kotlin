fun main() {
   println("Введите начальный х ")
   val x_start = readLine()!!.toInt()
   println("Введите конечный х ")
   val x_end = readLine()!!.toInt()
   val a = (x_start..x_end).random()
   println("Значение а = $a")
}