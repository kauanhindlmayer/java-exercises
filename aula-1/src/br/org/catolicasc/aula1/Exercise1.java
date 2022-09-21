package br.org.catolicasc.aula1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        System.out.println("Type your age: ");
        String age = reader.nextLine();

        System.out.println("Type your date date of birth (dd/mm/yy): ");
        String dateOfBirth = reader.nextLine();

        System.out.println("Username: " + name);
        System.out.println(age + " years old");
        System.out.println("Was born at " + dateOfBirth);
    }
}
