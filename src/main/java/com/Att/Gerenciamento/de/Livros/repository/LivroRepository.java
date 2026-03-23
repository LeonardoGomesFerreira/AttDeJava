package com.Att.Gerenciamento.de.Livros.repository;

import com.Att.Gerenciamento.de.Livros.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}