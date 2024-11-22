/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoc.comunicacionentreobjetos.Cursos;

import ec.edu.espoc.comunicacionentreobjetos.Estudiantes.Estudiantes;

/**
 *
 * @author DELL
 */
public class Cursos {
    
    private String nombre;
    private String paralelo;
    
    //constructor
    public Cursos(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
    
    
    private void agregarEstudiante (Estudiantes objEstudiantes){
        System.out.println(" the student "+objEstudiantes.getNombre()+""+objEstudiantes.getApellido()
                +" is added in  "+" the course of "+this.nombre);
    }
    
}
