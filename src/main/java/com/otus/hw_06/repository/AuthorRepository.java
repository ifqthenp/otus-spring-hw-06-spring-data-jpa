package com.otus.hw_06.repository;

import com.otus.hw_06.domain.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE" +
        " LOWER(CONCAT(TRIM(a.firstName), TRIM(a.lastName))) " +
        "LIKE LOWER(CONCAT('%', TRIM(:name), '%'))")
    Iterable<Author> findByAuthorName(@Param("name") String name);

}
