package com.marcos.cursomv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.cursomv.domain.Pedido;;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
