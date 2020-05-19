package com.example.application.repository;
import java.util.List;
import com.example.application.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    @Query("SELECT m from Movie m where m.name = :name")
    public List<Movie> findByName(@Param("name") String name);
    @Query("SELECT m from Movie m where m.rating BETWEEN :below AND :above")
    public List<Movie> filterByRating(@Param("below") float belowRating,@Param("above") float aboveRating);
    @Query("SELECT m from Movie m ORDER BY m.rating DESC")
    List<Movie> sortByRating();
    @Query("SELECT m from Movie m INNER JOIN MovieCastMapping p ON p.movie_id = m.id")
    public List<Movie> listMovies();
}