/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author johan
 */
public class Tienda {
    private String nombre;
    private String propietario;
    private int idt;
    Computador[] computadores;
    private static int numcom;

    public Tienda(String nombre, String propietario, int idt, int tamaño) {
        if(tamaño < 1){
            System.out.println("Cantidad de comutadores insuficientes");
        } else {
            this.nombre = nombre;
            this.propietario = propietario;
            this.idt = idt;
            computadores = new Computador[tamaño];
            numcom = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public static int getNumcom() {
        return numcom;
    }

    public static void setNumcom(int numcom) {
        Tienda.numcom = numcom;
    }
    
    public boolean tiendaLlena(){
        return numcom == computadores.length;
    }
    
    public boolean tiendaVacia(){
        return numcom == 0;
    }
    
    public void añadir(Computador computador){
        if(tiendaLlena()){
            System.out.println("La tienda esta llena, no se pueden añadir elementos");
        } else {
            computadores[numcom] = computador;
            numcom++;
        }
    }
    
    public boolean eliminar(String marcaC){
        int pos = buscar(marcaC);
        if(pos < 0){
            return false;
        } 
        for(int i = pos; i < numcom; i++){
            computadores[i] = computadores[i+1];
        }
        numcom--;
        return true;
    }
    
    public int buscar(String marcaC){
        for(int i = 0; i < numcom; i++){
            if (computadores[i].getMarca().equals(marcaC)){
                return i;
            } 
        }
        return -1;
    }
    
    public void imprimir(){
        for(int i = 0; i < numcom; i++){
            System.out.println("Computador "+ i);
            System.out.println("Marca = "+ computadores[i].getMarca());
            System.out.println("Cantidad de memoria= "+ computadores[i].getCantidadM());
            System.out.println("Caracteristicas del procesador "+ computadores[i].getCaracPro());
            System.out.println("Sistema operativo "+ computadores[i].getSO());
            System.out.println("precio: "+ computadores[i].getPrecio());
        }
    }
}
