/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author johan
 */
public class Curso {
    private String curso;
    private String docente;
    private String codigo;
    Estudiante[] estudiantes;
    private static int numcom;
    
    public Curso(String curso, String docente, String codigo, int tamaño) {
        if(tamaño < 1){
            System.out.println("Numero insuficiente de estudiantes");
            estudiantes = new Estudiante[1];
        } else {
            this.curso = curso;
            this.docente = docente;
            this.codigo = codigo;
            estudiantes = new Estudiante[tamaño];
        }
        numcom = 0;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public boolean cursoLleno(){
        return numcom == estudiantes.length;
    }
    
    public boolean cursoVacio(){
        return numcom == 0;
    }
    
    public void añadir(Estudiante estudiante){
        if(cursoLleno()){
            System.out.println("El curso esta lleno, no puede haber mas alumnos");
        } else {
            estudiantes[numcom] = estudiante;
            numcom++;
        } 
    }
    
    public int buscar(String codigo){
        for(int i = 0; i < numcom; i++){
            if(estudiantes[i].getCodigo().equalsIgnoreCase(codigo)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean eliminar(String codigo){
        int pos = buscar(codigo);
        if(pos < 0){
            return false;
        }
        for(int i = pos; i < numcom -1; i++){
            estudiantes[i] = estudiantes[i+1];
        }
        estudiantes[numcom - 1] = null;
        numcom--;
        return true;
    }
    
    public double calcProm() {
        if (cursoVacio()) {
            System.out.println("No hay estudiantes para calcular promedio.");
            return 0;
        }
        double suma = 0;
        for (int i = 0; i < numcom; i++) {
           suma += estudiantes[i].getNota();
        }
        return suma / numcom;
    }
    
    public int aprobados() {
        int count = 0;
        for (int i = 0; i < numcom; i++) {
            if (estudiantes[i].getNota() >= 6.0) {
                count++;
            }
        }
        return count;
    }
    
    public void mostrarEstudiantes() {
        if (cursoVacio()) {
            System.out.println("No hay estudiantes inscritos.");
            return;
        }
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        for (int i = 0; i < numcom; i++) {
            Estudiante e = estudiantes[i];
            System.out.println((i + 1) + ". " + e.getNombre() + " " + e.getApellidos() + 
                               " | Código: " + e.getCodigo() + 
                               " | Nota: " + e.getNota());
        }
    }
}
