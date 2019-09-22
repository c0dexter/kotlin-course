package com.c0dexter

import java.util.*

fun main() {

    /*
    Pętle while i do-while wyglądają i działają dokladnie tak samo jak w Javie
    JEDYNA ZMIANA: w pętli do-while zmienne zadeklarowane w bloku DO są dostępne w bloku WHILE
     */

    val lista = ArrayList<Int>(2)

    // PĘTLA WHILE
    while (lista.isEmpty()) {
        println("test")
    }

    // PĘTLA DO-WHILE
    do {
        val size = lista.size
        println(size)
    } while (size < 5) // dostęp do zmiennej zadeklarowanej w bloku DO

}