package com.c0dexter.konstruktoryWtorne

// Konstruktor pierwotny
open class ExampleKotlin constructor(var liczba: Int) {

    var tekst: String = "tekst"

    init {
        print(liczba)
    }


    // Konstruktor wtórny
    constructor(liczba: Int, tekst: String): this(liczba){
        this.tekst = tekst
    }

}

/*
DZIEDZICZENIE:
- klasy i interfejsy wyliczamy po dwukropku zamiast pisać extends/implements
- przekazujemy do konstruktora argumenty z nadklasy
- otworzyć klasę którą rozszerzamy za pomocą modyfikatora dostępu "open" (domyślnie wszystkie klasy w Kotlinie są finalne)
 */

class ExampleKotlin1 (var number: Int,
                      var text: String = "tekst"): ExampleKotlin(number, text){
}