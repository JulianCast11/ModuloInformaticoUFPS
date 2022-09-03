/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloinformaticoufps;

/**
 *
 * @author RYZEN 5
 */
public class Estudiantes
{
    String codigo;
    String nombre;
    String apellidos;
    String carrera;
    int semestre;
    int creditosCursados;
    
    private Carrera ca;
    
    public Estudiantes(){
        ca=new Carrera();
    }

    public Estudiantes(String codigo, String nombre, String apellidos, String carrera, int semestre, int creditosCursados) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditosCursados = creditosCursados;
    }
    private int creditos;
    public double calcularCreditos(){
        
        creditos=(creditosCursados*ca.getCreditosCarrera())/100;
        return creditos;
    }
    
    public String matricularProyectoGrado(){
    String matricula="";
        if(creditos>90){
        matricula="Ya puedes matricular Proyecto de Grado";
    }else{
        matricula="No puedes matricular, aún no cumples con el 90% de creditos de la carrera";
    } 
    return matricula;}     
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditosCursados() {
        return creditosCursados;
    }

    public void setCreditos(int creditosCursados) {
        this.creditosCursados = creditosCursados;
    }
}
