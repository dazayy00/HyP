/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estudiante;

/**
 *
 * @author johan
 */
public class main {

    public static void main(String[] args) {
        Curso curso = new Curso("Programacion orientada a objetos", "Dr, Adolfo parada", "poo564", 4);
        
        Estudiante e1 = new Estudiante("Johan", "Baltazar", "a001", 3, 8.5);
        Estudiante e2 = new Estudiante("Valeria", "Rivera", "a002", 3, 9.9);
        Estudiante e3 = new Estudiante("Paola", "Romereo", "a003", 3, 9.6);
        Estudiante e4 = new Estudiante("David", "Trinidad", "a004", 5, 9.7);
        
        curso.añadir(e1);
        curso.añadir(e2);
        curso.añadir(e3);
        curso.añadir(e4);
        
        curso.mostrarEstudiantes();
        
        System.out.println("Promedio general del curso "+ curso.calcProm());
        
        System.out.println("Cantidad de aprobados "+ curso.aprobados());
        
        System.out.println("Eliminando estudiante con la matricula a004");
        if(curso.eliminar("a004")){
            System.out.println("Estudiante eliminado con exito");
        } else {
            System.out.println("No existe estudiante con esa matricula");
        }
        
        curso.mostrarEstudiantes();
        
        System.out.println("nuevo promedio general "+ curso.calcProm());
        System.out.println("nueva lista de aprobados "+ curso.aprobados());
    }
    
}
