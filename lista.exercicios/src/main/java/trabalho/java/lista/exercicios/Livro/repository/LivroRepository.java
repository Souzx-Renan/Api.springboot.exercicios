package trabalho.java.lista.exercicios.Livro.repository;

import trabalho.java.lista.exercicios.Livro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}