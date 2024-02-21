package com.example.connectaGym.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pagaments")
public class Pagaments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "NomMembre")
    private String nomMembre;

    @Column(name = "Quota")
    private Double quota;

    @Column(name = "Quantitat")
    private Double quantitat;

    @Column(name = "DataInici")
    private Date dataInici;

    @Column(name = "DataFinal")
    private Date dataFinal;

    @Column(name = "Gimnas")
    private String gimnas;

    @Column(name = "Actiu")
    private Boolean actiu;

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

    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }

    public Double getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(Double quantitat) {
        this.quantitat = quantitat;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getGimnas() {
        return gimnas;
    }

    public void setGimnas(String gimnas) {
        this.gimnas = gimnas;
    }

    public Boolean getActiu() {
        return actiu;
    }

    public void setActiu(Boolean actiu) {
        this.actiu = actiu;
    }
}