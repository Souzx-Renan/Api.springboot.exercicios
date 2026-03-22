package trabalho.java.lista.exercicios.Departamentos.repository;

import trabalho.java.lista.exercicios.Departamentos.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}