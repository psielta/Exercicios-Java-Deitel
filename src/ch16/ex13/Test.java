package ch16.ex13;

public class Test {
    public static void main(String[] args) {
        String string= "aaa.";
        System.out.println(new StringBuilder(string).deleteCharAt(string.length()-1));
    }
}
