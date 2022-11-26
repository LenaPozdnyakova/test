package com.example.test.enteties;

import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table(name = "Authors")
public class Author {
    @OneToMany(mappedBy = "author")
    private Set<Book> books;

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

    @OneToMany(mappedBy = "author")
    private Set<Book> books;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;

    }

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
}
