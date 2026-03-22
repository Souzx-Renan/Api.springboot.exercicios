package trabalho.java.lista.exercicios.Projetos.controller;

import trabalho.java.lista.exercicios.Projetos.entity.Projeto;
import trabalho.java.lista.exercicios.Projetos.service.ProjetoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Projeto> criar(@RequestBody Projeto projeto) {
        Projeto novo = service.salvar(projeto);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> listar() {
        List<Projeto> lista = service.listarTodos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(proj -> new ResponseEntity<>(proj, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}