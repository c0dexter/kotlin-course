package com.c0dexter

fun main() {
    var a = 5
    var b = a

    /* PORÓWNANIE STRUKTURALNE
    Na zmiennych Int wywoła się metoda equals().
    - zostanie sprawdzone czy wartości nie są nullami i zostaną porównane
    - ciekawostka: jeśli a = null i b = null -> wtedy wyrzuci TRUE (na NULL-u nie da się wywołać metody equals())
     */
    a == b
    a.equals(b)


    /*  PORÓWNANIE REFERENCYJNE
        Sprawdzenie 2 argumentów czy wskazują na ten sam obiekt
        - prawda jest tylko wtedy:
     */
    a === b  // ----> TRUE

    var x = EnterAlt()
    var y = EnterAlt()

    x === y // -----> FALSE, ponieważ wskazują na 2 różne referencje!!

    Double.NaN === Double.NaN   // -----> FALSE (Nie, bo NaN traktujemy jako nieskończoność albo nieokreśloną liczbę
    -0.0 === 0.0    // -----> TURE

    // Inne dostępne operatory:
    // >, <, <=, >=

    if (a in 1..5) {
        // -----> operator porównania zakresu
    }
}