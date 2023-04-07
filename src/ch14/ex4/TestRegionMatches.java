package ch14.ex4;

import java.util.Scanner;

public class TestRegionMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.next();
        var b = scanner.next();
        System.out.println("toffset, ooffset, len: ");
        var toffset = scanner.nextInt();
        var ooffset = scanner.nextInt();
        var len = scanner.nextInt();
        System.out.println(a.regionMatches(toffset, b, ooffset, len));
    }
}
