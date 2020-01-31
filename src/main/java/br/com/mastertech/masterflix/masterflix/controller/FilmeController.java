package br.com.mastertech.masterflix.masterflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmeController {
    @GetMapping
    public String index(){
        return "index";
    }

}
