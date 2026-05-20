package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void testVoiture(){

        Voiture voiture1 = new Voiture("Volkswagen", 15000);
        voiture1.setId(1);

        Voiture voiture2 = new Voiture("Audi", 20000);
        voiture2.setId(2);

        Assert.isTrue(voiture1.getMarque().equals("Volkswagen"),"Normalement c'est Volkswagen");
        Assert.isTrue(voiture1.getMarque()!="Gabin","Normalement c'est Volkswagen");
        //Assert.isTrue(voiture1.getId() != voiture2.getId(), "ce n'est pas les mêmes"); 
    }

}
