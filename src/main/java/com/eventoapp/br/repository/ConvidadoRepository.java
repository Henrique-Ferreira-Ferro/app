package com.eventoapp.br.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.br.models.Convidado;
import com.eventoapp.br.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
}
