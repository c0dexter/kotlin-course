package com.c0dexter.konstruktoryWtorne

// KLASA ABSTRAKCYJNA z natury nie jest finalna, więc jest OTWARTA: nie trzeba dawać modyfikatora dostępu "open"
abstract class ExampleKotlinE constructor(var liczba: Int) {

    var tekst: String = "tekst"

    init {
        print(liczba)
    }


    // Konstruktor wtórny
    constructor(liczba: Int, tekst: String): this(liczba){
        this.tekst = tekst
        ExampleKotlinF(1) // Instancjonowanie z domyślnymi argumentami pozwala przekazać tylko wymagane pola do klasy
        ExampleKotlinF(1,"tekst") // niejawne wskazanie argumentu jaki chcemy zasilić
        ExampleKotlinF(number = 1, text = "hejka") // asocjacja -> jawne wskazanie argumentu jaki chcemy zasilić w konstruktorze za pomoą danej którą przekazujemy
    }

    // Funkcja abstrakcyjna musi być zaimplementowana w klasie rozszerzającej
    abstract fun funkcja()

}

/*
DZIEDZICZENIE:
- klasy i interfejsy wyliczamy po dwukropku zamiast pisać extends/implements
- przekazujemy do konstruktora argumenty z nadklasy
- otworzyć klasę którą rozszerzamy za pomocą modyfikatora dostępu "open" (domyślnie wszystkie klasy w Kotlinie są finalne)
 */
class ExampleKotlinF (var number: Int,
                      var text: String = "tekst"): ExampleKotlinC(number, text){
    override fun funkcja(){
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}