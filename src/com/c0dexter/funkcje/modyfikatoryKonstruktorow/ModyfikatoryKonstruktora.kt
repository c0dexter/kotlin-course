package com.c0dexter.funkcje.modyfikatoryKonstruktorow

class ModyfikatoryKonstruktora {

}

class  DostepSzeroki private constructor(a: Int){   // modyfikator dostępu dla construktora wymga dopisania słowa kluczowego 'construktor' oraz dopisania przed nim modyfikatora dostepu

    init {
        ModyfikatoryKonstruktora()
    }
}