package com.c0dexter.konstruktoryWtorne

// Konstruktor pierwotny
class ExampleKotlinA constructor(var liczba: Int) {

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


class ExampleKotlinB (var liczba: Int,
                      var tekst: String = "tekst"){
// Ten zapis jest równoznaczny z zapisem w klasie "ExampleJava.class"
}