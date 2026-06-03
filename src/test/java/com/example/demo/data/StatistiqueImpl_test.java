import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StatistiqueImpl_test {

    @Test
    void StatistiqueImpl_test_avec_des_voitures() {

        StatistiqueImpl stat1 = new StatistiqueImpl();
        StatistiqueImpl stat_vide = new StatistiqueImpl();


        Voiture voiture1 = new Voiture("Opel", 10000);
        Voiture voiture2 = new Voiture("Mercedes", 50000);
        stat1.ajouter(voiture1);
        stat1.ajouter(voiture2);

        assertEquals(30000, stat1.prixMoyen().getPrixMoyen(),"Le prix moyen est faux");
        assertEquals(2, stat1.prixMoyen().getNombreDeVoitures(),"Le nombre de voitures est faux");
        

        StatistiqueImpl stat_vide = new StatistiqueImpl();
        assertThrows(ArithmeticException.class, () -> stat_vide.prixMoyen(), "L'exception n'est pas levée");
    }

}