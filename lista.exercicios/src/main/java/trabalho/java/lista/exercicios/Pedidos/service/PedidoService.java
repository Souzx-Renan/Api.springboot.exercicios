package trabalho.java.lista.exercicios.Pedidos.service;

import trabalho.java.lista.exercicios.Pedidos.entity.Pedido;
import trabalho.java.lista.exercicios.Pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}