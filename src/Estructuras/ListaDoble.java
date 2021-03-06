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
                ultimo=nuevo;
            }
        }
        else if(asig==true){
            JOptionPane.showMessageDialog(null, " EL CURSO YA FUE ASIGNADO ");
        }
    }
    public String[] MostrarCursosAprobados(int x){
        NodoSemestres actual = new NodoSemestres();
        actual=primero;
        String resp[]=new String[100];
        int i=0;
        while(actual!=null){
            if((actual.dato.getCarnet()==x)&&(actual.dato.isEstado()==true)){
                String car=String.valueOf(actual.dato.getCarnet());
                String c=String.valueOf(actual.dato.getCurso());
                String n=String.valueOf(actual.dato.getNota());
                String nom = actual.dato.getNombre();
                resp[i] = "EL ESTUDIANTE " + car + " " + nom + " EN EL CURSO: "+ c + " TIENE UNA NOTA DE: " + n + " CON LO CUAL APRUEBA EL CURSO"; 
                i++;
            }
            actual=actual.siguiente;
        }
        return resp;
    }
    
    public String[] MostrarCursosAsignados(int num, int x){
        NodoSemestres actual = new NodoSemestres();
        actual=primero;
        String resp[]=new String[100];
        int i=0;
        while(actual!=null){
            if((actual.dato.getNumero()==num)&&(actual.dato.getCarnet()==x)&&(actual.dato.isAsignado()==true)){
                String sem = String.valueOf(actual.dato.getNumero());
                String car=String.valueOf(actual.dato.getCarnet());
                String c=String.valueOf(actual.dato.getCurso());
                String nom = actual.dato.getNombre();
                resp[i] = "EL ESTUDIANTE " + car + " " + nom + " SE HA ASIGNADO EL CURSO: "+ c + " EN EL SEMESTRE: " +sem; 
                i++;
            }
            actual=actual.siguiente;
        }
        return resp;
    }
    
    public void MostrarSemestres(){
        NodoSemestres actual = new NodoSemestres();
        actual=primero;
        while(actual!=null){
            System.out.println(actual.dato);
            actual=actual.siguiente;
        }
        
    }
    
    public boolean getEstado( int car){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            if(actual.dato.getCarnet()==car){
                encontrado = true;
                encontrado=actual.dato.isEstado();
                System.out.println("SEMESTRE EXISTENTE");
            }
            actual = actual.siguiente;
        }
        return encontrado;
    }
    public boolean getAsignacion(int x, int car, int c){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            if((actual.dato.getNumero()== x)&&(actual.dato.getCurso()==c)&&(actual.dato.getCarnet()==car)){
                encontrado = true;
                encontrado=actual.dato.isAsignado();
                System.out.println("SEMESTRE EXISTENTE");
            }
            actual = actual.siguiente;
        }
        return encontrado;
    }
    
    public boolean BuscarSemestre(int x, int car, int c, boolean a){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            if((actual.dato.getNumero()== x)&&(actual.dato.getCarnet()==car)&&(actual.dato.getCurso()==c)&&(actual.dato.isAsignado()==false)){
                encontrado = true;
                System.out.println("SEMESTRE EXISTENTE");
            }
            actual = actual.siguiente;
        }
        return encontrado;
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
    
    public int[] ListarEstudiantes(int num, int cur){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        int Eactual[] = new int[100];
        int i=0;
        while(actual != null){
            try{
                
                if((actual.dato.getCurso()==cur)&&(actual.dato.getNumero()==num)&&(actual.dato.isAsignado())){
                    Eactual[i]=actual.dato.getCarnet();
                    
                    i++;
                }
                
                
            }
            catch(NullPointerException e){
                System.out.println("LA LISTA TIENE UN ESPACIO NULO");
            }
            actual=actual.siguiente;   
        }
        
        return Eactual;
    }
    
    public String NombreAsignado(int x){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        String nom ="";
        while(actual != null){
            try{
                
                if(actual.dato.getCarnet()==x){
                    nom=actual.dato.getNombre();
                }
                
                
            }
            catch(NullPointerException e){
                System.out.println("LA LISTA TIENE UN ESPACIO NULO");
            }
            actual=actual.siguiente;
               
        }
        
        return nom;
    
    }
    public int[] ListarCursos( int cat){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        int Cactual[] = new int[100];
        int i=0;
        while(actual != null){
            try{
                
                if(actual.dato.getCatedratico()==cat){
                    Cactual[i]=actual.dato.getCurso();
                    
                    i++;
                }
                
                
            }
            catch(NullPointerException e){
                System.out.println("LA LISTA TIENE UN ESPACIO NULO");
            }
            actual=actual.siguiente;
               
        }
        
        return Cactual;
    }
    
     public void ModificarNota(int x, int cur, int n){
        NodoSemestres actual = new NodoSemestres();
        actual = primero;
        boolean encontrado = false;
        while(actual != null){
            if((actual.dato.getCarnet()== x)&&(actual.dato.getCurso()==cur)){
                encontrado = true;
                actual.dato.setNota(n);
                if((actual.dato.getNota()>=61)&&(actual.dato.getNota()<=100)){
                    actual.dato.setEstado(true);
                    JOptionPane.showMessageDialog(null, "EL ESTUDIANTE " + x +" HA APROBADO");
                    MostrarSemestres();
                }
                else{
                    actual.dato.setEstado(false);
                    actual.dato.setNota(n);
                    JOptionPane.showMessageDialog(null, "EL ESTUDIANTE " + x +" HA REPROBADO");
                }
            }
            actual = actual.siguiente;
        }
        
    }
    
}
