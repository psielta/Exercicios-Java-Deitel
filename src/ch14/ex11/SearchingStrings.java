package ch14.ex11;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String frase = inp.nextLine();
        char c = inp.next().charAt(0);
        int numOcorrencias = 0, indice = frase.indexOf(c);
        while (indice != -1) {
            numOcorrencias++;
            indice = frase.indexOf(c, indice + 1);
        }
        System.out.println(numOcorrencias);
    }

}
