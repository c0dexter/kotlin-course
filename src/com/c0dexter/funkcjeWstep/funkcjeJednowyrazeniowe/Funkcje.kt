package com.c0dexter.funkcjeWstep.funkcjeJednowyrazeniowe

class Funkcje {
    fun printHello(textToPrint: String, int: Int = 3, innyInt: Int = 4): Boolean{

        println("Hello! So much fun! $textToPrint, liczba $int, liczba2: $innyInt metoda = ${this.singleExample(true)}")
        return true
    }


    fun singleExample(boolean: Boolean) = if(boolean){1} else {2} // Typ domniemany na podstawie typu elementu zwracanego (w tym przypadku Int)

    /*
    W typ przypadku typ zwracany będzie jawny i rzutowany do ANY
    Dzieje się tak, dlatego że kompilator nie wie jaki typ ma zwrócić spośród dwóch podanych
    ANY to typ bardziej ogólny (kotlinowy odpowiednik javowego 'Object')
    */
    fun singleExampleNotPredictedReturnType(boolean: Boolean) = if(boolean){1.0} else {2}


    // Jeśli użytkownik wskaże typ zwracany, wtedy kompilator nie kastuje do ANY
    fun singleExampleExplicitType(boolean: Boolean): Int = if(boolean){1} else {2}


}