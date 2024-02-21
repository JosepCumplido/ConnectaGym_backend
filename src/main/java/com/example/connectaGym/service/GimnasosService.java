package com.example.connectaGym.service;

import com.example.connectaGym.controller.exceptions.ServiceException;
import com.example.connectaGym.entity.Gimnasos;
import com.example.connectaGym.repository.GimnasosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GimnasosService {

    @Autowired
    private GimnasosRepository gimnasosRepository;

    public List<Gimnasos> getGimnasos() {
        return this.gimnasosRepository.findAll();
    }

    public Gimnasos getGimnasById(Long id) {
        Optional<Gimnasos> gimnasosOptional = this.gimnasosRepository.findById(id);
        return gimnasosOptional.orElse(null);
    }
    public Gimnasos afegirGimnas(Gimnasos g) {
        return this.gimnasosRepository.save(g);
    }

    public Gimnasos editarGimnas(Gimnasos g) {
        return this.gimnasosRepository.save(g);
    }

    public Gimnasos deleteGimnas(Long id) {
        try {
            Optional<Gimnasos> optionalGimnasos = this.gimnasosRepository.findById(id);
            if (optionalGimnasos.isPresent()) {
                Gimnasos gimnasos = optionalGimnasos.get();
                this.gimnasosRepository.deleteById(id);
                return gimnasos;
            } else throw new ServiceException("Gimnas no trobat");
        } catch (Exception ex) {
            throw new ServiceException(ex.getMessage());
        }
    }
}
