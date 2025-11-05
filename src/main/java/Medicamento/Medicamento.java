/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicamento;

/**
 *
 * @author johan
 */
public class Medicamento {
    private String nombre;
    private String fabricante;
    private String via;
    
    Posologia posologia;

    public Medicamento(String nombre, String fabricante, String via) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.via = via;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }
    
    void setPosologia(Posologia posologia){
        this.posologia = posologia;
    }
    
    void imprimir(){
        System.out.println("Nombre del medicamento " + nombre);
        System.out.println("Fabricante del medicamento "+ fabricante);
        System.out.println("Via de administracion "+ via);
    }
    
    public class Posologia{
        private String usuarios;
        private int dosis;
        private String periodo;
        private String recomendaciones;

        public Posologia(String usuarios, int dosis, String periodo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }

        public String getUsuarios() {
            return usuarios;
        }

        public void setUsuarios(String usuarios) {
            this.usuarios = usuarios;
        }      

        public int getDosis() {
            return dosis;
        }

        public void setDosis(int dosis) {
            this.dosis = dosis;
        }

        public String getPeriodo() {
            return periodo;
        }

        public void setPeriodo(String periodo) {
            this.periodo = periodo;
        }

        public String getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(String recomendaciones) {
            this.recomendaciones = recomendaciones;
        }
    
        void imprimir(){
            System.out.println("Usuarios "+ usuarios);
            System.out.println("Dosis "+ dosis);
            System.out.println("periodo "+ periodo);
            System.out.println("Recomendaciones "+ recomendaciones);
        }
    }

}
