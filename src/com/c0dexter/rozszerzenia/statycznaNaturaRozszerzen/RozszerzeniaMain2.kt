package com.c0dexter.rozszerzenia

import com.c0dexter.dane.Dane
import com.c0dexter.rozszerzenia.statycznaNaturaRozszerzen.KlasaNadrzedna
import com.c0dexter.rozszerzenia.statycznaNaturaRozszerzen.KlasaPochodna
import com.c0dexter.rozszerzenia.statycznaNaturaRozszerzen.wypisz

object RozszerzeniaMain2 {

    @JvmStatic
    fun main(args: Array<String>){
        val kj = Dane("Krzyś", "Jackowski")
        val aj = kj.copy(imie = "Arek")

         "krzyś".removeLastChart()  // funkcji rozszerzających można użyć standardowo po kropce tak jak funkcji wbudowanych w API

        println(kj)
        println(aj)

        val(imie, nazwisko) = kj
        println("imie: $imie, nazwisko: $nazwisko")

        ekspreymentRozszerzania(KlasaPochodna())    //
    }

    // WAŻNE: Funkcje rozszerzające nie zmieniają składników klas które rozszerzają
    fun ekspreymentRozszerzania(klNad: KlasaNadrzedna){
        klNad.wypisz()  // wykona się wyrażenie na rzecz którego wykonywana jest funkcja (wołamy klasę nadrzędną)
    }

}
