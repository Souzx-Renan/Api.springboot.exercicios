package trabalho.java.lista.exercicios.Clientes.repository;

import trabalho.java.lista.exercicios.Clientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD automático
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}