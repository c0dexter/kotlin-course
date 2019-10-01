package com.c0dexter.funkcje.widocznosc

/*
MODYFIKATORY DOSTĘPU:
- domyślny (ukryty zapis): jest publiczny: 'public'
- internal - odpowiednik pakietowego (modułowego) dostępu z Javy jednak działa szerzej - w obrębie modułu np. biblioteki
- protected - piszemy do składników klasy - nie działa składników wysokiego poziomu takich jak klasy, ale działa dla propercji i metod (wtedy dostęp jest w klasie dziedziczącej, jak w Javie)
- private - dostępny w obrębie pliku klasy i jej składników - widoczny dla klas dziedziczących. Można odwołać się w konstruktorze innej klasy
-


 */

class Dostep { // domyślnie w Kotlinie wszystkie klasy są publiczn

    protected val someText: String = "example text"

}