fun main() {
   var x_start = 0
   var x_end = 250
   val a = (x_start.. x_end).random()
   if (x_end > x_start)
       x_end = x_start.also { x_start = x_end }
   println(x_start)
   println(x_end)
   println(a)
}