package com.example.connectaGym.controller;

import com.example.connectaGym.entity.Propietaris;
import com.example.connectaGym.service.PropietarisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/propietaris")
@RestController
public class PropietarisController {

    @Autowired
    PropietarisService propietarisService;

    @GetMapping()
    public List<Propietaris> getPropietaris() {
        return this.propietarisService.getPropietaris();
    }

    @GetMapping("/{id}")
    public Propietaris getPropietariById(@PathVariable("id") Long id) {
        return this.propietarisService.getPropietariById(id);
    }

    @PostMapping()
    public Propietaris nouPropietari(@RequestBody Propietaris p) {
        return this.propietarisService.afegirPropietari(p);
    }

    @PutMapping("/{id}")
    public Propietaris editarPropietari(@RequestBody Propietaris p) {
        return this.propietarisService.editarPropietari(p);
    }

    @DeleteMapping("/{id}")
    public Propietaris esborrarPropietari(@PathVariable("id") Long id) {
        return this.propietarisService.esborrarPropietari(id);
    }
}