package com.example.test.enteties;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "isbm", nullable = false, length = 13)
    private String isbm;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "year", nullable = false, length = 4)
    private String year;

    @Column(name = "genre", nullable = false, length = 255)
    private String genre;

    @Column(name = "date", columnDefinition = "DATE", nullable = false)

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {
    }

    public Book(String isbm, String title, String year, String genre, LocalDate date, Author author) {
        this.isbm = isbm;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.date = date;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
