/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paqueteria;

import Paqueteria.Paquete.Persona;

/**
 *
 * @author johan
 */
public class main {
    public static void main(String[] args) {
        
        Persona personaRemitente = new Persona("Johan", "Baltazar", 568941, "los alamos sn col.huizaxtla", 45788);
        Persona personaDestinatario = new Persona("Valeria", "Rivera", 56124, "No me la se", 48845);
        
        Paquete paquete = new Paquete(personaRemitente, personaDestinatario, 1, 2, 7);
        
        paquete.imprimir();
    }
}
