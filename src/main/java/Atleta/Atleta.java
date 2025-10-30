/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atleta;

/**
 *
 * @author johan
 */
public class Atleta {
    static int contador = 0;
    int identificador;
    String nombre;
    double tiempo;
    static String seleccion= "Colombia";
    static double tiempoEquipo;
    
    public Atleta(String nombre, double tiempo){
        contador++;
        identificador = contador;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public void correr400metros(){
        tiempoEquipo = tiempoEquipo + tiempo;
    }
    
    public void imprimir(){
        System.out.println("Id del atleta " + identificador);
        System.out.println("Nombre del atleta "+ nombre);
        System.out.println("Tiempo del atleta "+ tiempo);
        System.out.println();
    }
    
    public static void imprimirSeleccion(){
        System.out.println("Seleccion "+ seleccion);
    }
    
    public static void imprimirTiempoEquipo(){
        System.out.println("Tiempo de equipo = " + tiempoEquipo + " segundos");
    }
}
