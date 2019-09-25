package com.c0dexter.konstruktoryWtorne

// KLASA ABSTRAKCYJNA z natury nie jest finalna, więc jest OTWARTA: nie trzeba dawać modyfikatora dostępu "open"
abstract class ExampleKotlinG constructor(var liczba: Int) {

    // Przy nadpisywaniu propercji konieczne jest jej otwarcie (domyślnie jest to propercja finalna)
    open var tekst: String = "tekst"

    init {
        print(liczba)
    }

    constructor(liczba: Int, tekst: String): this(liczba){
        this.tekst = tekst
        ExampleKotlinH(1, tekst = "hejka")
        ExampleKotlinH(1, "text")
    }

    abstract fun funkcja()

}


class ExampleKotlinH (var number: Int,
                      // Aby nadpisać propercję używamy słowa kluczowego 'override'
                      // Nie mozemy nadpisywanej zmiennej zmniejszać dostępności, np. VAR nadpisać VAL-em
                      override var tekst: String = "tekst"): ExampleKotlinG(number, tekst){
    override fun funkcja(){
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}