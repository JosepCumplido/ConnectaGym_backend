package com.example.connectaGym.controller;

import com.example.connectaGym.entity.TipusLlicencia;
import com.example.connectaGym.service.TipusLlicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/tipusllicencies")
@RestController
public class TipusLlicenciaController {

    @Autowired
    TipusLlicenciaService tipusLlicenciaService;

    @GetMapping()
    public List<TipusLlicencia> getTipusLlicencia() {
        return this.tipusLlicenciaService.getTipusLlicencia();
    }

    @GetMapping("/{id}")
    public TipusLlicencia getTipusLlicenciaById(@PathVariable("id") Long id) {
        return this.tipusLlicenciaService.getTipusLlicenciaById(id);
    }

    @PostMapping()
    public TipusLlicencia novaTipusLlicencia(@RequestBody TipusLlicencia tl) {
        return this.tipusLlicenciaService.afegirTipusLlicencia(tl);
    }

    @PutMapping("/{id}")
    public TipusLlicencia editarTipusLlicencia(@RequestBody TipusLlicencia tl) {
        return this.tipusLlicenciaService.editarTipusLlicencia(tl);
    }

    @DeleteMapping("/{id}")
    public TipusLlicencia deleteTipusLlicencia(@PathVariable("id") Long id) {
        return this.tipusLlicenciaService.deleteTipusLlicencia(id);
    }
}