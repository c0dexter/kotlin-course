package com.c0dexter.obiekty.deklaracjeObiektow

class Wywolanie1 {

    fun addKeyboardListener(adapter: KeyboardAdapter) {
        if (true) {
            adapter.onClick()
            Obiekt.pole = 22            // Można odwołać się do pola Obiektu
            Obiekt.funkcjaObiektu()     // oraz do metody obiektu

            // DEKLARACJE OBIEKTOWE NIE MOGĄ ZNAJDOWAĆ SIĘ W FUNKCJI
            // object lokalnyObj{} <---- to nie zadziała
        }
    }

}

abstract class KeyboardAdapter {
    abstract fun onClick()
}

class Form {
    var zmienna1: Int = 2

    fun initForm() {
        var zmienna2: Int = 4

        Wywolanie1().addKeyboardListener(object :
            KeyboardAdapter() {
            override fun onClick() {

                println("Można odwołać się do niefinalnych zmiennych: zmienna1 = $zmienna1, zmienna2 = $zmienna2")
            }
        })
    }
}