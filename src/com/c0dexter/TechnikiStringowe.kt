package com.c0dexter

fun main(){
    // Kotlin: szablony stringowe i literały stringowe


    /*  LITERAŁY STRINGOWE
        - string między znakami potrójnego cuzydzłowu
        - surowy string będzie posiadał formatowanie
        - można skorzystać z trimMargin("znakMarginesu")
     */
    println("""
        PRZYKŁAD: Pierwsza linia
        
        Poniżej kod  wielopoziomowy:
        
        |if(a==b){
        |   doSth()
        |} else{
        |   doNth()
        |}
    """.trimIndent().trimMargin("|"))


    /* SZABLONY STRINGOWE
        Możliwość wstawiania do Stringa wartości poprzez odwołanie do zmiennej za pomocą dolara
        Możliość wykonania dalszych operacji na zmiennej (po kropce) np. $a.plus(3)
        Możliwość wykonania dowolnego kodu w nawiasach wąsatych i wstawienie wyniku operacji do stringa
     */
    var a = 5
    println("Zmienna a+20 ma wartosc: ${a.plus(20)}")

}