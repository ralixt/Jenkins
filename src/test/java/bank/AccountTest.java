package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @MethodSource
    void getId() {
        Account account = new Account(1000, 120.10, 0.20);
        Assertions.assertEquals(1000 ,account.getId());
    }

    @MethodSource
    void setId() {
        Account account = new Account(1000, 120.10, 0.20);
        account.setId(500);
        Assertions.assertEquals(500 ,account.getId());
    }

    @MethodSource
    void getSolde() {
        Account account = new Account(1000, 120.10, 0.20);
        Assertions.assertEquals(120.10 ,account.getSolde());
    }

    @MethodSource
    void setSolde() {
        Account account = new Account(1000, 120.10, 1.20);
        account.setSolde(595.55);
        Assertions.assertEquals(595.55, account.getSolde());

    }

    @MethodSource
    void getTauxInteret() {
        Account account = new Account(1000, 120.10, 0.20);
        Assertions.assertEquals(0.20, account.getTauxInteret());
    }

    @MethodSource
    void setTauxInteret() {
        Account account = new Account(1000, 120.10, 0.20);
        account.setTauxInteret(0.5);
        Assertions.assertEquals(0.5, account.getTauxInteret());
    }

    @MethodSource
    void depot() {
        Account account = new Account(1000, 120.10, 0.20);
        account.depot(10000);
        Assertions.assertEquals(10120.10, account.getSolde());
    }

    @MethodSource
    void retrait() {
        Account account = new Account(1000, 120.10, 0.20);
        account.retrait(20);
        Assertions.assertEquals(100.10, account.getSolde());

    }

    @MethodSource
    void transfert() {
        Account a1 = new Account(1000, 1000.76, 0.20);
        Account a2 = new Account(1000, 140.10, 0.20);
        a1.transfert(a2,500);
        Assertions.assertEquals(500.76, a1.getSolde());
        Assertions.assertEquals(640.10, a2.getSolde());
    }

    @MethodSource
    void interet() {
        Account account = new Account(1000, 120.10, 0.20);

        Assertions.assertEquals(0.2402, account.interet());
    }
}