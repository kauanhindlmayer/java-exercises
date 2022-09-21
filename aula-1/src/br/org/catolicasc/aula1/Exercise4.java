package br.org.catolicasc.aula1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Type a temperature in Celsius: ");
        Scanner reader = new Scanner(System.in);
        double celsius = reader.nextDouble();

        double kelvin = celsius + 273;

        System.out.println(celsius + " in Kelvin is: " + kelvin);
    }
}
