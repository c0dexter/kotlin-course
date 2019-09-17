package com.c0dexter

fun main(){
    // ### TYP TABLICOWY ###
    val tablica: Array<Int> = arrayOf(1,2,3,4) // arrayOf -> Utworzenie tablicy z elementów
    println("Trzeci element tablicy to " + tablica[2])

    val tablicaBoolean = booleanArrayOf(true, true, false)
    println(tablicaBoolean[1]) // Odwołanie do elementu poprzez indeks

    val tablicaLambdy = Array(10) { i -> i*i }
    for (element in tablicaLambdy){
        println(element)
    }

    val napis = "Hej"
    println(napis[1]) // Zostanie wydrukowane "e"

    val tablicaRozneTypy = arrayOf("JakisSring", 10) // typ tablicy zostaje okreslony jako ANY co odpowiada Object w Javie
// WAŻNE: do tablicy typu ANY nie można przypisać tablicy konkretnego typu!!!
}
