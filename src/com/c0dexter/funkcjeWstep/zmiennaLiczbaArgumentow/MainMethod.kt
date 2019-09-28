package com.c0dexter.funkcjeWstep.zmiennaLiczbaArgumentow

object MainMethod {
    @JvmStatic
    fun main(args: Array<String> ){
        Funkcje().printAllNumbers(32,3,14,6,23,89)      // tak sie nie powinno podawać argumentów, lepiej użyć listy


        val tablicaIntow = intArrayOf(32,3,14,6,23,89)   // intArrayOf - pomaga szybko utworzyć tablice
        Funkcje().printAllNumbers(*tablicaIntow)                 // gwiazdka to operator rozkładania listy na elementy

    }
}