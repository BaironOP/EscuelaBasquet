/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author BaironOP
 */
public class Seguro {
    private Aseguradora aseguradora;
    private Ambulancia ambulancia;

    public Seguro(Aseguradora aseguradora, Ambulancia ambulancia) {
        this.aseguradora = aseguradora;
        this.ambulancia = ambulancia;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }
    
}
