/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.io.*;
import java.util.Arrays;
import javax.swing.JFileChooser;
/**
 *
 * @author carlosmartinez
 */
public class CargarCatedraticos {
    //DEFINIR VARIABLES DE TIPO ARCHIVO
    File archivo;
    FileReader Lector;
    FileWriter Escritor;
    BufferedReader Buffer;
    String [] fila;
    int contarFilas;
    public static Catedraticos[] catedratico;
    
    public CargarCatedraticos(){
        catedratico= new Catedraticos[6];
        contarFilas=0;
                        
    }
   
    public Catedraticos[]  CargaCatedraticos(){
        try{
            JFileChooser seleccionar = new JFileChooser();
            seleccionar.showOpenDialog(seleccionar);
            String path = seleccionar.getSelectedFile().getAbsolutePath();
            archivo = new File(path);
            Lector = new FileReader(archivo);
            Buffer = new BufferedReader(Lector);
            String lec ="";
            String auxiliar ="";
            int contrasena;
            int pw;
            while(true){
                auxiliar=Buffer.readLine();
                if(auxiliar!=null){
                    //SE SEPARA POR PALABRAS EL ARREGLO
                    fila=auxiliar.split(";");
                    
                    //OBTENEMOS CADA VARIABLE DEL ARCHIVO Y CREAMOS UN OBJETO DE TIPO CATEDRATICOS
                    int carne=Integer.parseInt(fila[0]);
                    int dpi= Integer.parseInt(fila[1]);
                    String nombre = fila[2];
                    String correo = fila[3];
                    String direccion = fila[4];
                    int curso = Integer.parseInt(fila[5]);
                    contrasena = (int)(Math.floor(Math.random()*999));
                    String passw = carne+String.valueOf(contrasena);
                    pw = Integer.parseInt(passw);
                    Catedraticos catedratico1 = new Catedraticos(carne,dpi,curso,pw,nombre,correo,direccion);
                    
                    //INSTANCIAMOS UN ARREGLO DE TIPO ESTUDIANTES PARA ALMACENAR LOS ESTUDIANTES
                    catedratico[contarFilas]=catedratico1;
                    //CONTADOR DE FILAS +1
                    contarFilas++;
                }
                else{
                   
                    break;
                }
            }
            //CERRAMOS EL BUFFER Y EL LECTOR DE ARCHIVOS
            Buffer.close();
            Lector.close();
            return catedratico;
        
        }
        catch(IOException e){
            System.out.println("ERROR DE ARCHIVO");
        }
        return null;
    }
    
    
   
    
}
