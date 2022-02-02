import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    void getMontre() {
    }

    @Test
    void porterMontrer() {
    }

    @Test
    void removeWatch() {
    }

    @Test
    void askTime() {
        Personne ulrich=new Personne("ulrich");
        Montre MontreUlrich=new Montre(15,8);
       ulrich.AskTime();
       assertEquals("15H10",ulrich.AskTime());


    }

    @Test
    void isPersonHaveWatch() {
        Personne abel=new Personne("abel");
        Montre MontreAbel=new Montre(10,30);
        abel.PorterMontrer(MontreAbel);
        assertTrue(abel.getIsHaveWatch());

    }
}