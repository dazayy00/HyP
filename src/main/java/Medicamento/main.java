/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Medicamento;

import Medicamento.Medicamento.Posologia;

/**
 *
 * @author johan
 */
public class main {

    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "oral");
        
        Posologia posologia = medicamento.new Posologia("Adultos y mayores de 16 años", 500, "6 horas", "No debe de tomarse este medicamento con el estomago vacio");
        medicamento.setPosologia(posologia);
        medicamento.imprimir();
        
        medicamento.posologia.imprimir();
    }
    
}
