package com.otus.hw_06.repository;

import com.otus.hw_06.domain.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

    Optional<Genre> findByGenreNameContainingIgnoreCase(String genre);

}
