package com.c0dexter.konstruktoryPierwotne;

public class ExampleJava {

    int liczba;
    String text;

    // Konstruktor
    public ExampleJava(int liczba, String text) {
        System.out.println("To jest tekst: " + text + ", a to jest liczba " + liczba);

        this.text = text;
        this.liczba = liczba;
    }
}
