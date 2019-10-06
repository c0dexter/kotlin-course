package com.c0dexter.rozszerzenia.statycznaNaturaRozszerzen

open class KlasaNadrzedna(){

}

class KlasaPochodna : KlasaNadrzedna() {

}

fun KlasaPochodna.wypisz() = println("pochodna")
fun KlasaNadrzedna.wypisz() = println("nadrzędna")