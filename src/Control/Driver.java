/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Estructuras.ListaCircularDoble;
import Estructuras.ListaCircularSimple;
import Estructuras.ListaDoble;
import Estructuras.ListaSimple;
import Vistas.MenuPrincipal;

 
/**
 *
 * @author carlosmartinez
 */
public class Driver {
    public static  ListaCircularDoble ListaEstudiantes;
    public static  ListaCircularSimple ListaCursos;
    public static  ListaSimple ListaCatedraticos;
    public static  ListaDoble ListaSemestres;
    public static void main(String [] args){
        ListaCursos = new ListaCircularSimple();
        ListaEstudiantes = new ListaCircularDoble();
        ListaCatedraticos = new ListaSimple();
        ListaSemestres = new ListaDoble();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
}


