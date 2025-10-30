/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wrapper;

/**
 *
 * @author johan
 */
public class Envoltorio {
    byte a = 7;
    int b = 100;
    float c = 28.9f;
    double d = 271.8;
    char e = 'M';
    
    Byte objetoByte;
    Integer objetoInteger;
    Float objetoFloat;
    Double objetoDouble;
    Character objetoChar;
    
    public void convertirToWrapped(){
       objetoByte = new Byte(a);
       objetoInteger = new Integer(b);
       objetoFloat = new Float(c);
       objetoDouble = new Double(d);
       objetoChar = e;
       
       System.out.println("Objeto Byte "+ objetoByte);
       System.out.println("Objeto Integer "+ objetoInteger);
       System.out.println("Objeto Float "+ objetoFloat);
       System.out.println("Objeto Double "+ objetoDouble);
       System.out.println("Objeto Character "+ objetoChar);
    }
    
    public void convertirToTipoPrimitivo(){
        byte tipoByte = objetoByte;
        int tipoInt = objetoInteger;
        float tipoFloat = objetoFloat;
        double tipoDouble = objetoDouble;
        char tipoChar = objetoChar;
        
        System.out.println("Tipo byte "+ tipoByte);
        System.out.println("Tipo int "+ tipoInt);
        System.out.println("Tipo float "+ tipoFloat);
        System.out.println("Tipo double "+ tipoDouble);
        System.out.println("Tipo char "+ tipoChar);
    }
    
    public void consultarChar(){
        boolean esMin = Character.isLowerCase(e);
        System.out.println("¿El caracter e = "+ e +" esta en minuscula? = "+ esMin);
        
        boolean esMay = Character.isUpperCase(e);
        System.out.println("¿El caracter e = "+ e +" esta en mayuscula? = "+ esMay);
        
        boolean esLet = Character.isLetter(e);
        System.out.println("¿El caracter e = "+ e +" esta una Letra? = "+ esLet);
        
        boolean esDig = Character.isDigit(e);
        System.out.println("¿El caracter e = "+ e +" esta un Digito? = "+ esDig);
        
        char charMin = Character.toLowerCase(e);
        System.out.println("caracter e = "+ e +" convertido a minuscula? = "+ charMin);
    }
}
