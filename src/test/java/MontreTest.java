import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {

    @Test
    void addMinute() {
    }

    @Test
    void getTime() {
    }

    @Test
    void setBusy() {
    }

    @Test
    void ismontrecreer() {
        Montre mamontre = new Montre(12,30);
       Assert.assertNotNull("la montre a bien ete crée",mamontre);


    }

    @Test
    void getIsBussy() {
    }
}