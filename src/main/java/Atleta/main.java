/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atleta;

/**
 *
 * @author johan
 */
public class main {

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Alejandro perlaza", 9.55);
        atleta1.correr400metros();
        Atleta atleta2 = new Atleta("Jose Sanchez", 9.28);
        atleta2.correr400metros();
        Atleta atleta3 = new Atleta("Diego palomares", 9.53);
        atleta3.correr400metros();
        Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);
        atleta4.correr400metros();
        Atleta.imprimirSeleccion();
        atleta1.imprimir();
        atleta2.imprimir();
        atleta3.imprimir();
        atleta4.imprimir();
        Atleta.imprimirTiempoEquipo();
    }
    
}
