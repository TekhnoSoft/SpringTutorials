package com.tekhnodevelop.tutorials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekhnodevelop.tutorials.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
