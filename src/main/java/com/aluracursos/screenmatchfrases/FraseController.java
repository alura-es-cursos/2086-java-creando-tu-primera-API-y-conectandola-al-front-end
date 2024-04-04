package com.aluracursos.screenmatchfrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrases(){
        return service.obtenerFraseAleatoria();
    }
}

