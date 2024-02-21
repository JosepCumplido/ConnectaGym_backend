package com.example.connectaGym.controller;

import com.example.connectaGym.entity.Gimnasos;
import com.example.connectaGym.service.GimnasosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/gimnasos")
public class GimnasosController {

    @Autowired
    GimnasosService gimnasosService;

    @GetMapping()
    public List<Gimnasos> getGimnasos() {
        return this.gimnasosService.getGimnasos();
    }

    @GetMapping("/{id}")
    public Gimnasos getGimnasById(@PathVariable("id") Long id) {
        return this.gimnasosService.getGimnasById(id);
    }

    @PostMapping()
    public Gimnasos afegirGimnas(@RequestBody Gimnasos g) {
        return this.gimnasosService.afegirGimnas(g);
    }

    @PutMapping("/{id}")
    public Gimnasos editarGimnas(@RequestBody Gimnasos g) {
        return this.gimnasosService.editarGimnas(g);
    }

    @DeleteMapping("/{id}")
    public Gimnasos deleteGimnas(@PathVariable("id") Long id) {
        return this.gimnasosService.deleteGimnas(id);
    }
}
