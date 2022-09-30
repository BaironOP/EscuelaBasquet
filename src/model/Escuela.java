/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Bairon
 */
public class Escuela {
    private Administradora administradora;
    private AuxiliarContable auxiliarContable;
    private ArrayList<Profesor> profesores;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Campeonato> campeonatos;
    private int nPartidos;
    private int nPartidosGanados;
    private int nPartidosPerdidos;
    private int nAccidentes;
    private int alumnosRetirados;

    public Escuela() {
        nPartidos = 0;
        nPartidosGanados = 0;
        nPartidosPerdidos = 0;
        profesores = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public Administradora getAdministradora() {
        return administradora;
    }

    public void setAdministradora(Administradora administradora) {
        this.administradora = administradora;
    }

    public AuxiliarContable getAuxiliarContable() {
        return auxiliarContable;
    }

    public void setAuxiliarContable(AuxiliarContable auxiliarContable) {
        this.auxiliarContable = auxiliarContable;
    }

    public int getnPartidos() {
        return nPartidos;
    }

    public void addPartidos(Partido partido, boolean ganado, Campeonato campeonato) {
        campeonatos.get(campeonatos.indexOf(campeonato)).addPartido(partido);
        nPartidos++;
        if (ganado){
            nPartidosGanados++;
        }else{
            nPartidosPerdidos++;
        }
    }

    public int getnPartidosGanados() {
        return nPartidosGanados;
    }

    public int getnPartidosPerdidos() {
        return nPartidosPerdidos;
    }
    
    public void addProfesor(Profesor profesor){
        profesores.add(profesor);
    }

    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void addCampeonato(Campeonato campeonato){
        campeonatos.add(campeonato);
    }

    public int getnAccidentes() {
        return nAccidentes;
    }
    
    public int getNumAlumnosRetirados(){
        return alumnosRetirados;
    }
    
    public void retirarAlumno(Alumno alumno){
        alumnos.remove(alumno);
        alumnosRetirados++;
    }
    
    public int getNumAlumnosMatriculados(){
        return alumnos.size();
    }
}
