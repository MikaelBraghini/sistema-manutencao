package br.com.sistemaManutencao.sistemaManutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToManutencao() {
        return "redirect:/manutencao";
    }
}