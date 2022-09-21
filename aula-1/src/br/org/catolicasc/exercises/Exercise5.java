package br.org.catolicasc.aula1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.println("Type a value to radius: ");
        Scanner reader = new Scanner(System.in);
        double radius = reader.nextDouble();

        System.out.println("Type a value to height: ");
        double height = reader.nextDouble();

        double result = pi * radius * radius * height;

        System.out.println("The volume is equal to: " + result);
    }
}
