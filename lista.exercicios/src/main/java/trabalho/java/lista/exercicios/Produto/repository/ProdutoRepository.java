package trabalho.java.lista.exercicios.Produto.repository;

import trabalho.java.lista.exercicios.Produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que permite operações CRUD automáticas com Produto
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}