package com.projeto.vendas_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.vendas_api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}