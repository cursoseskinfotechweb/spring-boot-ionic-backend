package br.com.eskinfotechweb.cursosmc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eskinfotechweb.cursosmc.domain.Cliente;
import br.com.eskinfotechweb.cursosmc.repositories.ClienteRepository;
import br.com.eskinfotechweb.cursosmc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}

}
