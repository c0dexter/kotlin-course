package com.c0dexter.funkcje.interfejsy

interface Interfejs2 {

    // PROPERCJE W INTERFEJSACH NIE MOGĄ PRZECHOWYWAĆ STANU, ZA PROPERCJAMI NIE STOJĄ FIELDY (POLA)

    val wartosc: String // propercja abstrakcyjna (nie posiada przypisanej wartości)

    val wartoscTekstu: String
        get() = "jakisTamTekst"     // możliwa propercja dostarczająca wartość za pomocą getterów i setterów


    fun abstrakcyjna()

    fun zCialem() {
    }

}