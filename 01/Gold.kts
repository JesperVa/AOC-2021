package day1

import java.io.File

val queue = ArrayDeque<Int>(3)
var count : Int = 0
File("goldinput.txt").forEachLine {
    val value = it.toInt()
    if (queue.size == 3 && queue.removeFirst() < value) count += 1
    queue.add(value)
}
println(count)