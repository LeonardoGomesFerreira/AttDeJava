package com.Att.Gerenciamento.de.Livros.controller;

import com.Att.Gerenciamento.de.Livros.entity.Livro;
import com.Att.Gerenciamento.de.Livros.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Livro> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}