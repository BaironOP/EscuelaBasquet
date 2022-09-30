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
public class AuxiliarContable extends Trabajador{
    private int edad;

    public AuxiliarContable(double salario, String dni, String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento, String genero) {
        super(salario, dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        validarDatos();
    }

    public int getEdad() {
        return edad;
    }
    
    public Administradora ascender(){
        Administradora admin = null;
        if (edad>35){
            admin = new Administradora(Date.from(Instant.EPOCH), 0, getDni(), getNombre(), getApellidos(), getDireccion(), getTelefono(), getFechaNacimiento(), getGenero());
        }
        return admin;
    }

    @Override
    public void validarDatos() {
        if (Date.from(Instant.EPOCH).getMonth()>fechaNacimiento.getMonth()){
            edad = Date.from(Instant.EPOCH).getYear() - fechaNacimiento.getYear();
        } else if (Date.from(Instant.EPOCH).getMonth()==fechaNacimiento.getMonth()){
            if (Date.from(Instant.EPOCH).getDay()<fechaNacimiento.getDay()){
                edad = Date.from(Instant.EPOCH).getYear() - fechaNacimiento.getYear() - 1;
            } else {
                edad = Date.from(Instant.EPOCH).getYear() - fechaNacimiento.getYear();
            }
        } else if (Date.from(Instant.EPOCH).getMonth()<fechaNacimiento.getMonth()){
            edad = Date.from(Instant.EPOCH).getYear() - fechaNacimiento.getYear() - 1;
        }
    }
}
