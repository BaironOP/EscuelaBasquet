/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author BaironOP
 */
public class Profesor extends Trabajador{
    private String especialidad;

    public Profesor(String especialidad, double salario, String dni, String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
