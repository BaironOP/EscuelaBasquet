/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author BaironOP
 */
public class Administradora extends Trabajador{
    private Date inicioContrato;
    private Date finalContrato;

    public Administradora(Date inicioContrato, double salario, String dni, String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.inicioContrato = inicioContrato;
        renovarContrato(inicioContrato);
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFinalContrato() {
        return finalContrato;
    }

    public void setFinalContrato(Date finalContrato) {
        this.finalContrato = finalContrato;
    }

    @Override
    public void validarDatos() {
        if (finalContrato.getYear()>=Date.from(Instant.EPOCH).getYear()){
            if (finalContrato.getMonth()>=Date.from(Instant.EPOCH).getMonth()){
                if (finalContrato.getDay()>=Date.from(Instant.EPOCH).getDay()){
                    //Final Code;
                }
            }
        }
    }
    
    public void renovarContrato(Date nuevaFechaInicio){
        inicioContrato = nuevaFechaInicio;
        Date duracionContrato = inicioContrato;
        duracionContrato.setYear(inicioContrato.getYear() + 1);
        finalContrato = duracionContrato;
    }
}
