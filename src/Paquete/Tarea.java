/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author diego
 */
public class Tarea {
    
    private String nombreTarea;

    //Constructor Vacio
    public Tarea() {
    }
    
    //Constructor con atributo
    public Tarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombreTarea=" + nombreTarea + '}';
    }
    
}
