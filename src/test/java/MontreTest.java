import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {

    @Test
    void addMinute() {
    }

    @Test
    void montreClonner(){
        Montre m = new Montre(23,23);
        Montre clone = new Montre(m);
        assertEquals("23H23",m.getTime());


    }



    @Test
    void ismontrecreer() {
        Montre mamontre = new Montre(12,30);
       Assert.assertNotNull("la montre a bien ete crée",mamontre);


    }

}