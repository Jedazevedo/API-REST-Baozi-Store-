package com.projeto.vendas_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.vendas_api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}