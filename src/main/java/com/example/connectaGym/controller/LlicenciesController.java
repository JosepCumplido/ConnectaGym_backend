package com.example.connectaGym.controller;

import com.example.connectaGym.entity.Llicencies;
import com.example.connectaGym.service.LlicenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/llicencies")
@RestController
public class LlicenciesController {

    @Autowired
    LlicenciesService llicenciesService;

    @GetMapping()
    public List<Llicencies> getLlicencies() {
        return this.llicenciesService.getLlicencies();
    }

    @GetMapping("/actives")
    public List<Llicencies> getLlicenciesActives() {
        return this.llicenciesService.getLlicenciesActives();
    }

    @GetMapping("/inactives")
    public List<Llicencies> getLlicenciesInactives() {
        return this.llicenciesService.getLlicenciesInactives();
    }

    @GetMapping("/{id}")
    public Llicencies getLlicenciaById(@PathVariable("id") Long id) {
        return this.llicenciesService.getLlicenciaById(id);
    }

    @PostMapping()
    public Llicencies novaLlicencia(@RequestBody Llicencies ll) {
        return this.llicenciesService.afegirLlicencia(ll);
    }

    @DeleteMapping()
    public Llicencies deleteLlicencia(@PathVariable("id") Long id) {
        return this.llicenciesService.deleteLlicencia(id);
    }
}
