package com.c0dexter

fun main(args: Array<String>) {

    /*
     W Kotlinie IF zwraca wartość
     IF może zostać potraktowany jako funkcja
     IF zwraca ostatnią wartość bloku
     */

    var wynik = if (args[1].length > 0) {
        println(5)
        5
    } else {
        println(0)
        0
    }


    /* INSTRUKCJA STERUJĄCA: WHEN (Odpowiednik SWTICH-a w Javie)
       - WHEN - sprawdza czy któryś z warunków poniżej został spełniony i wykonuje odpowiednie funkcje
       - jeśli żaden warunek nie został spełniony, zostaje wykonany blok ELSE (odpowiednik default-a)
     */

    var wynikWhen = when (wynik) {
        1 -> {
            println("Jedynka")
            1 * 2 // to zostanie zwrócone jako wynik działania bloku
        }
        2 -> println("Dwójka")
        3 -> println("Trójka")
        else -> {
            println("Nic nie wybrałem")
            println("Nie wiem co robić dalej")
        }
    }

    // PĘTLA FOR -> udoskonalona wersja pętli FOR-EACH
    val lista = arrayListOf<Int>()
    for(element in lista){
        // tu sie wykonują metody dla każdego elementu na liście
    }

    // Zastąpienie pętli for(int i = 0; i<=4; i++){}
    for(i in 1..4){ // opcjonalnie: step 2 (co 2 elementy)
        // wykonanie instrukcji
    }

    // W kotlinie, w pętli można mieć dostęp zarówno do kluczy jak i wartości (przydante przy mapach)
    val array = arrayOf(1, 3, 5)
    for ((index, value) in array.withIndex()){

    }



    fun postacStoi(): Boolean {
        println("Stoję sobie.")
        return true
    }

    fun postacBiegnie(): Boolean {
        println("Uciekam.")
        return false
    }

    // Można sprawdzać warunki
    // WHEN może coś zwrócić
    when {
        postacStoi() -> println("Bo mogę.")
        postacBiegnie() -> println("Bo dobrze uciekam.")
    }


}