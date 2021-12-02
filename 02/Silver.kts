package day2

import java.io.File

val arr = IntArray(2)
File("input.txt").forEachLine {
    val split = it.split(" ")
    val value = split[1].toInt()
    when(split[0]) {
        "forward" -> arr[0] += value
        "down" -> arr[1] += value
        "up" -> arr[1] -= value
    }
}
println(arr[0] * arr[1])