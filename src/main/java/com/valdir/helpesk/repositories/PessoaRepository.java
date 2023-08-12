package com.valdir.helpesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer> {

}
