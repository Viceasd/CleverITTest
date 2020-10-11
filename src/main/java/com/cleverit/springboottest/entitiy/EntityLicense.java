package com.cleverit.springboottest.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class EntityLicense {
    @Id
    private String id;
    @Column(name = "patente")
    private String patente;
    @Column(name = "tipo_auto")
    private String tipoAuto;
    @Column(name = "color")
    private String color;


// Getter Methods

    public String getId() {
        return id;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public String getColor() {
        return color;
    }

    // Setter Methods
    public void setId(String id) {
        this.id = id;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
