/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Estructuras.ListaCircularDoble;
import Estructuras.ListaCircularSimple;

/**
 *
 * @author carlosmartinez
 */
public class Driver {
    public static ListaCircularDoble ListaEstudiantes;
    public static ListaCircularSimple ListaCursos;
    public static Estudiantes [] estudiante;
    public static Cursos [] curso;
    public static void main(String [] args){
        /*CargarEstudiantes c1 = new CargarEstudiantes();
        estudiante=c1.CargaEstudiantes();
        ListaEstudiantes = new ListaCircularDoble();
        for(int i=0; i<estudiante.length; i++){
            ListaEstudiantes.IngresarEstudiante(estudiante[i]);
        } 
        Estudiantes estudiante1 = new Estudiantes(1, 2, 3, 4, "dato1", "dato2", "dato3");
        Estudiantes estudiante2 = new Estudiantes(12, 2, 3, 4, "dato1", "dato2", "dato3");
        Estudiantes estudiante3 = new Estudiantes(1, 2, 3, 4, "dato1", "dato2", "dato3");
        ListaEstudiantes.IngresarEstudiante(estudiante1);
        ListaEstudiantes.IngresarEstudiante(estudiante2);
        ListaEstudiantes.IngresarEstudiante(estudiante3);
        ListaEstudiantes.Mostrar();
        ListaEstudiantes.BuscarEstudiante(12);
        ListaEstudiantes.ModificarEstudiante(12);
        ListaEstudiantes.MostrarEstudiantes();
        ListaEstudiantes.EliminarEstudiantes(12);
        ListaEstudiantes.Mostrar();*/
        
        ListaCursos = new ListaCircularSimple();
        
        CargarCursos c2 = new CargarCursos();
        curso=c2.CargaCursos();
        
        for(int i=0; i<curso.length; i++){
            ListaCursos.IngresarCurso(curso[i]);
        }
        int[] pre={2,3,4};
        Cursos curso1 = new Cursos(2,2,2,false,'b',pre,5,true);
        ListaCursos.IngresarCurso(curso1);
        ListaCursos.MostrarCursos();
        ListaCursos.BuscarCurso(3);
        ListaCursos.ModificarCurso(2);
        ListaCursos.MostrarCursos();
        ListaCursos.EliminarCursos(2);
        ListaCursos.MostrarCursos();
    
    }
    
}
