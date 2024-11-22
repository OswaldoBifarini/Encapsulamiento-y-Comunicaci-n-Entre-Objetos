/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoc.comunicacionentreobjetos.Estudiantes;

/**
 *
 * @author DELL
 */
public class Estudiantes {
     private String nombre;
    private String apellido;
    
    //
    public Estudiantes (){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //este metodo VOID que se llama estudiar imprime el nombre mas lo que esta haciendo el estudiante
    private void estudiar (){
        System.out.println(this.nombre+" "+this.apellido+" is studing in ");
    
}
}
