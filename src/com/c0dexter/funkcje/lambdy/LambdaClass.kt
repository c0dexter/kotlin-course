package com.c0dexter.funkcje.zmiennaLiczbaArgumentow

class LambdaClass {

    fun printHello(textToPrint: String, jakisInt: Int, innyInt: Int) {
        println("Hello! $textToPrint, liczba pierwsza: $jakisInt, liczba druga: $innyInt")
    }

    fun printSth() {
        functionOut { printHello("I'm Michael", 12, 34) }   // W nawiasach wąsatych przekazujemy blok kodu
    }

    /*
      Zapis: fun functionOut(function: (Int) -> Unit){}
      Chcemy przekazać funkcję, która: (bierze argument Int, wykonuje jakieś operacje, zwraca Unit)
      Przy przekazaniu lamdy jako argumentu do funkcji mozęmu oczekiwać typu
     */
    fun functionOut(function: (Int) -> Unit) {           // Można podać typ zwracany jako lambdę
        fun functionIn(odrebnyParametr: Any) {

        }

        functionIn(3)
    }


    fun functionOutReturnsFunction(function: (Int) -> Unit): (Int) -> Unit {           // Można podać typ zwracany jako lambdę
        fun functionIn(odrebnyParametr: Any) {

        }

        functionIn(3)

        return {
            printHello(
                "Hey!",
                2,
                5
            )
        }       // Zwracamy jakś funkcje która przyjmuje Int, wykonuje operacje i nie zwraca nic (Unit)
    }
}

