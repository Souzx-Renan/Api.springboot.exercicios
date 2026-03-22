package trabalho.java.lista.exercicios.Livro.service;

import trabalho.java.lista.exercicios.Livro.entity.Livro;
import trabalho.java.lista.exercicios.Livro.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public Livro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}