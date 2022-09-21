package br.org.catolicasc.aula1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        System.out.println("Type your grade 1: ");
        double grade1 = reader.nextInt();

        System.out.println("Type your grade 2: ");
        double grade2 = reader.nextInt();

        System.out.println("Type your grade 3: ");
        double grade3= reader.nextInt();

        System.out.println("Type your grade 4: ");
        double grade4 = reader.nextInt();

        double semesterAverage = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("Your math grade is: " + semesterAverage);
    }
}
