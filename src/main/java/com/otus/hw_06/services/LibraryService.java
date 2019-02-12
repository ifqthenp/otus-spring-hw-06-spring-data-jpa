package com.otus.hw_06.services;

import com.otus.hw_06.domain.Book;
import com.otus.hw_06.domain.Comment;
import com.otus.hw_06.domain.Genre;
import com.otus.hw_06.repository.AuthorRepository;
import com.otus.hw_06.repository.BookRepository;
import com.otus.hw_06.repository.CommentRepository;
import com.otus.hw_06.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class LibraryService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;
    private final AuthorRepository authorRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public LibraryService(final BookRepository bookRepository,
                          final GenreRepository genreRepository,
                          final AuthorRepository authorRepository,
                          final CommentRepository commentRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
        this.authorRepository = authorRepository;
        this.commentRepository = commentRepository;
    }

    public long countAllBooks() {
        return bookRepository.count();
    }

    public String findAllBooks() {
        final List<Book> allBooks = bookRepository.findAll();
        return allBooks.stream()
            .map(b -> String.format("%2d. %-25s %-30s %s %-40s %s", b.getId(),
                getAuthorsFrom(b), b.getTitle(), b.getYear(), getGenresFrom(b),
                getCommentsFrom(b)))
            .collect(Collectors.joining("\n"));
    }

    public String findBookById(final Long id) {
        final Optional<Book> book = bookRepository.findById(id);
        return book
            .map(b -> String.format("%-7s: %s%n", "Book", b.getTitle()) +
                String.format("%-7s: %s%n", "Authors", getAuthorsFrom(b)) +
                String.format("%-7s: %s", "Genres", getGenresFrom(b)))
            .orElse(String.format("Book with ID %d is not found", id));
    }

    @Transactional
    public void saveCommentToBook(final Long id, final String comment) {
        Optional<Book> book = bookRepository.findById(id);
        Comment c = new Comment();
        c.setCommentary(comment);
        if (book.isPresent()) {
            book.get().addComment(c);
            bookRepository.save(book.get());
            System.out.printf("Comment has been saved. Book id %d%n", id);
        } else {
            System.out.printf("Comment has not been saved. Book id %d%n", id);
        }
    }

    @Transactional
    public void deleteBookById(final Long id) {
        final Optional<Book> bookById = bookRepository.findById(id);
        if (bookById.isPresent()) {
            bookRepository.deleteById(id);
            System.out.printf("Book with id %d has been deleted.%n", id);
        } else {
            System.out.printf("Book with id %d does not exist.%n", id);
        }
    }

    @Transactional
    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    private String getAuthorsFrom(final Book book) {
        boolean hasAuthors = !book.getAuthors().isEmpty();
        return hasAuthors ? book.getAuthors().stream()
            .map(a -> a.getFirstName() + " " + a.getLastName())
            .collect(Collectors.joining(", ")) : "[]";
    }

    private String getGenresFrom(final Book book) {
        boolean hasGenres = !book.getGenres().isEmpty();
        return hasGenres ? book.getGenres().stream()
            .map(Genre::getGenreName)
            .collect(Collectors.joining(", ")) : "[]";
    }

    private String getCommentsFrom(final Book book) {
        boolean hasComments = !book.getComments().isEmpty();
        return hasComments ? book.getComments().stream()
            .map(Comment::getCommentary)
            .collect(Collectors.joining(", ")) : "[]";
    }

}
