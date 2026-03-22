package trabalho.java.lista.exercicios.Tarefas.controller;

import trabalho.java.lista.exercicios.Tarefas.entity.Tarefa;
import trabalho.java.lista.exercicios.Tarefas.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@RequestBody Tarefa tarefa) {
        Tarefa nova = service.salvar(tarefa);
        return new ResponseEntity<>(nova, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listar() {
        List<Tarefa> lista = service.listarTodos();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(tarefa -> new ResponseEntity<>(tarefa, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}