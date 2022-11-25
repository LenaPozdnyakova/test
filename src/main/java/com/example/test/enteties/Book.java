package com.example.test.enteties;


import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ForeignKey
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "author", nullable = false, table = "255")
    private String author;

    @Column(name = "ISBM", nullable = false, table = "13")
    private String ISBM;

    @Column(name = "title", nullable = false, table = "255")
    private String title;

    @Column(name = "year", nullable = false, table = "4", table = "255")
    private String year;

    @Column(name = "genre", nullable = false, table = "255")
    private String genre;

    @Column(name = "date", nullable = false)
    private LocalTime date;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
}
