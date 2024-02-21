package com.example.connectaGym.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "llicencies")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Llicencies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Propietari")
    private String propietari;

    @Column(name = "TipusLlicencia")
    private Integer tipusLlicencia;

    @Column(name = "Preu")
    private Double preu;

    @Column(name = "DataInici")
    private Date dataInici;

    @Column(name = "DataVenciment")
    private Date dataVenciment;

    @Column(name = "Activa")
    private Boolean activa;

    // Getters i setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }

    public Integer getTipusLlicencia() {
        return tipusLlicencia;
    }

    public void setTipusLlicencia(Integer tipusLlicencia) {
        this.tipusLlicencia = tipusLlicencia;
    }

    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataVenciment() {
        return dataVenciment;
    }

    public void setDataVenciment(Date dataVenciment) {
        this.dataVenciment = dataVenciment;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}