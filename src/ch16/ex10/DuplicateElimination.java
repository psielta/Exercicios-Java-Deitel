package ch16.ex10;

import java.util.*;

public class DuplicateElimination {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        NavigableSet<String> setNomes = splitNomes();

        System.out.println("Digite o nome a ser pesquisado na lista: ");
        do {
            System.out.println(search(input.next(), setNomes));
            System.out.println("Digite outro nome a ser pesquisado ou \"<Ctrl> + d\" para parar.");
        } while (input.hasNext());
    }

    public static NavigableSet<String> splitNomes() {
        System.out.println("Digite uma lista de nomes separada por espaços: ");
        String nomes = input.nextLine();
        NavigableSet<String> stringTreeSet = new TreeSet<>(Arrays.asList(nomes.split("\\s")));
        System.out.println(stringTreeSet);
        return stringTreeSet;
    }

    public static String search(String nome, NavigableSet<String> setNomes) {
        List<String> list = new ArrayList<>(setNomes);
        int i = Collections.binarySearch(list, nome);

        if (i < 0)
            return "Não encontrado.";
        else
            return "Encontrado na posição ".concat(String.valueOf(i));
    }
}
