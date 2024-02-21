package com.example.connectaGym.service;

import com.example.connectaGym.entity.Propietaris;
import com.example.connectaGym.repository.PropietarisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarisService {

    @Autowired
    private PropietarisRepository propietarisRepository;

    public List<Propietaris> getPropietaris() {
        return this.propietarisRepository.findAll();
    }

    public Propietaris getPropietariById(Long id) {
        Optional<Propietaris> propietariOptional = this.propietarisRepository.findById(id);
        return propietariOptional.orElse(null);
    }

    public Propietaris afegirPropietari(Propietaris p) {
        return this.propietarisRepository.save(p);
    }

    public Propietaris editarPropietari(Propietaris p) {
        return this.propietarisRepository.save(p);
    }

    public Propietaris esborrarPropietari(Long id) {
        Optional<Propietaris> propietariOptional = this.propietarisRepository.findById(id);
        if (propietariOptional.isPresent()) {
            Propietaris propietari = propietariOptional.get();
            this.propietarisRepository.deleteById(id);
            return propietari;
        } else {
            return null;
        }
    }
}