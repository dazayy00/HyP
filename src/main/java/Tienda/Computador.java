/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author johan
 */
public class Computador {
    private String marca;
    private int cantidadM;
    private String caracPro;
    private String SO;
    private double precio;

    public Computador(String marca, int cantidadM, String caracPro, String SO, double precio) {
        this.marca = marca;
        this.cantidadM = cantidadM;
        this.caracPro = caracPro;
        this.SO = SO;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadM() {
        return cantidadM;
    }

    public void setCantidadM(int cantidadM) {
        this.cantidadM = cantidadM;
    }

    public String getCaracPro() {
        return caracPro;
    }

    public void setCaracPro(String caracPro) {
        this.caracPro = caracPro;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
}
