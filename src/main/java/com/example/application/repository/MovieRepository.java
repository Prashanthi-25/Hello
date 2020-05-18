package com.example.application.repository;

import java.util.List;

import com.example.application.model.Movie;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    @Query("SELECT m from movies m where m.name = :name")       // using @query
    public List<Movie> findByName(@Param("name") String name);
}