package br.org.catolicasc.aula1;

import java.util.Scanner;

public class ReaderConsole {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Welcome " + name + "!");
    }
}
