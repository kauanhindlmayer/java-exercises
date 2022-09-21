package br.com.catolicasc.exercises;

public class TestSplit {
    public static void main(String[] args) {
        String phrase = "Socorram-me subi no ônibus em Marrocos";
        String[] words = phrase.split(" ");

        for(int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
