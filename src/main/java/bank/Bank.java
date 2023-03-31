package bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }


    public void afficherAccount() {
        for (Account account : accounts) {
            System.out.println("Account " + account.getId() + ": Montant = " + account.getSolde() + " \n");
        }

    }

    public void transfert(Account source, Account destination, double montant) {
        source.retrait(montant);
        destination.depot(montant);
    }



}
