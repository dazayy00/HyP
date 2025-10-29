/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persona;

import java.util.*;

/**
 *
 * @author johan
 */
public class Principal {
    public static void main(String[] args) {
        
        Persona i1 = new Ingeniero("Pedro");
        Persona d1 = new Deportista("Valeria");
        Persona i2 = new Ingeniero("Johan");
        Persona d2 = new Deportista("David");
        Persona i3 = new Ingeniero("Jose");
        Persona d3 = new Deportista("Susana");
        
        List<Persona> lista = Arrays.asList(i1, d1,i2, d2,i3,   d3);
        
        OptionalDouble resultado = calcularMediaVelocidad(lista);
        if(resultado.isPresent()) {
            System.out.println(resultado.getAsDouble());
        }
        
        /*
        segunda forma
        double resultado = calcularMediaVelocidad(lista);
        
        System.out.println(resultado);
        
        primera forma
        Ingeniero i = new Ingeniero("Pedro ");
        Deportista d = new Deportista("Julian");
        
        System.out.println(i.getNombre() + " Corrio " + i.correr() + " Kilometros");
        System.out.println(d.getNombre()+ " Corrio " + d.correr() + " Kilometros");
        */
    }
    /*
    segunda forma
    public static double calcularMediaVelocidad(List<Persona> lista){
        double total = 0;
        int contador = 0;
        
        for(Persona p : lista){
            total = total + p.correr();
            contador++;
        }
        
        if(contador > 0) {
            return total / contador;
        } else {
            return 0;
        }
    }
    */
    
    public static OptionalDouble calcularMediaVelocidad(List<Persona> lista) {
        return lista.stream().mapToDouble(Persona::correr).average();
    }
}
