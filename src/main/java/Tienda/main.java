/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda cuantica", "Pepito peres", 123456, 5);
        
        Computador computador1 = new Computador("Acer", 50, "Intel icore 7", "windows", 18500);
        Computador computador2 = new Computador("Toshiba", 80, "Intel icore 5", "windows", 15500);
        Computador computador3 = new Computador("Mac", 100, "Amd Ryzen 7 5000 seies", "Mac", 24500);
        
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese en computador a buscar");
        String marca = sc.next();
        
        System.out.println("El computador a buscar "+ marca + " se encuentra en la posicion "+ tienda.buscar(marca));
        
        tienda.imprimir();
    }
    
}
