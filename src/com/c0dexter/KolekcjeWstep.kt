package com.c0dexter


fun zwrocKolekcjeMutable(): MutableCollection<Int> {
    val tablica = arrayOf(1, 2, 3)

    /*
    KOLEKCJE W KOTLINIE SĄ MUTABLE I IMMUTABLE

    Kolekcja immutable:
    - przy każdej zmianie tworzona jest nowa tablica (!)
    - pułapka interoperacyjności
    - mozna wykonać na kotlinowej kolekcji immutable Javove metody list (!!!)
    - skutek: wywalenie aplikacji

    Kolekcja mutable jest typowana na MutableList<T>
    używamy mutableListOf do tworzenia takiej listy na podstawie elementów które ją zasilają
     */

    val list: List<Int> = arrayListOf(1, 2, 3)
    //list.add() - w Kotlinie nie można tego zrobić, ale Java to umożliwi poniważ wzystkie kolekcje są zmienne

    // Przy mutalbleList NIE MOŻNA podawać jawnie typu
    val list1 = mutableListOf(4, 5, 6)
    list1.add(7)
    list1.add(8)
    list1.add(9)

    return list1;
}


