package com.c0dexter.funkcje

open class Funkcje1{

    open fun printHello(textToPrint: String, liczba: Int = 5){   // zainicjalizowanie argumentu powoduje jego opcjonalność przy wywołaniu metody
    println("Hello! So much fun! $textToPrint Liczba: $liczba")
    }
}

class NoweFunkcje: Funkcje1(){

    override fun printHello(textToPrint: String, liczba: Int){   // nie można nadpisać argumentu domyślnego, należy usunąć inicjalizację
    println("Hello! So much fun! $textToPrint Liczba: $liczba")
    }

}
