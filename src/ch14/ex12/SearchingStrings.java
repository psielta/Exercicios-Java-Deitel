package ch14.ex12;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String frase = inp.nextLine();
        frase = frase.toUpperCase();
        int[] numOcorrencias = new int[26];
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            int indice = frase.indexOf(c);
            while (indice != -1) {
                numOcorrencias[i - 65]++;
                indice = frase.indexOf(c, indice + 1);
            }
        }
        for (int i = 0; i < numOcorrencias.length; i++) {
            System.out.printf("Numero de ocorrências de %c: %d%n", (char) (i + 65), numOcorrencias[i]);
        }

    }
}
