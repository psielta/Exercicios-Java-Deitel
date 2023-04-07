package ch14.ex14;

import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        str = str.toLowerCase();
        String[] split = str.split("\\s");
        for (String word :
                split) {
            if(word.lastIndexOf("ed") + 2 == word.length())
                System.out.println(word);
        }
    }
}
