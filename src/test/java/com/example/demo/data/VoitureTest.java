import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoitureTest {

    @Test
    void voiture_test() {

        Voiture voiture1 = new Voiture("Volkswagen", 15000);
        voiture1.setId(1);
        Voiture voiture2 = new Voiture("Audi", 20000);
        voiture2.setId(2);

        assertTrue(voiture1.getMarque().equals("Volkswagen"));
        assertTrue(!voiture1.getMarque().equals("Gabin"));
        assertTrue(voiture1.getId() != voiture2.getId()); ;}}