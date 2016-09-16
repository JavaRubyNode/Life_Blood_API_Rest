package br.com.vinicius.repository;

import br.com.vinicius.domain.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vinicius on 16/09/16.
 */
public interface DoadorRepository extends JpaRepository<Doador,Long> {
}
