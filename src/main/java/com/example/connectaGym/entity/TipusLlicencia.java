package com.example.connectaGym.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tipus_llicencies")
public class TipusLlicencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Preu")
    private Double preu;

    @Column(name = "Tipus")
    private String tipus;

    @Column(name = "Mesos")
    private Integer mesos;

    @Column(name = "Creador")
    private String creador;

    @Column(name = "DataCreacio")
    private Date dataCreacio;

    @Column(name = "DataModificacio")
    private Date dataModificacio;

    // Getters i setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Integer getMesos() {
        return mesos;
    }

    public void setMesos(Integer mesos) {
        this.mesos = mesos;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Date getDataCreacio() {
        return dataCreacio;
    }

    public void setDataCreacio(Date dataCreacio) {
        this.dataCreacio = dataCreacio;
    }

    public Date getDataModificacio() {
        return dataModificacio;
    }

    public void setDataModificacio(Date dataModificacio) {
        this.dataModificacio = dataModificacio;
    }
}