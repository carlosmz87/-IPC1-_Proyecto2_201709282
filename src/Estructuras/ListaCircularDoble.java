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
    public void MostrarEstudiantes(){
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
    
    //LA FUNCION BUSCAR ESTUDIANTE, RECORRE LA LISTA Y BUSCA COINCIDENIA EN EL CARNET DEL ESTUDIANTE
    public boolean BuscarEstudiante(int c){
        //CREAMOS UN NODO AUXILIAR PARA RECORRER LA LISTA
        NodoEstudiantes actual = new NodoEstudiantes();
        //EL NODO AUXILIAR SE UBICA DE ULTIMO EN LA LISTA
        actual=ultimo;
        //DECLARAMOS UNA BANDERA BOOLEANA
        boolean encontrado = false;
        //CICLO DO WHILE QUE RECORRE LA LISTA
        do{
            //EL TRY CATCH POR SI EN LA CARGA MASIVA DE ESTUDIANTES DEJAMOS ALGUN ESPACIO VACIO
            try{
                //COMPARAMOS EL CARNET DEL ESTUDIANTE EN LA LISTA CON EL CARNET INGRESADO
                if(actual.dato.getCarne()==c){
                    encontrado = true;
                    
                }
                //EL NODO AUXILIAR SE UBICA EN EL NODO ANTERIOR DE NO SER ENCONTRADA LA COINCIDENCIA
                actual = actual.anterior;
                
            }
            catch(NullPointerException e){
                
                System.out.println("EL ESTUDIANTE NO ESTA DISPONIBLE");
            }
        }
        while(actual!=ultimo);
        
        if(encontrado==true){
            System.out.println("ESTUDIANTE ENCONTRADO");
            return encontrado;
            
        }
        else{
            System.out.println("ESTUDIANTE NO ENCONTRADO");
            return encontrado;
           
        }
        
    }
    
    //LA FUNCION MODIFICARESTUDIANTE FUNCIONA DE LA MISMA MANERA QUE LA FUNCION BUSCAR
    //AL ENCONTRAR COINCIDENCIA DE LOS CARNETS UNICAMENTE MODIFICA SUS DATOS COMO EL CORREO, DIRECCION Y LOS CREDITOS
    public void ModificarEstudiante(int c, String mail, String adress, int credits){
        NodoEstudiantes actual = new NodoEstudiantes();
        actual=ultimo;
        boolean encontrado = false;
        do{
            try{
                if(actual.dato.getCarne()==c){
                    encontrado = true;
                    String correo = mail;
                    actual.dato.setCorreo(correo);
                    String direccion = adress;
                    actual.dato.setDireccion(direccion);
                    int creditos = credits;
                    actual.dato.setCreditos(creditos);
                    System.out.println("DATOS DEL ESTUDIANTE MODIFICADOS");
                    
                }
                actual = actual.anterior;
                
            }
            catch(NullPointerException e){
                
                System.out.println("EL ESTUDIANTE NO ESTA DISPONIBLE");
            }
        }
        while(actual!=ultimo);
        
        if(encontrado==true){
            System.out.println("ESTUDIANTE ENCONTRADO");
            
        }
        else{
            System.out.println("ESTUDIANTE NO ENCONTRADO");
           
        }
    }
    
    //LA FUNCION ELIMINAR ESTUDIANTES ELIMINA UN ESTUDIANTE SELECCIONADO POR EL NUMERO DE CARNET
    public void EliminarEstudiantes(int c){
        //SE CREAN DOS NODOS AUXILIARES PARA RECORRER LA LISTA
        NodoEstudiantes actual = new NodoEstudiantes();
        NodoEstudiantes anterior = new NodoEstudiantes();
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
                //VERIFICA SI ENCUENTRA COINCIDENCIA EN EL NUMERO DE CARNET
                if(actual.dato.getCarne()==c){
                    encontrado=true;
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA DE PRIMERO EN LA LISTA
                    if(actual==primero){
                        //EL PRIMER NODO APUNTARA AL SIGUIENTE
                        primero = primero.siguiente;
                        //EL ULTIMO NODO QUE APUNTABA AL SIGUIENTE AHORA APUNTA AL PRIMERO
                        ultimo.siguiente = primero;
                        //EL PRIMER NODO QUE APUNTABA AL ANTERIOR AHORA APUNTA AL ULTIMO
                        primero.anterior = ultimo;
                        System.out.println("EL ESTUDIANTE FUE ELIMINADO");
                    }
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA DE ULTIMO EN LA LISTA
                    else if(actual==ultimo){
                        //EL ULTIMO NODO APUNTA AL ANTERIOR
                        ultimo=anterior;
                        //EL PRIMER NODO QUE APUNTABA AL ANTERIOR AHORA APUNTA AL ULTIMO
                        primero.anterior = ultimo;
                        //EL ULTIMO NODO QUE APUNTABA AL SIGUIENTE AHORA APUNTA AL PRIMERO
                        ultimo.siguiente = primero;
                        System.out.println("EL ESTUDIANTE FUE ELIMINADO");
                    }
                    //VALIDAMOS SI EL NODO ENCONTRADO SE UBICA EN MEDIO DE LA LISTA
                    else{
                        //EL NODO ANTERIOR QUE APUNTABA AL SIGUIENTE AHORA APUNTA AL ACTUAL QUE APUNTA A SIGUIENTE
                        anterior.siguiente = actual.siguiente;
                        //EL NODO ACTUAL QUE APUNTABA AL SIGUIENTE DEL ANTERIOR DEL PRIMER NODO AHORA APUNTA AL ANTERIOR
                        actual.siguiente.anterior = anterior;
                        System.out.println("EL ESTUDIANTE FUE ELIMINADO");
                    }
                }
                //DE NO SER ENCONTRADA LA COINCIDENCIA EL NODO ANTERIOR PASA A SER EL ACTUAL
                anterior = actual;
                //EL NODO ACTUAL PASA A SER EL NODO SIGUIENTE
                actual = actual.siguiente;
            }
            catch(NullPointerException e){
                System.out.println("EL ESTUDIANTE NO ESTA DISPONIBLE");
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
