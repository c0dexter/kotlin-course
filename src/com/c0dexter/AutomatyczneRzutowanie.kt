package com.c0dexter

fun main() {
    // ### AUTOMATYCZNE RZUTOWANIE ###
    var obj: Any = 11
    var obj1: Any = 8

    if (obj is Int) {
        // Jeśli obiekt jest jakimś typem to wykonaj akcje...
        // obj w tym wypadku jest juz AUTOMATYCZNIE zrzutowany na Int-a
        // na obiekcie obj możemy wykonywać metody dostępne dla Int-a
        obj.plus(2)
    }

    if (obj1 !is Int) { // (!) "Jeśli objekt NIE JEST Int-em..."
        // to coś zrób...
    } else {
        // wtedy w ELSE mamy możliwość wykonania metod na automatycznie zrzutowanym obiekcie
        obj1.div(4)
    }


    // ### WYMUSZENIE RZUTOWANIA NA SPODZIEWANY TYP - niebezpieczne przy pomyłce -> błąd ###
    var jakasNowaZmiennaInt: Int = obj1 as Int // potraktuj zminną obj1 JAKO(AS) Int

}