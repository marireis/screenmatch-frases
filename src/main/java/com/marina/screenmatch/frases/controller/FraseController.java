package com.marina.screenmatch.frases.controller;

import com.marina.screenmatch.frases.model.dto.FraseDTO;
import com.marina.screenmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService servico = new FraseService();

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}
