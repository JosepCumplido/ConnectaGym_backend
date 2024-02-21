package com.example.connectaGym.repository;

import com.example.connectaGym.entity.Llicencies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LlicenciesRepository extends JpaRepository<Llicencies, Long> {
    List<Llicencies> findByActivaTrue();

    List<Llicencies> findByActivaFalse();
}
