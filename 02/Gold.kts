package day2

import java.io.File

val arr = IntArray(3)
File("input.txt").forEachLine {
    val split = it.split(" ")
    val value = split[1].toInt()
    when(split[0]) {
        "forward" -> {
            arr[0] += value
            arr[1] += (arr[2] * value)
        }
        "down" -> arr[2] += value
        "up" -> arr[2] -= value
    }
}
println(arr[0] * arr[1])