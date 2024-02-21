package com.example.connectaGym.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visites")
public class Visites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "NomMembre")
    private String nomMembre;

    @Column(name = "DataVisita")
    private Date dataVisita;

    @Column(name = "Gimnas")
    private String gimnas;

    // Getters i setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getGimnas() {
        return gimnas;
    }

    public void setGimnas(String gimnas) {
        this.gimnas = gimnas;
    }
}