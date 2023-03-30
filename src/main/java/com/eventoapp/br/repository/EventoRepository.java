package com.eventoapp.br.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.br.models.Evento;


public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
	
}
