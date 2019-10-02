package com.c0dexter.obiekty.wyrazeniaObiektowe

class Wywolanie {

    fun addKeyboardListener(adapter: KeyboardAdapter) {
        if (true) {
            adapter.onClick()
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

        Wywolanie().addKeyboardListener(object :
            KeyboardAdapter() { // zamiast 'new' piszemy 'object: KeyboardAdapter' (ponieważ potrzebujemy go tylko na chwilę), a następnie po wywołaniu klasy musimy zaimplementować metody abstrakcyjne czyli onClick i tam określić sposób działania
            override fun onClick() {
                // kod w wyrażeniach obiektowych ma dostęp do zmiennych w zasięgu w którym on się znajduje. Zmienne nie musza być finalne (jak to miało miejsce w Javie). Np:
                println("Można odwołać się do niefinalnych zmiennych: zmienna1 = $zmienna1, zmienna2 = $zmienna2")
            }
        })
    }
}