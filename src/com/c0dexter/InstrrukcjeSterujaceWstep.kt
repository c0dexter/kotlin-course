package com.c0dexter

fun main(args: Array<String>) {

    /*
     W Kotlinie IF zwraca wartość
     IF może zostać potraktowany jako funkcja
     IF zwraca ostatnią wartość bloku
     */

    var wynik = if (args[1].length > 0) {
        println(5)
        5
    } else {
        println(0)
        0
    }

}