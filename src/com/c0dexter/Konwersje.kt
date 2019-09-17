package com.c0dexter

/*
- Konwersje NIEJAWNE w Kotlinie NIE WYSTĘPUJĄ (w Javie tak)
- używamy konwersji jawnej poprzez wywołanie metod na zmiennej
 */

val a: Int = 4
// val b: Long = a ->       To nie zadziała, nie ma niejawnej konwersji w Kotlinie
val b = a.toLong()          // TAK, konwersja jawna
val b1: Long = a.toLong()   // tak, konwersja jawna z zadeklarowanym typem (opcja)
