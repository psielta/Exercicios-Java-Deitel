package ch14.ex9;

import java.util.Scanner;

public class DisplayingaSentencewithItsWordsReversed {
    public static void main(String[] args) {
        String frase = new Scanner(System.in).nextLine();
        System.out.println(reverse(frase));
    }

    public static String reverse(String frase) {
        String[] split = frase.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = new StringBuilder(split[i]).reverse().toString();
        }
        frase = "";
        for (int i = split.length - 1; i >= 0; i--) {
            frase = frase.concat(split[i]).concat(" ");
        }
        return frase;
    }
}
