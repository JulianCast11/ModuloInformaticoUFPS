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
public class Administrativos extends UFPS {
   
    double añoIngreso;
    

    public Administrativos() {

    }

    public Administrativos(double añoIngreso) {
        super();
        this.añoIngreso = añoIngreso;
    }

    
    public double calcularAntiguedad(){
    double calcular;
    calcular=añoIngreso-2022; 
    return calcular;
    }
    

    public double getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(double añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

}

