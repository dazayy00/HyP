/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author johan
 */
public class Ingeniero extends Persona{

    public Ingeniero(String nombre) {
        super(nombre);
    }
    
    @Override
    public int correr(){
        return 3;
    }
}
