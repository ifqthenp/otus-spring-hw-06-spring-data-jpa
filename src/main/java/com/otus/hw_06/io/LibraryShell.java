package com.otus.hw_06.io;

import com.otus.hw_06.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("Library")
public class LibraryShell {

    private final LibraryService service;

    @Autowired
    public LibraryShell(final LibraryService service) {
        this.service = service;
    }

    @ShellMethod(value = "Count all books.")
    public long countBooks() {
        return service.countAllBooks();
    }

    @ShellMethod(value = "Get a book by id.")
    public String getBookById(final Long id) {
        return service.findBookById(id);
    }

    @ShellMethod("Get all books in the library.")
    public String getAllBooks(){
        return service.findAllBooks();
    }

    @ShellMethod("Save a comment to a book.")
    public void saveComment(final Long id, final String comment){
        service.saveCommentToBook(id, comment);
    }

    @ShellMethod("Delete a book by ID.")
    public void deleteBookById(final Long id){
        service.deleteBookById(id);
    }

    @ShellMethod("Delete all books.")
    public void deleteAllBooks(){
        service.deleteAllBooks();
    }

}
