package br.edu.fatecrl.mvc_demo.controllers;

import br.edu.fatecrl.mvc_demo.models.Mercado;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class DadosController {
    private static final List<Mercado> mercados = new ArrayList<Mercado>();

    public DadosController()
    {
        mercados.add(new Mercado("Refrigerante",8));
        mercados.add(new Mercado("Feijão",2));
        mercados.add(new Mercado("Arroz",1));
    }

    @GetMapping
    public List<Mercado> getMercados()
    {
        return mercados;
    }
}
