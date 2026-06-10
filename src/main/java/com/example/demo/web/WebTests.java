package com.example.demo.web;

import com.example.demo.data.Voiture;
import com.example.demo.service.Echantillon;
import com.example.demo.service.StatistiqueImpl;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class WebTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void test_post_voiture() throws Exception {
        mockMvc.perform( 
    post("/voiture").contentType(MediaType.APPLICATION_JSON).content("{\"marque\":\"f\",\"prix\":100}")
    ).andExpect(status().isOk());
    
    verify(statistiqueImpl).ajouter(any(Voiture.class));
    }

    @Test
    public void test_post_voiture_cassee() throws Exception {
        mockMvc.perform( 
    post("/voiture").contentType(MediaType.APPLICATION_JSON).content("Ce n'est pas du JSON")
).andExpect(status().isBadRequest());
    }

    @Test
    public void test_get_statistique() throws Exception {
        when(statistiqueImpl.prixMoyen()).thenReturn(new Echantillon(2, 5000));

        mockMvc.perform(get("/statistique")).andExpect(status().isOk())
        .andExpect(jsonPath("$.nombreDeVoitures").value(2))
        .andExpect(jsonPath("$.prixMoyen").value(5000));
        
    }

    @Test
    public void test_get_statistique_pas_de_voiture() throws Exception {
        when(statistiqueImpl.prixMoyen()).thenThrow(new ArithmeticException());

        mockMvc.perform(get("/statistique")).andExpect(status().isBadRequest());
        
    }
     
}