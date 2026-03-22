package trabalho.java.lista.exercicios.Livro.controller;

import trabalho.java.lista.exercicios.Livro.entity.Livro;
import trabalho.java.lista.exercicios.Livro.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    // POST /livros
    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }

    // GET /livros
    @GetMapping
    public List<Livro> listar() {
        return service.listarTodos();
    }

    // GET /livros/{id}
    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // DELETE /livros/{id}
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}