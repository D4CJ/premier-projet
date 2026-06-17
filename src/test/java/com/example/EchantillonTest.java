package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//classe de test que j'ai crée pour améliorer la couverture de code. C'est le tp4.

public class EchantillonTest {

    @Test
    public void test_echantillon_setters_et_constructeur() {
      
        Echantillon ech = new Echantillon();

        ech.setNombreDeVoitures(10);
        ech.setPrixMoyen(25000);
        assertEquals(10, ech.getNombreDeVoitures());
        assertEquals(25000, ech.getPrixMoyen());
    }
}