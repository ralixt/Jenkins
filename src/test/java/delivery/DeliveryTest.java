package delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DeliveryTest {

    @Test
    void coutLivraision() {
        Delivery delivery = new Delivery();
        Assertions.assertEquals(10.0, delivery.coutLivraision(50.0, 9.0));

        Assertions.assertEquals(24.5, delivery.coutLivraision(75.0, 20.0));

        Assertions.assertEquals(35.0, delivery.coutLivraision(100.0, 5.0));

        Assertions.assertEquals(50.0, delivery.coutLivraision(120.0, 30.0));
    }
}