package com.example.minicrudapp.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String title;

    private String author;

    private String genre;

    private String language;

    public Book(Long bookId, String testTitel, String testAutor) {
    }

    public Book(String testTitle, String testAuthor, String testGenre, String testLanguage) {
    }
}
