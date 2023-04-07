package ch16.ex11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccoutComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return -Double.compare(o1.getBalance(), o2.getBalance());
    }
}

class Test {
    public static void main(String[] args) {
        Account a1 = new Account(1, "Max", "", 1300);
        Account a2 = new Account(2, "Julio", "", 7800);
        Account a3 = new Account(3, "Flavio", "", 4500);
        Account a4 = new Account(4, "Fabio", "", 1600);
        Account a5 = new Account(5, "Eduardo", "", 2500);


        List<Account> accounts = new ArrayList<>(List.of(a1, a2, a3, a4, a5));
        System.out.println("Antes da chamada do sort: ".concat(accounts.toString()));
        accounts.sort(new AccoutComparator());
        System.out.println("Depois da chamada do sort: ".concat(accounts.toString()));

    }
}
