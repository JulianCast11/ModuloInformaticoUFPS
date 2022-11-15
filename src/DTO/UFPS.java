/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author RYZEN 5
 */
public class UFPS {
    public  Integer codigo;
    public  String nombre; 
    public  String apellidos;
    public double salario;

    public UFPS() {
    }

    
    
    public UFPS(String codigo, String nombre, String apellidos, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

    
}
