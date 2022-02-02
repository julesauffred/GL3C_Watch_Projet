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
    }

    @Test
    void isPersonHaveWatch() {
        Personne abel=new Personne("abel");
        Montre MontreAbel=new Montre(10,30);
        abel.PorterMontrer(MontreAbel);
        assertTrue(abel.getIsHaveWatch());

    }
}