package br.com.fiap.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.petshop.model.Agendamento;
import br.com.fiap.petshop.repository.AgendamentoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("agendamento")
public class AgendamentoController {

    @Autowired
    AgendamentoRepository repository;

    @PostMapping
    public Agendamento create(@RequestBody @Valid Agendamento agendamento){
        return repository.save(agendamento);
    }
    
}
