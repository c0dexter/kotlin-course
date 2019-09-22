package com.c0dexter.konstruktoryPierwotne

// klsa kotlinowa domyślnie jest publiczna
class ExampleKotlin( var liczba: Int,
                     var text: String) {

    /*
     Blok "init"
     - pozwala wykonać blok konsturktora przy tworzeniu obiektu)
     - rzadko używane
     */
    init {
        println("To jest tekst: $text, a to jest liczba $liczba")
    }
}


class ExampleKotlinClass( var liczba: Int,
                          var text: String) {

}


//class ExampleKotlinDI @Inject constructor( var liczba: Int,
//                          var text: String) {
//  Można wstrzykiwać w konstruktorach zależności np. używając Daggera (DI)
//}
