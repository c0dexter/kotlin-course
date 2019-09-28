package com.c0dexter.funkcjeWstep.zmiennaLiczbaArgumentow

class Funkcje {
    fun printHello(textToPrint: String, int: Int = 3, innyInt: Int = 4): Boolean{

        println("Hello! So much fun! $textToPrint, liczba $int, liczba2: $innyInt metoda = ${this.singleExample(true)}")
        return true
    }

    fun singleExample(boolean: Boolean)
            = if(boolean){1} else {2} // Typ domniemany na podstawie typu elementu zwracanego (w tym przypadku Int)

    fun printAllNumbers(vararg numbers: Int){
        for(number in numbers){
            println(number)
        }
    }
}

