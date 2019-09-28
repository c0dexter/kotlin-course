package com.c0dexter.funkcje

object FunkcjeMain1 {

    @JvmStatic
    fun main(args: Array<String>){
        Funkcje1().printHello("Michał") // Wykorzystanie argumentu domyślnego liczba: Int = 5
        Funkcje1().printHello("Michał", 2)
    }
}
