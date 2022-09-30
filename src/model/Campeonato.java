/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bairon
 */
public class Campeonato {
    private int numero;
    private Date fecha;
    private String horaInicio;
    private String horaFin;
    private String lugar;
    private ArrayList<Partido> partidos;

    public Campeonato(int numero, Date fecha, String horaInicio, String horaFin, String lugar) {
        this.numero = numero;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        partidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public void addPartido(Partido partido){
        partidos.add(partido);
    }
    
    public Partido getPartido (int nPartido){
        return partidos.get(nPartido);
    }
    
}
