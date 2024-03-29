package com.valdir.helpesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpesk.domain.Chamado;
import com.valdir.helpesk.domain.Cliente;
import com.valdir.helpesk.domain.Tecnico;
import com.valdir.helpesk.domain.enums.Perfil;
import com.valdir.helpesk.domain.enums.Prioridade;
import com.valdir.helpesk.domain.enums.Status;
import com.valdir.helpesk.repositories.ChamadoRepository;
import com.valdir.helpesk.repositories.ClienteRepository;
import com.valdir.helpesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Paulo Capuzzo", "62783093006", "paulocapucci@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Steve Jobs", "87743382001", "steve@gmail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.MEDIA, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
