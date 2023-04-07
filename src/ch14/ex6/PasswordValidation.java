package ch14.ex6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        String str;
        do {
            str = new Scanner(System.in).next();
            if (str.equals("#"))
                continue;
            try {
                System.out.println(validation(str));
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        } while (!str.equals("#"));
    }

    public static boolean validation(String str) throws IllegalArgumentException {
        if (str.length() < 8 || str.length() > 15)
            throw new IllegalArgumentException("Tamanho incorreto: deve possuir de 8-15 caracteres.");
        else if (!String.valueOf(str.charAt(0)).matches("[a-zA-Z]")) {
            throw new IllegalArgumentException("O primeiro caractere da senha deve ser uma letra.");
        }
        Pattern pattern1 = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("\\d");
        Matcher matcher1 = pattern1.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        boolean encontrouLetraMaiuscula = false;
        boolean encontrouDigito = false;

        while (matcher1.find()) {
            encontrouLetraMaiuscula = true;
            break;
        }
        if (!encontrouLetraMaiuscula)
            throw new IllegalArgumentException("A senha deve possuir ao menos uma letra maiúscula.");
        while (matcher2.find()) {
            encontrouDigito = true;
            break;
        }
        if (!encontrouDigito)
            throw new IllegalArgumentException("A senha deve possuir ao menos um dígito.");
        return true;

    }
}
