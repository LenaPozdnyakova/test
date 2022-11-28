package com.example.test.enteties;


import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "ISBM", nullable = false, length = 13)
    private String ISBM;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "year", nullable = false, length = 4)
    private String year;

    @Column(name = "genre", nullable = false, length = 255)
    private String genre;

    @Column(name = "date", nullable = false)
    private LocalTime date;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
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

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
