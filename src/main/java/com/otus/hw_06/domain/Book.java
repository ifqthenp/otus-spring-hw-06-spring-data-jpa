package com.otus.hw_06.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(name = "book_author",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private final Set<Author> authors = new HashSet<>();

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(name = "book_genre",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private final Set<Genre> genres = new HashSet<>();

    @Column(name = "written")
    private String year;

    @OneToMany(
        mappedBy = "book",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private final List<Comment> comments = new ArrayList<>();

    public void addComment(final Comment comment) {
        comments.add(comment);
        comment.setBook(this);
    }

    public void removeComment(final Comment comment) {
        comments.remove(comment);
        comment.setBook(null);
    }

    public void addGenre(final Genre genre) {
        genres.add(genre);
        genre.getBooks().add(this);
    }

    public void removeGenre(final Genre genre) {
        genres.remove(genre);
        genre.getBooks().remove(this);
    }

    public void addAuthor(final Author author) {
        authors.add(author);
        author.getBooks().add(this);
    }

    public void removeAuthor(final Author author) {
        authors.remove(author);
        author.getBooks().remove(this);
    }

}
