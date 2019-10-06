package com.c0dexter.rozszerzenia

import com.c0dexter.dane.Dane

object RozszerzeniaMain {

    @JvmStatic
    fun main(args: Array<String>){
        val kj = Dane("Krzyś", "Jackowski")
        val aj = kj.copy(imie = "Arek")

        // StringUtils.removeLastChar("Krzyś")   // Stare podejście z klasami narzędziowymi

        /*
         W Kotlinie można użyć funkcji rozszerzających:
         - można napisać funckję rozszerzającą z modyfikatorem PRIVATE, wtedy funkcja ma zasięg w obrębie pliku w którym się znajduje
         - można napisać funkcję rozszerzająca w osobnym pliku kotlinowym bez modyfikatora private, co pozwoli na globalne uzycie funkcji
         - sztandarowym przykładem funkcji rozszerzających jest napisanie customowej metody do wyświetlania toast-u w Androidzie
         */

         "krzyś".removeLastChart()  // funkcji rozszerzających można użyć standardowo po kropce tak jak funkcji wbudowanych w API

        println(kj)
        println(aj)

        val(imie, nazwisko) = kj
        println("imie: $imie, nazwisko: $nazwisko")
    }

}

//private fun String.removeLastChart() {
//    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//}
