package ch14.ex10;

import java.util.Scanner;

public class LongestWordinaSentence {
    public static void main(String[] args) {
        String frase = new Scanner(System.in).nextLine();
        System.out.println(maiorPalavra(frase));
    }

    public static String maiorPalavra(String frase) {
        String[] split = frase.split("\\.?,?\\s");
        String maiorPalavra = split[0];
        for (int i = 1; i < split.length; i++) {
            if (maiorPalavra.length() < split[i].length())
                maiorPalavra = split[i];
        }
        return maiorPalavra;
    }
}
