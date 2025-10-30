/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author johan
 */
public class Empleado {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String apellidos;
    private double salariom;
    private static double nomina;

    public Empleado(String nombre, String apellidos, double salariom) {
        contador++;
        id = contador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salariom = salariom;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSalariom() {
        return salariom;
    }
    
    
    public void imprimir(){
        System.out.println("Id del empleado "+ id);
        System.out.println("Nombre del empleado " + nombre);
        System.out.println("Apellidos del empleado "+ apellidos);
        System.out.println("Salario Mensual del empleado "+ salariom);
        System.out.println();
    }
    
    public void nomina(){
        nomina = nomina + salariom;
    }
    
    public static void imprimirNomina(){
        System.out.println("La nomina general de la empresa este mes fue de " + nomina);
    }
}
