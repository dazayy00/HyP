/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Wrapper;

/**
 *
 * @author johan
 */
public class Main {
    public static void main(String[] args) {
        EnvoltorioTeclado wrapper = new EnvoltorioTeclado();
        /*Envoltorio wrapper = new Envoltorio();*/
        wrapper.convertirToWrapped();
        wrapper.convertirToTipoPrimitivo();
        wrapper.consultarChar();
    }
    
}
