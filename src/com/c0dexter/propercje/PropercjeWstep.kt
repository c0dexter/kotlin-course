package com.c0dexter.propercje

class PropercjeWstep{

    /*
    PROPERCJE - w większości zachowują się jak pola w Javie
     */
    var name: String = "Piotr"      // zmienna mutowalna
    val isMale: Boolean = true      // zmienna nimutowalna


    // name = "Czesław" -> to jest OK
    // isMale = false -> NOK, BŁĄD - nie można przypisać nowej wartości

    fun funkcja(){
        name.plus("Można mieć dostęp z funkcji i wykonywać operacje")
        println("Is male: $isMale")
    }


}