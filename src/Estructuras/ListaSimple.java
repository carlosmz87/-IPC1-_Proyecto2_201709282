/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Control.Catedraticos;
import Nodos.NodoCatedraticos;

/**
 *
 * @author carlosmartinez
 */
public class ListaSimple {
    NodoCatedraticos primero;
    NodoCatedraticos ultimo;
    
    public ListaSimple(){
        primero = null;
        ultimo = null;
    }
    
    public void IngresarCatedratico(Catedraticos x){
        NodoCatedraticos nuevo = new NodoCatedraticos();
        nuevo.dato = x;
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = primero;
        }
        else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    
    }
    
    public void MostrarCatedraticos(){
        NodoCatedraticos actual = new NodoCatedraticos();
        actual = primero;
        while(actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    
    public boolean BuscarCatedratico(int c){
        NodoCatedraticos actual = new NodoCatedraticos();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            try{
                if(actual.dato.getCarne() == c){
                    encontrado = true;

                }
                actual = actual.siguiente;
            }
            catch(NullPointerException e){
                System.out.println("EL LISTADO TIENE ESPACIOS LIBRES");
            }
        }
        if(encontrado == true){
            System.out.println("EL CATEDRATICO FUE ENCONTRADO");
            return encontrado;
        }
        else{
            System.out.println("EL CATEDRATICO NO FUE ENCONTRADO");
            return encontrado;
        }
        
    }
    
    public boolean LogearCatedratico(int c, int p){
        NodoCatedraticos actual = new NodoCatedraticos();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            try{
                if((actual.dato.getCarne() == c)&&(actual.dato.getContrasena()==p)){
                    encontrado = true;

                }
                actual = actual.siguiente;
            }
            catch(NullPointerException e){
                System.out.println("EL LISTADO TIENE ESPACIOS LIBRES");
            }
        }
        if(encontrado == true){
            System.out.println("EL CATEDRATICO FUE ENCONTRADO");
            return encontrado;
        }
        else{
            System.out.println("EL CATEDRATICO NO FUE ENCONTRADO");
            return encontrado;
        }
        
    }
    
    public void ModificarCatedratico(int c){
        NodoCatedraticos actual = new NodoCatedraticos();
        actual = primero;
       
        while(actual != null){
            if(actual.dato.getCarne() == c){
                String correo = "MODIFICADO";
                actual.dato.setCorreo(correo);
                String direccion = "MODIFICADO";
                actual.dato.setDireccion(direccion);
                int curso= 0;
                actual.dato.setCurso(curso);
                System.out.println("SE HAN MODIFICADO LOS DATOS DEL CATEDRATICO");
            }
            actual = actual.siguiente;
        }
    }
    
    public void EliminarCatedratico(int c){
        NodoCatedraticos actual = new NodoCatedraticos();
        NodoCatedraticos anterior = new NodoCatedraticos();
        actual = primero;
        anterior = null;
        while(actual != null){
            if(actual.dato.getCarne() == c){
                if(actual == primero){
                    primero = primero.siguiente;
                }
                else{
                    anterior.siguiente = actual.siguiente;
                }
            }   
            anterior = actual;
            actual = actual.siguiente;
        }
    
    }
    
    
    
}
