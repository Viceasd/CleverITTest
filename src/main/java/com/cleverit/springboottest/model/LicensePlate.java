package com.cleverit.springboottest.model;


public class LicensePlate {
    private String id;
    private String patente;
    private String tipoAuto;
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