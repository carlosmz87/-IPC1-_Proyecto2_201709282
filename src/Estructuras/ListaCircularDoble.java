/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import Control.Estudiantes;
import Nodos.NodoEstudiantes;

/**
 *
 * @author carlosmartinez
 */
//LA CLASE LISTACIRCULARDOBLE CREA UNA LISTA DE ESTUDIANTES
public class ListaCircularDoble {
    //CREAMOS DOS VARIABLES DE TIPO NODOESTUDIANTES QUE APUNTAN AL PRIMERO Y ULTIMO DE LA LISTA
    NodoEstudiantes primero;
    NodoEstudiantes ultimo;
    
    //CONTRURCTOR: CREA LA LISTA Y APUNTA EL PRIMER DATO A NULL Y EL ULTIMO A NULL
    public ListaCircularDoble(){
        primero = null;
        ultimo = null;
    }
    
    //CREA UN NUEVO ESTUDIANTE Y LO INGRESA EN LA LISTA
    public void IngresarEstudiante(Estudiantes x){
        //CREAMOS UN NUEVO NODO
        NodoEstudiantes nuevo = new NodoEstudiantes();
        
        nuevo.dato = x;
        
        //SI EL PRIMER DATO APUNTA A NULO
        if(primero == null){
            //EL APUNTADOR PRIMERO APUNTA AL NUEVO ESTUDIANTE
            primero = nuevo;
            //EL APUNTADOR SIGUIENTE DEL NUEVO NODO APUNTA AL PRIMERO DEL NUEVO NODO
            primero.siguiente = primero;
            //EL APUNTADOR ANTERIOR DEL NUEVO NODO APUNTA A ULTIMO
            nuevo.anterior = ultimo;
            //EL APUNTADOR ULTIMO APUNTA AL NUEVO NODO 
            ultimo = nuevo;
        }
        
        //SI LA LISTA NO ESTA VACIA
        else{
            //EL APUNTADOR ULTIMO DE LA LISTA APUNTA COMO SIGUIENTE AL NUEVO NODO
            ultimo.siguiente = nuevo;
            //EL APUNTADOR SIGUIENTE DEL NUEVO NODO APUNTA AL PRIMERO DE LA LISTA
            nuevo.siguiente = primero;
            //EL APUNTADOR ANTERIOR DEL NUEVO NODO APUNTA AL ULTIMO
            nuevo.anterior = ultimo;
            //EL APUNTADOR ULTIMO APUNTA AL NUEVO NODO
            ultimo = nuevo;
            //EL APUNTADOR ANTERIOR APUNTA AL ULTIMO DE LA LISTA
            primero.anterior = ultimo;
        }
    }
    
    //LA FUNCION MOSTRAR DESPLOEGO LOS ESTUDIANTES ALMACENADOS
    public void Mostrar(){
        //SE CREA EL NUEVO NODO AUXILIAR
        NodoEstudiantes actual = new NodoEstudiantes();
        //EL NODO ACTUAL APUNTA AL PRIMERO DE LA LISTA
        actual = primero;
        //SE CREA EL CICLO DO WHILE
        do{
            //IMPRIME LOS DATOS DEL ESTUDIANTE
            System.out.println(actual.dato);
            //ACTUAL PASA AL SIGUIENTE NODO
            actual = actual.siguiente;
        }
        //MIENTRAS NO APUNTE AL PRIMER ESTUDIANTE SE REALIZA EL CICLO DO WHILE
        while(actual != primero);
        
    }
    
    
    
}
