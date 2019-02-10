package com.otus.hw_06.repository;

import com.otus.hw_06.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    Optional<Genre> findByGenreNameContainingIgnoreCase(String genre);

}
