package com.otus.hw_06.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "commentary")
    private String commentary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_book_id")
    private Book book;

}
