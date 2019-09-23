package com.c0dexter.getterySettery

/*
PROPERCJE W KOTLINIE"
- to jest cecha klasy: jakaś jej własność
- cecha może być wywnioskowana ze stanu klasy lub może zostać pobrana z jakichś pól -> tak jak w Javie
- gettery i settery występują pod propercjami
- "pola znane z Javy" chowane są za propercjami a ich doprecyzowanie polega na dopisaniu 'get() =' lub 'set() ='
 */

class GettersSettersKorlin {
    // -- PROPERCJE, CECHY I WŁASNOŚCI KLASY TRZYMAMY W PROPERCJACH -- //
    var name: String = "Piotr"
    var isMale: Boolean = true
    val size: Int get() {return name.length}


    // -- LOGIKĘ KLASY, JEJ ZADANIA I ZACHOWANIA TRZYMAMY W FUNKCJACH -- //
    fun funkcjaWolajacaGetteraZJavy(){
        ExampleGettersSettersJava(1).text // wołany jest getter getText() z klasy Javowej, który zwaraca text
    }

}