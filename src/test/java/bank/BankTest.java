package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account(1000, 120.10, 0.20);
        accounts.add(account);
        Bank bank = new Bank(accounts);
        Assertions.assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void addAccount() {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account(1000, 120.10, 0.20);
        Bank bank = new Bank(accounts);
        bank.addAccount(account);
        Assertions.assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void removeAccount() {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account(1000, 120.10, 0.20);
        Bank bank = new Bank(accounts);
        bank.addAccount(account);
        bank.removeAccount(account);
        Assertions.assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void afficherAccount() {
        ArrayList<Account> accounts = new ArrayList<>();
        Account account = new Account(1000, 120.10, 0.20);
        Bank bank = new Bank(accounts);
        bank.addAccount(account);
        String res = "Account " + account.getId() + ": Montant = " + account.getSolde();

        //Assertions.assertEquals(res, bank.afficherAccount().toString());


    }

    @Test
    void transfert() {

        ArrayList<Account> accounts = new ArrayList<>();
        Account a1 = new Account(1000, 1000.76, 0.20);
        Account a2 = new Account(120, 140.10, 0.20);
        Bank bank = new Bank(accounts);
        bank.addAccount(a1);
        bank.addAccount(a2);

        bank.transfert(a1, a2, 500);
        Assertions.assertEquals(500.76, a1.getSolde());
        Assertions.assertEquals(640.10, a2.getSolde());

    }
}