package com.marina.screenmatch.frases.service;

import com.marina.screenmatch.frases.model.Frase;
import com.marina.screenmatch.frases.model.dto.FraseDTO;
import com.marina.screenmatch.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria(){
        Frase frase = repositorio.buscaFraseAleatoria() ;
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
