package com.example.demodocker.controller;

import javax.ws.rs.core.MediaType;

import com.example.demodocker.domain.PessoaDomain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * HelloController
 */
@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    /*
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá vscode";
    }*/
    
    @RequestMapping(value = "/nome-completo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public PessoaDomain getNomePessoa(){
        var pessoaDomain = new PessoaDomain();

        pessoaDomain.setNome("Samir");
        pessoaDomain.setSobreNome("Landou");

        return pessoaDomain;
    }
}