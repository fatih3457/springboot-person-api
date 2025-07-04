package com.egtm.personapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "persons") // tablo adı "persons" olur
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otomatik ID üretimi
    private Long id;

    @Column(nullable = false) // boş bırakılamaz
    private String name;

    @Column(nullable = false)
    private int age;

    // Constructorlar
    public Person() {
    }

    public Person(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter ve Setter'lar
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
