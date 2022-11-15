/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RYZEN 5
 */
public class RegistrarAdministrativo {
    
    public static void registrar(Connection cn, DTO.Administrativo a) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into alumno(idAlumno,nombre,apellido,email,genero) Values(?,?,?,?,?)");
            consulta.setInt(1, a.getIdAlumno());
            consulta.setString(2, a.getNombre());
            consulta.setString(3, a.getApellido());
            consulta.setString(4, a.getEmail());
            consulta.setString(5, a.getGenero());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Administrativo buscar(Connection cn,Integer codigo) throws SQLException{
        Administrativo a =new Administrativo();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select nombreA as name , apellidoA as ape , salarioA as ema , añoingreso as gen from administrativo where codigoA='"+codigoA+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                a.setNombre(rs.getString("name"));
                a.setApellido(rs.getString("ape"));
                a.setEmail(rs.getString("ema"));
                a.setGenero(rs.getString("gen"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return a;
    }
    
    public static void actualizar(Connection cn,Integer codigoA,String nombreA,String apellido ,String email,String genero) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE administrativo set nombreA='"+nombreA+"' , apellidoA='"+apellidoA+"' ,salarioA='"+salarioA+"',genero='"+genero+"' where idAlumno='"+idAlumno+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,Integer idAlumno) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from alumno where idAlumno='"+idAlumno+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}



