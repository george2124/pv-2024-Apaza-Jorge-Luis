/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.edu.unju.fi.tp4b;

import ar.edu.unju.fi.services.AlumnoService;
import java.util.List;
import ar.edu.unju.fi.model.Alumno;

/**
 *
 * @author 54381
 */
public class Tp4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService service = new AlumnoService();
        List<Alumno> lista =  service.crearLista();
        
        service.agregar(lista);
        service.mostrarAlumno(lista);
        service.buscar(lista);
        service.contador(lista);
    }
    
}
