package com.c0dexter

var float = 12.43F          // typ niejawny stwierdzany na podstawie literału lub wartości liczbowej

var double1 = 12.43         // typowanie domniemane na podstawie wartości
var double2: Double = 12.43 // typowanie jawne

var long1: Long = 132987    // typowanie jawne
var long3 = 132987L         // typ niejawny (literał)

var hex = 0xff              // szasnastkowy
var bin = 0b101             // binarny
//var oct = Err!            // ósemkowy nie występuje w Kotlinie

var longbin = 0b00000000_11111111   // używanie do liczb przesdstawianych w grupach (numer kart, numer kont)
var milion = 1_000_000      // podkreślnik dla czytelności (grupowanie zer)

