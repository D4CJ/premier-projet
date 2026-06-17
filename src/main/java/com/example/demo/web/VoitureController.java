package com.example.demo.web;

import com.example.demo.data.Voiture;
import org.springframework.web.bind.annotation.*;

@RestController
public class VoitureController {

    @GetMapping("/bonjour")
    public String disBonjour(){
        return "Bonjour";
    }

    @GetMapping("/voiture")
    public Voiture getVoiture(){
        Voiture v = new Voiture();
        v.setId(1);
        return v;
    }

//J'ai mis en commentaire parce qu'il y a un conflit d'URL avec le controller StatistiqueController.
   
    //@PostMapping("/voiture")
    //public void creerVoiture(@RequestBody Voiture voiture) throws VoitureException {
       // if(voiture.getId() == 0){
          //  throw new VoitureException();
       // }
       // System.out.println(voiture);
  //  }

}
