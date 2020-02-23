fun main() {
    val a = 1
    val b = 2
    val c = 3

    var add = a+b
    var sub = b-a
    var mult = b*c
    var div = a/b.toDouble()
    var mod = c%b

    println("$a + $b = $add")
    println("$b - $a = $sub")
    println("$b * $c = $mult")
    println("$a / $b = $div")
    println("$c % $b = $mod")
}