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
public class Alumno extends Persona{
    
    private int edad;
    private Responsable responsable;
    private Categoria categoria;
    private Seguro seguro;

    public Alumno(Responsable responsable, Seguro seguro, String dni, String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento, String genero) {
        super(dni, nombre, apellidos, direccion, telefono, fechaNacimiento, genero);
        validarDatos();
        this.responsable = responsable;
        this.seguro = seguro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
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
        
        if (edad>=5 && edad<=9){
            categoria = Categoria.ninnos;
        } else if (edad>9 && edad<=14){
            categoria = Categoria.juvenil;
        } else if (edad>14 && edad<=18){
            categoria = Categoria.mayor;
        }
    }
}
