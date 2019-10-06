package com.c0dexter.rozszerzenia.rozszerzeniaDlaNulli

fun String?.removeLastChart(): String? {
    return this?.substring(0, this.length-1)
}

/*
ZABEZPIECZENIE PRZED NULLEM
Czytamy:
String, który może być nullem powinien wykonywać metodę removeLastChar() w której zwracamy Stringa który może być nullem
...wtedy w bloku kodu zwracamy wartość tego stringa I O ILE NIE JEST NULLEM, to wykonujemy na tej wartośći substringa,
...a jesli jest nullem, to zwracamy nulla
 */