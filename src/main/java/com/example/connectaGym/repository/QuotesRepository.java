package com.example.connectaGym.repository;

import com.example.connectaGym.entity.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes, Long> {

}
