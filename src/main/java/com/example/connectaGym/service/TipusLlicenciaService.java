package com.example.connectaGym.service;

import com.example.connectaGym.entity.TipusLlicencia;
import com.example.connectaGym.repository.TipusLlicenciaRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipusLlicenciaService {

    @Autowired
    private TipusLlicenciaRepository tipusLlicenciaRepository;

    public List<TipusLlicencia> getTipusLlicencia() {
        return this.tipusLlicenciaRepository.findAll();
    }

    public TipusLlicencia getTipusLlicenciaById(Long id) {
        Optional<TipusLlicencia> optionalTipusLlicencia = this.tipusLlicenciaRepository.findById(id);
        return optionalTipusLlicencia.orElseGet(TipusLlicencia::new);
    }

    public TipusLlicencia afegirTipusLlicencia(TipusLlicencia tl) {
        try {
            this.tipusLlicenciaRepository.save(tl);
            return tl;
        } catch (Exception ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public TipusLlicencia editarTipusLlicencia(TipusLlicencia tl) {
        try {
            Optional<TipusLlicencia> optionalTipusLlicencia = this.tipusLlicenciaRepository.findById(tl.getId());
            if (optionalTipusLlicencia.isPresent()) {
                this.tipusLlicenciaRepository.save(tl);
                return tl;
            } else {
                throw new ServiceException("TipusLlicencia no trobat");
            }
        } catch (Exception ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public TipusLlicencia deleteTipusLlicencia(Long id) {
        try {
            Optional<TipusLlicencia> optionalTipusLlicencia = this.tipusLlicenciaRepository.findById(id);
            if (optionalTipusLlicencia.isPresent()) {
                TipusLlicencia tipusLlicencia = optionalTipusLlicencia.get();
                this.tipusLlicenciaRepository.deleteById(id);
                return tipusLlicencia;
            } else {
                throw new ServiceException("TipusLlicencia no trobat");
            }
        } catch (Exception ex) {
            throw new ServiceException(ex.getMessage());
        }
    }
}