package com.example.application.model;

// import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String genre;
    private float rating;

    public Movie() {
    }

    public Movie(Long id,String name, String genre,float rating) {

        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating=rating;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getGenre() {
        return genre;
    }
    public float getRating() {
        return rating;
    }
}
    