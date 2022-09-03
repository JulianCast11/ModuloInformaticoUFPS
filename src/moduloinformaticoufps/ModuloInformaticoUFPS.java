/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloinformaticoufps;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RYZEN 5
 */
public class ModuloInformaticoUFPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiantes estudiante = new Estudiantes();
        Administrativos administrativos = new Administrativos();
        Docentes docentes = new Docentes();
        UFPS ufps = new UFPS();
       
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
       
 
            System.out.println("1. Calcular IMC de los docentes");
            System.out.println("2. Saber si los estudiantes pueden matricular Proyecto de grado");
            System.out.println("3. Calcular la angitgüedad de los administrativos");
            System.out.println("4. Actualizar salarios de los empleados de la organización");           
            System.out.println("5. Salir");

 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        
                        String error;
                        
                        
                        System.out.println("Digite el codigo del docente");
                        error=sn.nextLine();
                        
                        System.out.println("Digite el codigo del docente");
                        docentes.codigo=sn.nextLine();
                        docentes.setCodigo(docentes.codigo);
                        
                        System.out.println("Digite el nombre del docente");
                        docentes.nombre=sn.nextLine();
                        docentes.setNombre(docentes.nombre);
                        
                        System.out.println("Digite los apellidos del docente");
                        docentes.apellidos=sn.nextLine();
                        docentes.setApellidos(docentes.apellidos);
                        
                        System.out.println("Digite la profesion del docente");
                        docentes.profesion=sn.nextLine();
                        docentes.setProfesion(docentes.profesion);
                        
                        System.out.println("Digite los salario del docente");
                        docentes.salario=sn.nextDouble();
                        docentes.setSalario(docentes.salario);
                        
                        System.out.println("Digite los peso del docente");
                        docentes.peso=sn.nextFloat();
                        docentes.setPeso(docentes.peso);
                        
                        System.out.println("Digite los altura del docente");
                        docentes.estatura=sn.nextFloat();
                        docentes.setEstatura(docentes.estatura);
                        
                        System.out.println(docentes.comCorp());
                        
                        
                       /* docentes.setCodigo("1152094");
                        docentes.setNombre("Julian");
                        docentes.setApellidos("Castaño Arévalo");
                        docentes.setProfesion("Ingeniero");
                        docentes.setSalario(3000000);
                        docentes.setPeso(60);
                        docentes.setEstatura((float) 1.70);
                       
                        docentes.codigo=JOptionPane.showInputDialog("codigo: ");
                        docentes.nombre=JOptionPane.showInputDialog("nombre: ");
                        docentes.apellidos=JOptionPane.showInputDialog("apellidos: ");
                        docentes.profesion=JOptionPane.showInputDialog("profesion: ");
                        docentes.salario=Double.parseDouble(JOptionPane.showInputDialog("salario: "));
                        docentes.estatura=Double.parseDouble(JOptionPane.showInputDialog("estatura: "));
                        docentes.peso=Double.parseDouble(JOptionPane.showInputDialog("peso: "));
                        docentes.a(docentes.codigo,docentes.nombre,docentes.apellidos,docentes.profesion,docentes.estatura,docentes.peso);
                        docentes.verDatos();
                            */
                      
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        
                        System.out.println("Digite el codigo del estudiante");
                        error=sn.nextLine();
                        
                        System.out.println("Digite el codigo del estudiante");
                        estudiante.codigo=sn.nextLine();
                        estudiante.setCodigo(estudiante.codigo);
                        
                        System.out.println("Digite el nombre del estudiante");
                        estudiante.nombre=sn.nextLine();
                        estudiante.setNombre(estudiante.nombre);
                        
                        System.out.println("Digite los apellidos del estudiante");
                        estudiante.apellidos=sn.nextLine();
                        estudiante.setApellidos(estudiante.apellidos);
                        
                        System.out.println("Digite la carrera del estudiante");
                        estudiante.carrera=sn.nextLine();
                        estudiante.setCarrera(estudiante.carrera);
                                     
                        System.out.println("Digite el semestre que cursa el estudiante");
                        estudiante.semestre=sn.nextInt();
                        estudiante.setSemestre(estudiante.semestre);
                        
                        System.out.println("Digite los credirtos cursados del estudiante");
                        estudiante.creditosCursados=sn.nextInt();
                        estudiante.setCreditos(estudiante.creditosCursados);
                        
                        System.out.println(estudiante.matricularProyectoGrado());
                        break;
                        
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        
                        System.out.println("Digite el codigo del administrativo");
                        error=sn.nextLine();
                        
                        System.out.println("Digite el codigo del administrativo");
                        administrativos.codigo=sn.nextLine();
                        administrativos.setCodigo(administrativos.codigo);
                        
                        System.out.println("Digite el Nombre del administrativo");
                        administrativos.nombre=sn.nextLine();
                        administrativos.setNombre(administrativos.nombre);
                        
                        System.out.println("Digite la profesion del administrativo");
                        administrativos.apellidos=sn.nextLine();
                        administrativos.setApellidos(administrativos.apellidos);
                        
                        System.out.println("Digite los salario del docente");
                        administrativos.salario=sn.nextDouble();
                        administrativos.setSalario(administrativos.salario);
                        
                        System.out.println("Digite el año en el que ingresó el administrativo administrativo");
                        administrativos.añoIngreso=sn.nextDouble();
                        administrativos.setAñoIngreso(administrativos.añoIngreso);
                        
                        System.out.println(administrativos.calcularAntiguedad());
                        break;
                        
                    case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    
                    System.out.println("Este es el salario del empleado de la organización: "+ufps.getSalario());
                    double nuevoSalario=ufps.getSalario();   double act;
                    
                    System.out.println("Digite el nuevo salario del administrativo");
                        act=sn.nextDouble();
                        nuevoSalario=nuevoSalario+act;
                        ufps.setSalario(nuevoSalario);
                        
                        
                    System.out.println("Este es el salario del empleado de la organización: "+ufps.getSalario());    
                        System.out.println(administrativos.calcularAntiguedad());
                    
                    break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    private static void nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    }
    

