/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

/**
 *
 * @author johan
 */
public class Paquete {
    private Persona remitente;
    private Persona destinatario;
    private int tipo;
    private int contenido;
    private int peso;

    public Paquete(Persona remitente, Persona destinatario, int tipo, int contenido, int peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipo = tipo;
        this.contenido = contenido;
        this.peso = peso;
    }
    
    public int calcularPrecio(){
        int precio = 0;
        
        if(tipo == 1){
            System.out.println("El envio es nacional");
            
            if(contenido == 1){
                System.out.println("contenido es un documento");
                if(peso < 2){
                    precio = peso * 2000;
                } else {
                    precio = peso * 3000;
                }
            } else if(contenido == 2) {
                System.out.println("contenido es mercancia");
                if(peso < 5){
                    precio = peso * 5000;
                } else {
                    precio = peso * 7000;
                }
            }
        } else if (tipo == 2){
            System.out.println("El envio es internacional");
            if(contenido == 1){
                System.out.println("contenido es un documento");
                if(peso < 2){
                    precio = peso * 10000;
                } else {
                    precio = peso * 15000;
                }
            } else if(contenido == 2) {
                System.out.println("contenido es mercancia");
                if(peso < 5){
                    precio = peso * 12000;
                } else {
                    precio = peso * 20000;
                }
            }
        } else {
            System.out.println("Tipo de envio inexistente");
        }
        return precio;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    void imprimir(){
        System.out.println("=====DETALLES DEL ENVIO=====");
        System.out.println("El tipo de paquete es: "+ tipo);
        System.out.println("El contenido del paquete es: "+ contenido);
        System.out.println("El peso del paquete es: "+ peso + " kg");
        System.out.println("REMITENTE");
        remitente.imprimir();
        System.out.println("DESTINATARIO");
        destinatario.imprimir();
        System.out.println("Costo del envio");
        System.out.println("El costo del envio es de "+ calcularPrecio());
        System.out.println("============================");
    }
    
    public static class Persona{
        private String nombre;
        private String apellidos;
        private int dni;
        private String direccion;
        private int telefono;

        public Persona(String nombre, String apellidos, int dni, String direccion, int telefono) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        
        void imprimir(){
            System.out.println("nombre: "+ nombre + " " +apellidos);
            System.out.println("DNI: "+ dni);
            System.out.println("direccion: "+ direccion);
            System.out.println("telefono: "+ telefono);
        }
    }
}
