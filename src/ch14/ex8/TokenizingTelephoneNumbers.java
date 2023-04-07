package ch14.ex8;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        //(555) 555-5555
        String input = "(555) 555-5555";
        String[] split = input.split("\\-|\\s");
        StringBuilder stringBuilder = new StringBuilder(split[0]);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(3);
        split[0] = stringBuilder.toString();

        for (String s :
                split) {
            System.out.print(s + " ");
        }
    }
}
