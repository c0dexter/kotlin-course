object Enter {
    /*
    Pierwszy komentarz zagnieżdżony
    Druga linia
        /*
        Drugi komentarz zagnieżdżony
        */
     */
    @JvmStatic
    fun main(args: Array<String>) {
        System.out.println("Hello")

        var zmienna: Int = 11
        zmienna = 12

        val wartosc: Int = 11
        // wrtosc = 12  // nieprawi dłowe


        // ### CHAR ###
        val znak: Char = '\u0024'       // Char nie jest liczbą w rozumieniu niejawnym
        // val znaki = znak + znak -> Niepoprawne, nie można dodawać znaków


        // ### STRING ###
        val tekst: String = "przykłąd"
        val polaczonyString = tekst + tekst


        // ### BOOLEAN ###
        val prawda = true
        val falsz = false

        // || leniwe LUB
        // && leniwe I
        // !zaprzeczenie


        // ### TYP TABLICOWY ###
        val tablica: Array<Int> = arrayOf(1,2,3,4) // arrayOf -> Utworzenie tablicy z elementów
        println("Trzeci element tablicy to " + tablica[2])

        val tablicaBoolean = booleanArrayOf(true, true, false)
        println(tablicaBoolean[1]) // Odwołanie do elementu poprzez indeks

        val tablicaLambdy = Array(10) { i -> i*i }
        for (element in tablicaLambdy){
            println(element)
        }

        val napis = "Hej"
        println(napis[1]) // Zostanie wydrukowane "e"

        val tablicaRozneTypy = arrayOf("JakisSring", 10) // typ tablicy zostaje okreslony jako ANY co odpowiada Object w Javie
        // WAŻNE: do tablicy typu ANY nie można przypisać tablicy konkretnego typu!!!



    }

}