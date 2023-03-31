package delivery;

public class Delivery {

    private double distance;
    private double poids;

    public Delivery(double distance, double poids) {
        this.distance = distance;
        this.poids = poids;
    }

    public double coutLivraision (){
        double cout = 10.0;

        if (distance > 50) {
            cout += (distance - 50) * 0.5;
        }

        if (poids >= 10 && poids <= 25) {
            cout += 2.0;
        } else if (poids > 25) {
            cout += 5.0;
        }

        return cout;
    }


}
