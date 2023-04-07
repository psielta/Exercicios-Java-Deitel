package ch14.ex13;

import java.util.Scanner;

public class TokenizingStrings {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] split = str.split("\\s");
        for (String word :
               split) {
            if(String.valueOf(word.charAt(0)).matches("[A-Z]"))
                System.out.println(word);
        }
    }
}
