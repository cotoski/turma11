package br.paduan.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // respode a requisições no format REST
@CrossOrigin("*")  // as requisições podem vir de qq origem
@RequestMapping("/inicio")
public class Hello {
    
    @GetMapping("/hello")  // uri e verbo (http) que este método responde
    public String hello(){
        return "Olá mundo!";
    }

    @PostMapping("/hello")  // uri e verbo (http) que este método responde
    public String hello2(){
        return "Olá mundo via POST!";
    }
    
}
