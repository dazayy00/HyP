/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cadena;

/**
 *
 * @author johan
 */
public class Cadena {

    private String CadenaInicial = "Programacion Orientada a Objetos";
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        
        int longitud = cadena.CadenaInicial.length();
        
        System.out.println("La longitud del String es "+ longitud);
        
        String cadenaSinEspacios = cadena.CadenaInicial.trim();
        System.out.println("El string sin espacios es "+ cadenaSinEspacios);
        
        String cadenaM = cadenaSinEspacios.toUpperCase();
        System.out.println("El string en mayusculas "+ cadenaM);
        
        String cadenaC = cadenaM.concat("12345");
        System.out.println("El string concatenado" + cadenaC);
        
        String cadenaE = cadenaC.substring(24,31);
        System.out.println("El string extraido "+ cadenaE);
        
        String cadenaR = cadenaE.replace("O", "X");
        System.out.println("El string reemplazado "+ cadenaR);
        
        boolean comparacion = cadenaR.equals("Programacion");
        System.out.println("Los strings son iguales "+ comparacion);
    }
    
}
