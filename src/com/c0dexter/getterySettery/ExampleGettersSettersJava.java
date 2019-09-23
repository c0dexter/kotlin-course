package com.c0dexter.getterySettery;

public class ExampleGettersSettersJava {
    private int liczba;
    private String text;


    public ExampleGettersSettersJava(int liczba) {
        this.liczba = liczba;
    }

    public ExampleGettersSettersJava(int liczba, String text) {
        this.liczba = liczba;
        this.text = text;
    }


    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}
