package com.projeto.literalura.repositorio;

import com.projeto.literalura.modelos.Livro;
import com.projeto.literalura.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Year;
import java.util.List;

public interface repositorioLivros extends JpaRepository<Livro, Long> {
    @Query("SELECT a FROM Livro l JOIN l.autor a")
    List<Autor> buscarAutores();

    @Query ("SELECT a FROM Livro l JOIN l.autor a WHERE a.anoNascimento <= :ano and a.anoFalecimento >= :ano")
    List<Autor> buscarAutoresVivosNoAno(Year ano);

    List<Livro> findByIdioma(String idioma);

    @Query ("SELECT a FROM Livro l JOIN l.autor a WHERE a.autor = :autor")
    Autor buscarAutorPeloNome(String autor);

    Integer countByIdioma(String idioma);
}
