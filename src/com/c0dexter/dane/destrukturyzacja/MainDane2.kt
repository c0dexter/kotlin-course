package com.c0dexter.dane.destrukturyzacja

object MainDane2 {

    @JvmStatic
    fun main(args: Array<String>) {

        val kj = Dane2("Krzyś", "Jackowski")
        val aj = kj.copy(imie = "Arek")

        println(kj)
        println(aj)


        /*
        DESTRUKTURYZACJA
        - wykorzystywana do wypisywania czegoś w szablonach stringowych
        - w iterowaniu po kolekcjach obiektów z uwzględnieniem interesujących nas propercji
         */
        val(imieGoscia, nazwiskoGoscia) = kj
        println("immie = $imieGoscia, nazwisko = $nazwiskoGoscia")


        // Destrukturyzacja na kolekcji
        val ludzie: List<Dane2> = arrayListOf(kj, aj)

        for ((imie, nazwisko) in ludzie){
            println("Foreach imie: $imie, foreach nazwisko: $nazwisko")
        }

    }
}
