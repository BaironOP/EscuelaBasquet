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
public abstract class Trabajador extends Persona{
    
    private double salario;

    public Trabajador(double salario, String dni, String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento, String genero) {
        super(dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        this.salario = salario;
    }
    
    @Override
    public void validarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
