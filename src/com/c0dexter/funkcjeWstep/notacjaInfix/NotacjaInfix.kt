package com.c0dexter.funkcjeWstep.zmiennaLiczbaArgumentow

class NotacjaInfix {

    fun printResult() {
        val suma = 1 plus 2 // wykorzystanie funkcji infix
        println("Suma: $suma")
    }

    /*
    Aby wprowadzić INFIX do aplikacji należy znać słowo kluczowe i sprzęłnić 3 warunki:
    Słowo kluczowe: 'infix'
    1) wskazanie typu dla jakiego tworzymy funkcje np:                      infix fun Int
    2) następnie podajemy po kropce nazwę takiej metody czyli 'plus':       infix fun Int.plus
    3) w nawiasie podajemy tylko 1 parametr który nie może być varargiem:   infix fun Int.plus(x: Int)
    4) po znaku równości zapisujemy operacje która ma się wydarzyć          infix fun Int.plus(x: Int) = this + x
     */
    infix fun Int.plus(x: Int) = this + x   // wprowadzenie notacji infix


}

