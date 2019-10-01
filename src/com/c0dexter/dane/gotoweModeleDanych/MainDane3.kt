package com.c0dexter.dane.gotoweModeleDanych

object MainDane3 {

    @JvmStatic
    fun main(args: Array<String>) {

        val kj = Dane3("Krzyś", "Jackowski")
        val aj = kj.copy(imie = "Arek")

        println(kj)
        println(aj)

        /*
        GOTOWE MODELE DANYCH - DOMYŚLNE MODELE DOSTĘPNE W API KOTLINA, NP:
        - Pair<A, B>
        - Triple<A, B, C>
         */
    }
}
