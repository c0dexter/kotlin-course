package com.c0dexter;

import java.util.ArrayList;

public class EnterAlt {

    public static void main(ArrayList<String> args) {

        boolean isPies = true ? true: false;

        if (true) {
            System.out.println("prawda");
        } else {
            System.out.println("fałsz");
        }

        for (int i = 0; i < 10; i++) {
            // doSth();
        }

        ArrayList<Integer> lista = new ArrayList<>(2);
        for (Integer element : lista) {
            //forEachElementOnListDoSth();
            element.byteValue();
        }

        while (lista.isEmpty()) {
            System.out.println("test");
        }

        do {
            int size = lista.size();
            System.out.println(size);
        } while (lista.size() < 5);

        switch (lista.get(1)) {
            case 3:
                System.out.println("fałsz");
                break;
            case 5:
                System.out.println("true");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
