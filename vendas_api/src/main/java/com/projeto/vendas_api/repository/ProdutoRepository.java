package com.projeto.vendas_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.vendas_api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}