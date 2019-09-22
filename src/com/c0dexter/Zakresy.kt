package com.c0dexter

fun main() {

    if (1 in 1..5) { // zakresy inkludywne: <1.5>
        for (i in 1..5) {
            print(i) // 1,2,3,4,5
        }
    }

    for (i in 5 downTo 1) {    // kierunek zakresu: w dół
        println(i) // 5,4,3,2,1
    }

    for (i in 1..10 step 2) {    // step 2 oznacza przeskoczenie o co drugi element
        println(i) // 1,3,5,7,9
    }

    for (i in 1 until 5) { // ekskluzywny zakres: <1, 5)
        println(i) // 1,2,4
    }


}