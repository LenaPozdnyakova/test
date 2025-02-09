package com.example.test.enteties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Id", nullable = false, length = 255)
    private Long id;
    @Column(name = "surname", nullable = false, length = 255)
    private String surname;
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name="patronymic", length = 255)
    private String patronymic;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> books;
    public Author(){

    }
    public Author(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    //public Author() {this.books = new ArrayList<>();}


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {return id;}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
