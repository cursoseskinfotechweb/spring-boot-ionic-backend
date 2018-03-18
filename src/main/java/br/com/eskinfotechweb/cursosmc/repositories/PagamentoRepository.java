package br.com.eskinfotechweb.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eskinfotechweb.cursosmc.domain.Pagamento;

@Repository 
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
