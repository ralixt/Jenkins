package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void getAccounts() {
        ArrayList<Account> accounts = null;
        Account account = new Account(1000, 120.10, 0.20);
        accounts.add(account);
        Bank bank = new Bank(accounts);
        Assertions.assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void addAccount() {
        ArrayList<Account> accounts = null;
        Account account = new Account(1000, 120.10, 0.20);
        accounts.add(account);
        Bank bank = new Bank(accounts);
        Assertions.assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void removeAccount() {
    }

    @Test
    void afficherAccount() {
    }

    @Test
    void transfert() {
    }
}