package com.c0dexter.obiekty.deklaracjeObiektow

object Obiekt {
    var pole = 1
    fun funkcjaObiektu() {}

    /* object:
    - object gwarantuje nam, że będzie tylko jedno wystąpienie dla całej aplikacji (singleton)
    - w Kotlinie taka deklaracja jest wątkowo bezpieczna.
    - 'object' może również coś rozszerzać, np możemy rozszerzyć jakąś klasą i dostać się do jej zasobów
     */
}