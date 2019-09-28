package com.c0dexter.funkcjeWstep.zmiennaLiczbaArgumentow

class LocalFunctions {

    // NIE NALEŻY NADUŻYWAĆ FUNKCJI LOKALNYCH: PRZYDAJE SIE KIEDY NIE MA SENSU WYDZIELAĆ OSOBNEJ FUNKCJI

    fun functionOut(zmiennaA: Int, zmiennaB: Boolean) {         // Funkcja jako składnik klasy 'LocalFunctions'
        fun functionIn(odrebnyParametr: Any) {                  // Funkcja wewnętrzna (lokalna)
            zmiennaA                                            // dostep do parametrow funkcji nadrzędnej
            zmiennaB
            odrebnyParametr                                     // odwołanie do swojego parametru
            // ...
        }

        functionIn(3)                            // Wywołanie funkcji lokalnej
        // ...
    }
}

