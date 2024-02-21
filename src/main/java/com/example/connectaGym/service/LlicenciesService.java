package com.example.connectaGym.service;

import com.example.connectaGym.entity.Llicencies;
import com.example.connectaGym.repository.LlicenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LlicenciesService {

    @Autowired
    LlicenciesRepository llicenciesRepository;

    public List<Llicencies> getLlicencies() {
        return this.llicenciesRepository.findAll();
    }

    public List<Llicencies> getLlicenciesActives() {
        return this.llicenciesRepository.findByActivaTrue();
    }

    public List<Llicencies> getLlicenciesInactives() {
        return this.llicenciesRepository.findByActivaFalse();
    }

    public Llicencies getLlicenciaById(Long id) {
        Optional<Llicencies> optionalLlicencia = this.llicenciesRepository.findById(id);
        return optionalLlicencia.orElseGet(Llicencies::new);
    }

    public Llicencies afegirLlicencia(Llicencies ll) {
        this.llicenciesRepository.save(ll);
        return ll;
    }

    public Llicencies deleteLlicencia(Long id) {
            Optional<Llicencies> optionalLlicencies = this.llicenciesRepository.findById(id);
            if (optionalLlicencies.isPresent()) {
                Llicencies llicencies = optionalLlicencies.get();
                this.llicenciesRepository.deleteById(id);
                return llicencies;
            } else return null;
    }
}
