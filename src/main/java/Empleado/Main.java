/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleado;

/**
 *
 * @author johan
 */
public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Johan", "Baltazar", 10000);
        e1.nomina();
        Empleado e2 = new Empleado("Valeria", "Rivera", 8000);
        e2.nomina();
        Empleado e3 = new Empleado("Ricardo", "Baltazar", 12000);
        e3.nomina();
        Empleado e4 = new Empleado("Angelica", "Ramos", 20000);
        e4.nomina();
        
        e1.imprimir();
        e2.imprimir();
        e3.imprimir();
        e4.imprimir();
        
        Empleado.imprimirNomina();
    }
    
}
