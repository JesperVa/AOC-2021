package day1

import java.io.File

println(
    File("silverinput.txt").useLines { l -> l.map { it.toInt() }
        .zipWithNext()
        .count{ (p,c) -> p < c }
    }
)