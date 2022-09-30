/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bairon
 */
public class Partido {
    private int[] marcador;
    private String hora;
    private String arbitro;
    private String equipoContrincante;

    public Partido(String hora, String arbitro, String equipoContrincante) {
        marcador = new int[2];
        this.hora = hora;
        this.arbitro = arbitro;
        this.equipoContrincante = equipoContrincante;
    }

    public String getHora() {
        return hora;
    }

    public String getArbitro() {
        return arbitro;
    }

    public String getEquipoContrincante() {
        return equipoContrincante;
    }
    
    public void setMarcadorLocal(int marcador){
        this.marcador[0]=marcador;
    }
    
    public void setMarcadorContrincante (int marcador){
        this.marcador[1]=marcador;
    }

    public void setMarcador(int[] marcador) {
        this.marcador = marcador;
    }
    
}
