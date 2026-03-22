package trabalho.java.lista.exercicios.Autores.controller;

import trabalho.java.lista.exercicios.Autores.entity.Autores;
import trabalho.java.lista.exercicios.Autores.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    // Criar novo autor
    @PostMapping
    public ResponseEntity<Autores> criar(@RequestBody Autores autor) {
        Autores salvo = service.salvar(autor);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }

    // Listar todos os autores
    @GetMapping
    public ResponseEntity<List<Autores>> listarTodos() {
        List<Autores> autores = service.listarTodos();
        return new ResponseEntity<>(autores, HttpStatus.OK);
    }

    // Buscar autor por ID
    @GetMapping("/{id}")
    public ResponseEntity<Autores> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(autor -> new ResponseEntity<>(autor, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Deletar autor por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}