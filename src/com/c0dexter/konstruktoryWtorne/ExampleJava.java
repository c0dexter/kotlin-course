package com.c0dexter.konstruktoryWtorne;

public class ExampleJava {

    int liczba;
    String tekst;



    // Konstruktor
    public ExampleJava(int liczba) {
        this(liczba, "text");
    }


    // Konstruktor pomocniczy
    public ExampleJava(int liczba, String tekst){
        this.tekst = tekst;
        this.liczba = liczba;
    }
}
