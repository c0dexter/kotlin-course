package com.c0dexter.konstruktoryWtorne

// Konstruktor pierwotny
class ExampleKotlin constructor(var liczba: Int) {

    var tekst: String = "tekst"

    init {
        print(liczba)
    }

    /*
    Konstruktor wtórny
    - piczemy od razu w ciele klasy
    - nie używamy nazwyklasy, tylko słowo kluczowe "construktor"
     */
    constructor(liczba: Int, tekst: String): this(liczba){
        this.tekst = tekst
    }

}


class ExampleKotlin1 (var liczba: Int,
                      var tekst: String = "tekst"){
// Ten zapis jest równoznaczny z zapisem w klasie "ExampleJava.class"
}