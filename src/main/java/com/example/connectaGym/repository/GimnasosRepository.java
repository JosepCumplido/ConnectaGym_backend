package com.example.connectaGym.repository;

import com.example.connectaGym.entity.Gimnasos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GimnasosRepository extends JpaRepository<Gimnasos, Long> {
}
