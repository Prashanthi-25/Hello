package com.example.application.service;
import com.example.application.model.Cast;
import com.example.application.repository.CastRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService implements ICastService {

    @Autowired
    private CastRepository repository;

    @Override
    public List<Cast> listCasts(Long movie_id) {
        return repository.listCasts(movie_id);
    }

}