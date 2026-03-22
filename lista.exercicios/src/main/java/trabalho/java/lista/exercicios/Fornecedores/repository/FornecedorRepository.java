package trabalho.java.lista.exercicios.Fornecedores.repository;

import trabalho.java.lista.exercicios.Fornecedores.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}