package ch14.ex15;

import java.util.Scanner;

public class ConvertingIntValuesToCharacters {
    public static void main(String[] args) {
        int i;
        do {
            i = new Scanner(System.in).nextInt();
        } while (i < 0 || i > 255);
        System.out.printf("%1$-5d", i);
        System.out.printf("%-2c", (char) i);
    }
}
