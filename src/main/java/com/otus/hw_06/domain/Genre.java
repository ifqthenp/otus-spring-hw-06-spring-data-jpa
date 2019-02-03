package com.otus.hw_06.domain;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "genres")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NaturalId
    @Column(name = "genre")
    private String genre;

    @ManyToMany(mappedBy = "genres")
    private final Set<Book> books;

}
