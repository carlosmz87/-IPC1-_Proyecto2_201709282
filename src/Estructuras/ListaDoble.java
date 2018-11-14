/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Control.Semestres;
import Nodos.NodoSemestres;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosmartinez
 */
public class ListaDoble {
    NodoSemestres primero;
    NodoSemestres ultimo;
    public ListaDoble(){
        primero=null;
        ultimo=null;
    }
    public void IngresarSemestre(Semestres x){
        NodoSemestres nuevo = new NodoSemestres();
        nuevo.dato=x;
        boolean apro= nuevo.dato.isEstado();
        boolean asig= nuevo.dato.isAsignado();
        if((apro == false )&&(asig==false)){
            nuevo.dato.setAsignado(true);
            if(primero==null){
                primero=nuevo;
                primero.siguiente=null;
                primero.anterior=null;
                ultimo = primero;
            }
            else{
                ultimo.siguiente=nuevo;
                nuevo.anterior=ultimo;
                nuevo.siguiente=null;
            }
        }
        else if(asig==true){
            JOptionPane.showMessageDialog(null, " EL CURSO YA FUE ASIGNADO ");
        }
    }
    
    public void MostrarSemestres(){
        NodoSemestres actual = new NodoSemestres();
        actual=ultimo;
        while(actual!=null){
            System.out.println(actual.dato);
            actual = actual.anterior;
        }
    }
    
    public void BuscarSemestre(int x){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            if(actual.dato.getNumero()== x){
                encontrado = true;
                System.out.println("SEMESTRE EXISTENTE");
            }
            actual = actual.siguiente;
        }
    
    }
    
    public void DesignarCurso(int numero, boolean asignado){
        NodoSemestres actual = new NodoSemestres();
        actual = ultimo;
        boolean encontrado= false;
        while(actual !=null){
            if((actual.dato.getNumero()==numero)&&(actual.dato.isAsignado()==true)){
                actual.dato.setAsignado(false);
                System.out.println("HAS DESASIGNADO UN CURSO");
            }
            actual = actual.anterior;
        }
    }
    
    public void EliminarSemestre(int numero, int curso, boolean asignado){
        NodoSemestres actual = new NodoSemestres();
        NodoSemestres atras = new NodoSemestres();
        actual = primero;
        atras = null;
        while(actual != null){
            if((actual.dato.getNumero()==numero)&&(actual.dato.getCurso()==curso)&&(actual.dato.isAsignado()==true)){
                
                if(actual==primero){
                    primero = primero.siguiente;
                    primero.anterior=null;
                }
                else{
                    atras.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
            }
            atras = actual;
            actual = actual.siguiente;
        }
    }
    
    
}
