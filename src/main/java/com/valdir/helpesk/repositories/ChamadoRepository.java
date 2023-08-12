package com.valdir.helpesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
