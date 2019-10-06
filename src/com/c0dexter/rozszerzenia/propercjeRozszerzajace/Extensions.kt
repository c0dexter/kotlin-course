package com.c0dexter.rozszerzenia.propercjeRozszerzajace

fun String.removeLastChart(): String {
    return this.substring(0, this.length - 1)
}


/* PROPERCJE ROZSZERZAJĄCE:
-  służą do pozyskania dodatkowych informacji o obiekcie (jego własności w zadanym kontekście)
-  propercja rozszerzająca nie może zostać zainicjalizowana w momencie deklaracji
-  nie można jej wtórnie zainizjalizować
-  można ją wywołać na obiekcie, użyć w innej funkcji itp.

 */
val String.lengthMulTwo: Int
    get() = this.length * 2
