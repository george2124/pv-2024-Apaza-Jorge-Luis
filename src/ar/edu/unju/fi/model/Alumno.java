/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unju.fi.model;

import java.util.Date;

/**
 *
 * @author 54381
 */
public class Alumno {

    private String lu;
    private Integer dni;
    private String nombre;
    private String carrera;
    private Date fechaNacimiento;
    private Date fechaIngreso;

    //constructor por defecto
    public Alumno(){
        
    }
    
    public Alumno(String lu, Integer dni, String nombre){
        this.lu = lu;
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public Alumno(String lu, Integer dni, String nombre, String carrera ,Date fechaNacimiento){
        this.lu = lu;
        this.dni = dni;
        this.carrera = carrera;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.fechaIngreso = new Date();
    }
     
    //metodo toString
    @Override
    public String toString(){
        
        return "Alumno: "+" "+ this.nombre +" "+ "DNI: "+" "+ this.dni +" "+ "LU: "+ this.lu+" "+"Carrera: "+" "+this.carrera+" "+"Fecha Nacimiento: "+" "+this.fechaNacimiento;
    }
    
    /**
     * @return the LU
     */
    public String getLu() {
        return lu;
    }

    /**
     * @param lu the LU to set
     */
    public void setLu(String lu) {
        this.lu = lu;
    }

    /**
     * @return the DNI
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the DNI to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the fechaingreso
     */
    public Date getFechaingreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaingreso the fechaingreso to set
     */
    public void setFechaingreso(Date fechaingreso) {
        this.fechaIngreso = fechaingreso;
    }

}
