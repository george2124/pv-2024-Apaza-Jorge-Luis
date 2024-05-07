/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unju.fi.services;

import java.util.List;
import ar.edu.unju.fi.model.Alumno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author 54381
 */
public class AlumnoService {
    public List<Alumno> crearLista(){
        Date fecha= new Date();
        Alumno alumno1= new Alumno("MOS20231", 23454545, "jose segundo", "ing. mecanica", fecha);
        Alumno alumno2= new Alumno("MOS20232", 23232490, "jose lopez", "ing. informatica", fecha);
        Alumno alumno3= new Alumno("MOS20233", 55454500, "mauro garcia", "ing. agronomica", fecha);
        Alumno alumno4= new Alumno("MOS20234", 24454510, "pablo segundo", "ing. minas", fecha);
        Alumno alumno5= new Alumno("MOS20235", 28454500, "miguel castro", "tecnicatura en minas", fecha);
        Alumno alumno6= new Alumno("MOS20241", 29454760, "maria camacho", "ing. mecatronico", fecha);
        Alumno alumno7= new Alumno("MOS20242", 32454555, "josefina del valle", "Analista programador universitario", fecha);
        Alumno alumno8= new Alumno("MOS20243", 43564545, "sergio ortiz", "ing. mecanica", fecha);
        Alumno alumno9= new Alumno("MOS20244", 33454321, "martina lamas", "ing. quimica", fecha);
        Alumno alumno10= new Alumno("MOS20245", 23445475, "macarena lamas", "ing. suelos", fecha);
        
        List<Alumno> mostrar= new ArrayList<>();
        mostrar.add(alumno1);
        mostrar.add(alumno2);
        mostrar.add(alumno3);
        mostrar.add(alumno4);
        mostrar.add(alumno5);
        mostrar.add(alumno6);
        mostrar.add(alumno7);
        mostrar.add(alumno8);
        mostrar.add(alumno9);
        mostrar.add(alumno10);
        
        return mostrar;
    }
    
    public void agregar(List<Alumno> lista){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese lu: ");
        String lu = teclado.nextLine();
        System.out.println("Ingrese dni: ");
        Integer dni = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese carrera: ");
        String carrera = teclado.nextLine();
        System.out.println("Ingrese fecha Nacimiento: ");
        String fechaTeclado = teclado.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date fechaNacimiento = sdf.parse(fechaTeclado);
            Alumno alumno= new Alumno(lu, dni, nombre, carrera, fechaNacimiento);
            lista.add(alumno);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        
    }
    public void mostrarAlumno(List<Alumno> listaMuestra){
       
        for(Alumno alumno: listaMuestra){
            
            System.out.println(alumno.toString());
        }
    }
      public void buscar(List<Alumno> buscarLista){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el LU para buscar: ");
        String lu = teclado.nextLine();
          for(Alumno alumno: buscarLista){
              if(alumno.getLu().equals(lu)){
                  System.out.println(alumno.toString());
              }
          }
      }
      
      
      public void buscar(List<Alumno> buscarLista, String lu){
          for(Alumno alumno: buscarLista){
              if(alumno.getLu().equals(lu)){
                  System.out.println(alumno.toString());
              }
              else{
                  System.out.println("El alumno no se encuentro");
              }
                  
          }
      }
      
      public void contador(List<Alumno> contarLista){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el año para buscar: ");
        int anio = teclado.nextInt();
        int cont=0;
          for(Alumno alumno: contarLista){
              if(alumno.getFechaingreso().getYear()== anio){
                  cont++;
              }
          }
          System.out.println(cont);
      }
}

        
  