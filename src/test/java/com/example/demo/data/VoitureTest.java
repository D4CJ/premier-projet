package com.example.demo.data;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class VoitureTest {

    @Test
    void voiture_test() {
        // 1. Instanciation
        Voiture voiture1 = new Voiture("Volkswagen", 15000);
        voiture1.setId(1);

        Voiture voiture2 = new Voiture("Audi", 20000);
        voiture2.setId(2);

        assertEquals("Volkswagen", voiture1.getMarque());
        assertNotEquals("Gabin", voiture1.getMarque());
        assertNotEquals(voiture1.getId(), voiture2.getId());
    }



    // J'ai ajouter ce teste pour améliorer la couverture. C'est le tp4.
    @Test
    public void test_voiture_exception() {
        
        VoitureException voiture_exception = new VoitureException();
        assertNotNull(voiture_exception); 
    }

    
}