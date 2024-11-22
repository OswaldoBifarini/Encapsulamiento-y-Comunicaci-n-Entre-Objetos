/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoc.comunicacionentreobjetos;

import ec.edu.espoc.comunicacionentreobjetos.Cursos.Cursos;
import ec.edu.espoc.comunicacionentreobjetos.Estudiantes.Estudiantes;

/**
 *
 * @author DELL
 */
public class ComunicacionEntreObjetos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    //clases en plural}
    Estudiantes objEstudiantes=new Estudiantes();
    objEstudiantes.setNombre("Pedro Stalin");
    objEstudiantes.setApellido("Guerrero Bifarini");
    
    Cursos objCursos=new Cursos();
    objCursos.setNombre("Object Oriented Programming)");
    objCursos.setParalelo("A");
            
    objCursos.agregarEstudiante(objEstudiantes);
    
    //CLASE DE ENCAPSULAMIENTO  -- encapsulation
    
    //*SOLO LOS ATRIBUTOS SE HACEN "PRIVATE" *
    // modificadores de acceso
    /*
    * publico, Protejido, por de fault y privado
    *
    segunda unidad finalizada
    para el miercoles hay practica ,
    REVISAR Y PRACTICAR TODO
    
    */
    
}
}