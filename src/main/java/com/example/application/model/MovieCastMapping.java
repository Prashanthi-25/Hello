package com.example.application.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_cast_mappings")
public class MovieCastMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long movie_id;
    private Long cast_id;
    public Long getId() {
        return id;
    }
    public Long getMovieId() {
        return movie_id;
    }
    public Long getCastId() {
        return cast_id;
    }
}
