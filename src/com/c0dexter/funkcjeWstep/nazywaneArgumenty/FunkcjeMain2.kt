package com.c0dexter.funkcjeWstep.nazywaneArgumenty
 import com.c0dexter.funkcjeWstep.NowaKlasa

object FunkcjeMain2 {

    @JvmStatic
    fun main(args: Array<String>){
        NowaKlasa().printHello("Michał") // Wykorzystanie argumentu domyślnego liczba: Int = 5
        NowaKlasa().printHello("Michał", 2)
        NowaKlasa().printHello("Michał", 2, innyInt = 3, jakisString = "cośTam") // Argumenty nazwane
        NowaKlasa().printHello("Michał", 2, innyInt = 3, jakisString = "cośTam", stringi = *arrayOf("a", "b", "c"))

        /*
        ARGUMENTY NAZWANE:
        - to argumenty z wartością domyślną, które są opcjonalne, jednak wartość jest przypisana po podaniu ich nazwy
        - argumenty wymagane muszą być podane jako pierwsze, nie można mieszać kolejności np. (nazwany, nienazwany, nazwany, nienazwany, nienazwany) (CTRL+P)
        - brak wypisania argumentu nazwanego powoduje jego pominięcie
        - przypiasnie wartości do argumentu nazwanego wymaga podania jego nazwy
        - po podaniu nazwy któregoś z argumentów nazwanych musimy podać nazwy pozostałych argumentów nazwanych
         */
    }
}