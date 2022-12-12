package com.example.atividadefinal.backend.repository;

import com.example.atividadefinal.backend.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
