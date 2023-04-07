package ch14.ex16;

import java.util.Arrays;

public class DefiningYourOwnStringMethods {
    public static void main(String[] args) {
        System.out.println("fasdstrffaffffstrs3trffff".indexOf('a'));
        System.out.println(indexOf("fasdstrffaffffstrs3trffff", 'a'));
        System.out.println("fasdstrffaffffstrs3trffff".indexOf('a', 5));
        System.out.println(indexOf("fasdstrffaffffstrs3trffff", 'a', 5));
        System.out.println("fasdstrffaffffstrs3trffff".indexOf("ffff"));
        System.out.println(indexOf("fasdstrffaffffstrs3trffff", "ffff"));
        System.out.println("fasdstrffaffffstrs3trffff".indexOf("ffff", 14));
        System.out.println(indexOf("fasdstrffaffffstrs3trffff", "ffff", 14));
        System.out.println("----------------");
        System.out.println("fasdstrffaffffstrs3trffff".lastIndexOf('a'));
        System.out.println(lastIndexOf("fasdstrffaffffstrs3trffff", 'a'));
        System.out.println("fasdstrffaffffstrs3trffff".lastIndexOf('a', 7));
        System.out.println(lastIndexOf("fasdstrffaffffstrs3trffff", 'a', 7));
        System.out.println("fasdstrffaffffstrs3trffff".lastIndexOf("ffff"));
        System.out.println(lastIndexOf("fasdstrffaffffstrs3trffff", "ffff"));
        System.out.println("fasdstrffaffffstrs3trffff".lastIndexOf("ffff", 20));
        System.out.println(lastIndexOf("fasdstrffaffffstrs3trffff", "ffff", 20));
    }

    public static int indexOf(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(String str, char c) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String str, char c, int fromIndex) {
        if (fromIndex < 0)
            return indexOf(str, c);
        for (int i = fromIndex; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(String str, char c, int fromIndex) {
        for (int i = fromIndex; i >= 0; i--) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }


    public static int indexOf(String str, String substring) {
        char[] chars = new char[substring.length()];
        for (int i = 0; i < str.length(); i++) {
            str.getChars(i, i + substring.length(), chars, 0);
            if (Arrays.equals(chars, substring.toCharArray())) {
                return i;
            }
            if (i + substring.length() == str.length())
                break;
        }
        return -1;
    }

    public static int lastIndexOf(String str, String substring) {
        char[] chars = new char[substring.length()];
        for (int i = str.length() - substring.length(); i >= 0; i--) {
            str.getChars(i, i + substring.length(), chars, 0);
            if (Arrays.equals(chars, substring.toCharArray())) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String str, String substring, int fromIndex) {
        char[] chars = new char[substring.length()];
        for (int i = fromIndex; i < str.length(); i++) {
            str.getChars(i, i + substring.length(), chars, 0);
            if (Arrays.equals(chars, substring.toCharArray())) {
                return i;
            }
            if (i + substring.length() == str.length())
                break;
        }
        return -1;
    }

    public static int lastIndexOf(String str, String substring, int fromIndex) {
        char[] chars = new char[substring.length()];
        for (int i = fromIndex; i >= 0; i--) {
            str.getChars(i, i + substring.length(), chars, 0);
            if (Arrays.equals(chars, substring.toCharArray())) {
                return i;
            }
        }
        return -1;
    }
}
