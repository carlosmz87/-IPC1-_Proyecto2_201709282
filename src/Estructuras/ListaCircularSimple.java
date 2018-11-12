/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Control.Cursos;
import Nodos.NodoCursos;

/**
 *
 * @author carlosmartinez
 */
public class ListaCircularSimple {
    NodoCursos primero;
    NodoCursos ultimo;
    
    public ListaCircularSimple(){
        primero = null;
        ultimo = null;
    }
    
    public void IngresarCurso(Cursos x){
        NodoCursos nuevo = new NodoCursos();
        nuevo.dato = x;
        if(primero == null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        }
        else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }
    
    public void MostrarCursos(){
        NodoCursos actual = new NodoCursos();
        actual = primero;
        do{
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        while(actual != primero);
    }
    
    public boolean BuscarCurso(int x){
        NodoCursos actual = new NodoCursos();
        actual = primero;
        boolean encontrado = false;
        do{
            try{
                if(actual.dato.getCurso()==x){
                    encontrado = true;
                    
                }
                //EL NODO AUXILIAR SE UBICA EN EL NODO ANTERIOR DE NO SER ENCONTRADA LA COINCIDENCIA
                actual = actual.siguiente;
             
            
            }
            catch(NullPointerException e){
                System.out.println("LA LISTA TIENE UN ESPACIO NULO");
            }
        }
        while(actual != primero);
        if(encontrado == true){
            System.out.println("EL CURSO FUE ENCONTRADO");
            return encontrado;
        }
        else{
            System.out.println("EL CURSO NO FUE ENCONTRADO");
            return encontrado;
        }
    }
    
    
    public void ModificarCurso(int c, int cat, int cred, boolean laboratorio, char sec, int [] pr, int po, boolean est){
        NodoCursos actual = new NodoCursos();
        actual=ultimo;
        boolean encontrado = false;
        do{
            try{
                if(actual.dato.getCurso()==c){
                    encontrado = true;
                    int catedratico = cat;
                    actual.dato.setCatedraticos(catedratico);
                    int creditos = cred;
                    actual.dato.setCreditos(creditos);
                    boolean lab = laboratorio;
                    actual.dato.setLab(lab);
                    char seccion = sec;
                    actual.dato.setSeccion(seccion);
                    int [] pre = pr;
                    actual.dato.setPre(pre);
                    int post = po;
                    actual.dato.setPost(0);
                    boolean estado = est;
                    actual.dato.setEstado(estado);
                    System.out.println("DATOS DEL CURSO MODIFICADOS");
                    
                }
                actual = actual.siguiente;
                
            }
            catch(NullPointerException e){
                
                System.out.println("EL CURSO NO ESTA DISPONIBLE");
            }
        }
        while(actual!=ultimo);
        
        if(encontrado==true){
            System.out.println("CURSO ENCONTRADO");
            
        }
        else{
            System.out.println("CURSO NO ENCONTRADO");
           
        }
    }
    
    //LA FUNCION ELIMINAR CURSOS ELIMINA UN CURSO SELECCIONADO POR EL NUMERO DE CURSO
    public void EliminarCursos(int c){
        //SE CREAN DOS NODOS AUXILIARES PARA RECORRER LA LISTA
        NodoCursos actual = new NodoCursos();
        NodoCursos anterior = new NodoCursos();
        //EL NODO ACTUAL SE UBICA EN EL PRIMERO DE LA LISTA
        actual=primero;
        //EL NODO ANTERIOR SE UBICA DE ULTIMO EN LA LISTA
        anterior=ultimo;
        //BANDERA BOOLEANA PARA VERIFICAR COINCIDENCIA DEL NUMERO DE CARNE
        boolean encontrado = false;
        //CICLO DO WHILE PARA RECORRER LA LISTA
        do{
            //EL TRY CATCH POR SI EN LA CARGA MASIVA DE ESTUDIANTES DEJAMOS ALGUN ESPACIO VACIO
            try{
                //VERIFICA SI ENCUENTRA COINCIDENCIA EN EL NUMERO DE CURSO
                if(actual.dato.getCurso()==c){
                    encontrado=true;
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA DE PRIMERO EN LA LISTA
                    if(actual==primero){
                        //EL PRIMER NODO APUNTARA AL SIGUIENTE
                        primero = primero.siguiente;
                        //EL ULTIMO NODO QUE APUNTABA AL SIGUIENTE AHORA APUNTA AL PRIMERO
                        ultimo.siguiente = primero;
                        System.out.println("EL CURSO FUE ELIMINADO");
                        
                    }
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA DE ULTIMO EN LA LISTA
                    else if(actual==ultimo){
                        anterior.siguiente = ultimo.siguiente;
                        ultimo = anterior;
                        System.out.println("EL CURSO FUE ELIMINADO");
                    }
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA EN MEDIO DE LA LISTA
                    else{
                        anterior.siguiente = actual.siguiente;
                        System.out.println("EL CURSO FUE ELIMINADO");
                    }
                }
                //DE NO SER ENCONTRADA LA COINCIDENCIA EL NODO ANTERIOR PASA A SER EL ACTUAL
                anterior = actual;
                //EL NODO ACTUAL PASA A SER EL NODO SIGUIENTE
                actual = actual.siguiente;
            }
            catch(NullPointerException e){
                System.out.println("EL CURSO NO ESTA DISPONIBLE");
            }
        }
        while(actual != primero);
        if(encontrado==true){
            System.out.println("ESTUDIANTE ENCONTRADO");
            
        }
        else{
            System.out.println("ESTUDIANTE NO ENCONTRADO");
        }
    }
    
    
}
