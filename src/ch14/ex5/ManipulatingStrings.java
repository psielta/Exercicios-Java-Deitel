package ch14.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulatingStrings {
    public static void main(String[] args) {
        List<String> listaComCaracteresEspeciais = new ArrayList<>();
        List<String> listSemCaracteresEspeciais = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        while (!"#".equals(str)) {
            if(str.matches("[a-zA-Z0-9]+"))
                listSemCaracteresEspeciais.add(str);
            else listaComCaracteresEspeciais.add(str);
            str = inp.next();
        }

        System.out.println("Lista com caracteres especiais");
        for (String s :
                listaComCaracteresEspeciais) {
            System.out.println(s);
        }

        System.out.println("\nLista sem caracteres especiais");
        for (String s :
                listSemCaracteresEspeciais) {
            System.out.println(s);
        }

    }
}
