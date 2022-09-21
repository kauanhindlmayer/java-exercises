package br.org.catolicasc.aula1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String name1 = "Master of the Universe";

        System.out.println("Type a name: ");
        Scanner reader = new Scanner(System.in);
        String name2 = reader.nextLine();

        String alt = name1;
        name1 = name2;
        name2 = alt;

        System.out.println("Variable 1: " + name1);
        System.out.println("Variable 2: " + name2);

    }
}
