package com.example.application.repository;

import java.util.List;
import com.example.application.model.Cast;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepository extends CrudRepository<Cast, Long> {
    @Query("SELECT c from Cast c INNER JOIN MovieCastMapping p ON p.cast_id = c.id AND p.movie_id = :id ")
    public List<Cast> listCasts(@Param("id") Long movie_id);
}