package ch14.ex7;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String str = inp.nextLine();
        String[] strings = str.split(" ");
        StringBuilder frase = new StringBuilder();
        System.out.println("Frase convertida:");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(printLatinWord(strings[i]));
        }
    }
    public static StringBuilder printLatinWord(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        char c = stringBuilder.charAt(0);
        stringBuilder.deleteCharAt(0);
        stringBuilder.append(Character.toLowerCase(c));
        stringBuilder.append("ay ");

        return stringBuilder;
    }
}
