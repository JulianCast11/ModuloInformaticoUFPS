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
public class Carrera
{
    private String codigo;
    private String nombre;
    private int creditosCarrera;
    
    public Carrera(){
    }
    
    public Carrera(String codigo, String nombre, int creditosCarrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditosCarrera = creditosCarrera;
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

    public int getCreditosCarrera() {
        return creditosCarrera;
    }

    public void setCreditos(int creditosCarrera) {
        this.creditosCarrera = creditosCarrera;
    }
}
