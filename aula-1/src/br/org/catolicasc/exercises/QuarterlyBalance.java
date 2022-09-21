package br.org.catolicasc.aula1;

public class QuarterlyBalance {
    public static void main(String[] args) {
        int januarySpending = 15000;
        int februarySpending = 23000;
        int marchSpending = 17000;
        int quarterlySpending = januarySpending + februarySpending + marchSpending;
        int monthlyAverage = (januarySpending + februarySpending + marchSpending) / 3;

        System.out.println("Spending's of the quarterly: " + quarterlySpending);
        System.out.println("Monthly Average of Spending's: " + monthlyAverage);
    }
}
