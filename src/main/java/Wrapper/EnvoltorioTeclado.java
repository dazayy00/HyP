/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wrapper;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EnvoltorioTeclado {
    byte a;
    int b;
    float c;
    double d;
    char e;
    boolean f;
    
    Byte objetoByte;
    Integer objetoInteger;
    Float objetoFloat;
    Double objetoDouble;
    Character objetoChar;
    Boolean objetoBoolean;
    
    EnvoltorioTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un tipo de dato byte = ");
        a = sc.nextByte();
        System.out.println("Ingresa un tipo de dato int = ");
        b = sc.nextInt();
        System.out.println("Ingresa un tipo de dato float = ");
        c = sc.nextFloat();
        System.out.println("Ingresa un tipo de dato double = ");
        d = sc.nextDouble();
        System.out.println("Ingresa un tipo de dato char = ");
        e = sc.next().charAt(0);
        System.out.println("Ingresa un tipo de dato boolean = ");
        f = sc.nextBoolean();
    }
    
    public void convertirToWrapped(){
       objetoByte = new Byte(a);
       objetoInteger = new Integer(b);
       objetoFloat = new Float(c);
       objetoDouble = new Double(d);
       objetoChar= new Character(e);
       objetoBoolean  = new Boolean(f);
       
       System.out.println("Objeto Byte "+ objetoByte);
       System.out.println("Objeto Integer "+ objetoInteger);
       System.out.println("Objeto Float "+ objetoFloat);
       System.out.println("Objeto Double "+ objetoDouble);
       System.out.println("Objeto Character "+ objetoChar);
       System.out.println("Objeto Boolean "+ objetoBoolean);
    }
    
    public void convertirToTipoPrimitivo(){
        byte tipoByte = objetoByte;
        int tipoInt = objetoInteger;
        float tipoFloat = objetoFloat;
        double tipoDouble = objetoDouble;
        char tipoChar = objetoChar;
        boolean tipoBoolean = objetoBoolean;
        
        System.out.println("Tipo byte "+ tipoByte);
        System.out.println("Tipo int "+ tipoInt);
        System.out.println("Tipo float "+ tipoFloat);
        System.out.println("Tipo double "+ tipoDouble);
        System.out.println("Tipo char "+ tipoChar);
        System.out.println("Tipo boolean "+ tipoBoolean);
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
