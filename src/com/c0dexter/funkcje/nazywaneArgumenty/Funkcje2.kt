package com.c0dexter.funkcje

open class Funkcje2 {

    open fun printHello(
        textToPrint: String,
        liczba: Int = 5,
        innyInt: Int = 6,
        jakisString: String = "Test",
        vararg stringi: String
    ) { // vararg - lista argumentów z kropkami (Java)
        println("Hello! So much fun! $textToPrint Liczba: $liczba")
    }
}

class NowaKlasa : Funkcje2() {

    override fun printHello(
        textToPrint: String,
        liczba: Int,
        innyInt: Int,
        jakisString: String,
        vararg stringi: String
    ) {   // nie można nadpisać argumentu domyślnego, należy usunąć inicjalizację
        println("Hello! So much fun! $textToPrint Liczba: $liczba, inna liczba: $innyInt, tekst: $jakisString")
    }

}
