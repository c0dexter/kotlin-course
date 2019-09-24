package com.c0dexter.poznaInicjalizacja
 import com.c0dexter.getterySettery.ExampleGettersSettersJava


class GettersSettersKorlin {
    var name: String = "Piotr"

    /*
     LATEINIT
     - pozwala na późniejszą inicjalizacje (nie na etapie deklaracji zmiennej)
     - nie można go użyć na propercjach posiadających getter lub setter
     - nie można go użyć na typach prostych (Boolean, Int, etc), można natomiast na klasach
     - 'latenit' przydaje się kiedy np. czekamy na pobranie danych z internetu, które to dane zailają naszą klasę
     */
    lateinit var isMale: ExampleGettersSettersJava

    val size: Int get() {
        return name.length
    }


    fun funkcjaWolajacaGetteraZJavy(){
        ExampleGettersSettersJava(1).text

        // imicjalizacja zmiennej następuje dopiero tutaj
        isMale = ExampleGettersSettersJava(1)
        // później wykonywane są operacje w oparciu o tą zmienna
        isMale.text.plus(3)
    }

}