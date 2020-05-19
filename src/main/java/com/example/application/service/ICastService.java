package com.example.application.service;
import com.example.application.model.Cast;
import java.util.List;

public interface ICastService {
    List<Cast> listCasts(Long movie_id);
    
}