package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World!!!";
    }
    
    @GetMapping("/bsm")
    public String bsm() {
        return "<em>Lista de BSM<br/>"
                + "BSM-GM - Mentalidade de Crescimento <br/>"
                + "BSM-P- Persistência<br/>"
                + "BSM-PR - Responsabilidade Pessoal<br/>"
                + "BSM-FO - Orientação ao Futuro<br/>"
                + "BSM-C - Comunicação<br/>"
                + "BSM-OD - Orientação ao Detalhe<br/>"
                + "BSM-PA - Proatividade<br/>"
                + "BSM-T- Trabalho em Equipe</em>";
    }
    
    @GetMapping("/objetivo")
    public String objetivo() {
        return "<b>Meus objetivos: </b><br><br>"
        		+ "-Aprender java; <br>"
        		+ "-Ajudar os colegas de equipe; <br>"
        		+ "-Desenvolver o projeto integrador; <br>"
        		+ "-Praticar banco de dados SQL. <br>";
    }
}