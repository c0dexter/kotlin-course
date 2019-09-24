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

    /*
    POLE JEST TWORZONE DLA PROPERCJI GDY:
    - propercja ma domyślny przynajmniej jeden getter albo sertter
    - albo doprecyzowany getter albo setter który odwołuje się do pola 'field'
     */


    var name: String = "Piotr"  // Za tą propercją kryje się pole, ponieważ jest bezpośrednia inicjalizacja


    var isMale: Boolean = true  // propercja isMale ma za sobą pole
    set(value) {
        if(value != field){     // do tego pola odwołujemy się poprzez słowo kluczowe 'field'
        field = value
        }
    }

    get() {
        if(field != null){
        return true
        } else{
        return false
        }
    }


    // W tym przypadku nie ma żadnego odłowania do field, więc nie potrzebne jest pole 'field'
    val size: Int get() {
        return name.length
    }


    // -- LOGIKĘ KLASY, JEJ ZADANIA I ZACHOWANIA TRZYMAMY W FUNKCJACH -- //
    fun funkcjaWolajacaGetteraZJavy(){
        ExampleGettersSettersJava(1).text // wołany jest getter getText() z klasy Javowej, który zwaraca text
    }

}