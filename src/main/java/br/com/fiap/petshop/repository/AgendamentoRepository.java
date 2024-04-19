package br.com.fiap.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.petshop.model.Agendamento;

public interface AgendamentoRepository 
            extends JpaRepository<Agendamento, Long> {
    
}
