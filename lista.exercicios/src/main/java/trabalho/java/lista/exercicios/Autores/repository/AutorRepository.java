package trabalho.java.lista.exercicios.Autores.repository;

import trabalho.java.lista.exercicios.Autores.entity.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autores, Long> {
}