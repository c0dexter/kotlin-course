package com.c0dexter.dane.destrukturyzacja

/*
DATA CLASS:
= klasa wykorzystywana do modeli danych
= domyślnie zaimplementowane gettery i settery
= domyslnie wystawione metody hash() i equals()
= unikanie boilerplate kodu

Wymgania:
- musi posiadać conajmniej jeden parametr w konstruktorze pierwotnym
- wartości w konstruktorze muszą być typu 'val' lub 'var'
- klasa danych nie może być: abstrakcyjna, otwarta, zapieczętowana, wewnętrzna
- nie możńa mieć konstruktora bezargumentowego
- można ograć wymóg bezargumentowego konstruktora - potrzebnego w niektórych bibliotekach - poprzez przypisanie wartości domyślnych (puste stringi itp.)

 */

data class Dane2(val imie: String,
                 val nazwisko: String) {

}