/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloinformaticoufps;

import javax.swing.JOptionPane;

/**
 *
 * @author RYZEN 5
 */

public class Docentes extends UFPS {
    // instance variables - replace the example below with your own
  
    public String profesion;
    public float estatura;
    public float peso;

    /**
     * Constructor for objects of class Docentes
     */
    public Docentes()
    {

    }

    public Docentes a(String profesion, float estatura, float peso) {
        
        this.profesion = profesion;
        this.estatura = estatura;
        this.peso = peso;
        return null;
    }
    
    public double imc(){
    return peso/(estatura*estatura);
    }
    
    public String comCorp(){
    String comCorp="";
    if(imc()<18.5){
        comCorp="Peso inferior al normal";
    }else if((imc()<=18.5)||(imc()<=24.9)){
        comCorp="Peso normal";
    }else if((imc()<=25.0)||(imc()<=29.9)){
        comCorp="Peso superior al normal";
    }else if(imc()>30.0){
        comCorp="Obesidad";
    }else{
        comCorp="No existe clasificacion";}
    return comCorp;
}
    
    /*public String mostrarDatos() {
        return "{" + codigo + ", "+ nombre + ", " + apellidos + ", " + profesion + ", " + salario +  ", " + estatura + ", " + peso + '}';
    }*/
    public String mostrarDatos(){
    return
    "\n codigo: "+codigo
    +"\n nombre: "+nombre
    +"\n apellidos: "+apellidos
    +"\n profesion: "+profesion
    +"\n salario: "+salario
    +"\n estatura: "+estatura
    +"\n peso: "+peso
    +"\n IMC obtenido es: "+imc()
    +"\n Clasificacion obtenida es: "+comCorp();
    
    
}
   
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    Object a(String codigo, String nombre, String apellidos, String profesion, double estatura, double peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

