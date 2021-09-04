package com.br.uff.api.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.uff.api.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
