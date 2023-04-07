package ch14.ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        List<String> list = listWords(word);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-2d %-3s%n", i + 1, list.get(i));
        }
    }

    public static List<String> listWords(String word) {

        List<String> words = new ArrayList<>();                      //bathe
        for (int i = 0; i < word.length(); i++) {
            if (i + 1 < word.length())
                for (int j = i + 1; j < word.length(); j++) {
                    if (j + 1 < word.length())
                        for (int k = j + 1; k < word.length(); k++) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                    if (i - 1 >= 0)
                        for (int k = j - 1; k >= 0; k--) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                    if (j > i + 1)
                        for (int k = j - 1; k > i; k--) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                }
            if (i - 1 >= 0)
                for (int j = i - 1; j >= 0; j--) {
                    if (j - 1 >= 0)
                        for (int k = j - 1; k >= 0; k--) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                    if (i + 1 < word.length())
                        for (int k = i + 1; k < word.length(); k++) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                    if (j < i - 1)
                        for (int k = j + 1; k < i; k++) {
                            words.add(concat(word.charAt(i), word.charAt(j), word.charAt(k)));
                        }
                }
        }
        return words;
    }

    public static String concat(char c1, char c2, char c3) {
        return "".concat(String.valueOf(c1).concat(String.valueOf(c2)).concat(String.valueOf(c3)));
    }
}
