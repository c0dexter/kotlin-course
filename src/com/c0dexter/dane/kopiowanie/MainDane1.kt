package com.c0dexter.dane.kopiowanie

object MainDane1 {

    @JvmStatic
    fun main(args: Array<String>) {

        val kj = Dane1("Krzyś", "Jackowski")
        val aj = kj.copy(imie = "Arek")
        // Kopiowanie obiektu ze zmienionym parametrem jest możliwe poprzez użycie funkcji copy na obiekcie
        // ora wykorzystanie argumentu nazwanego (imie = 'nowe_imie') w celu zmiany wartości argumentu w kopiowanym objekcie


        println(kj)
        println(aj)
    }
}
