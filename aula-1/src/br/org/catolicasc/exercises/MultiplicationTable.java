package br.org.catolicasc.aula1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        System.out.println("Multiplication Table of " + number);
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
