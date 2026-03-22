package trabalho.java.lista.exercicios.Categorias.controller;

import trabalho.java.lista.exercicios.Categorias.entity.Categoria;
import trabalho.java.lista.exercicios.Categorias.service.CategoriasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    private final CategoriasService service;

    public CategoriasController(CategoriasService service) {
        this.service = service;
    }

    // Criar nova categoria
    @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
        Categoria novaCategoria = service.salvar(categoria);
        return new ResponseEntity<>(novaCategoria, HttpStatus.CREATED);
    }

    // Listar todas as categorias
    @GetMapping
    public ResponseEntity<List<Categoria>> listar() {
        List<Categoria> categorias = service.listarTodos();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    // Buscar categoria por ID
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(categoria -> new ResponseEntity<>(categoria, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Deletar categoria por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}