package bank;

public class Account {
    private Integer id;
    private double solde;
    private double tauxInteret;

    public Account(Integer id, double solde, double tauxInteret) {
        this.id = id;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }



}
