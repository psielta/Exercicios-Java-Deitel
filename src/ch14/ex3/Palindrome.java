package ch14.ex3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        if (str.contentEquals(reverse)) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}
