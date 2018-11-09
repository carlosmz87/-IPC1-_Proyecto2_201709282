/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
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
    public void IngresarEstudiante(int x){
        
    }
}
