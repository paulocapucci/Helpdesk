package com.valdir.helpesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

}
