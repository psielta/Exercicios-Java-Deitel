package ch16.ex13;

import java.util.*;

public class CountingDuplicateWords {
    private static final Scanner INP = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> palavras = retiraPontuacao(INP.nextLine());
        List<String> palavrasRepetidas = new ArrayList<>();
        for (int i = 0; i < palavras.size() - 1; i++) {
            for (int j = i + 1; j < palavras.size(); j++) {
                if (palavras.get(i).equals(palavras.get(j)) && !palavrasRepetidas.contains(palavras.get(i)))
                    palavrasRepetidas.add(palavras.get(i));
            }
        }
        System.out.println("Nº de palavras que se repetem na frase indefinidamente: " + palavrasRepetidas.size());
    }


    public static List<String> retiraPontuacao(String frase) {
        List<String> list = new java.util.ArrayList<>(List.of(frase.split(",?\\s")));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (String.valueOf(next.charAt(next.length() - 1)).matches("\\W")) {
                StringBuilder stringBuilder = new StringBuilder(next).deleteCharAt(next.length() - 1);
                iterator.set(stringBuilder.toString().toLowerCase());
            } else {
                iterator.set(next.toLowerCase());
            }
        }
        return list;
    }
}
