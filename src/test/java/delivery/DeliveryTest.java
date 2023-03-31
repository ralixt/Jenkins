package delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class DeliveryTest {

    @Test
    void coutLivraision() {

        Delivery delivery1 = new Delivery(50.0,9.0);
        Assertions.assertEquals(10.0, delivery1.coutLivraision());


        Delivery delivery2 = new Delivery(75.0,20.0);
        Assertions.assertEquals(24.5, delivery2.coutLivraision());

        Delivery delivery3 = new Delivery(100.0,5.0);
        Assertions.assertEquals(35.0, delivery3.coutLivraision());


        Delivery delivery4 = new Delivery(120.0,30.0);
        Assertions.assertEquals(50.0, delivery4.coutLivraision());
    }
}