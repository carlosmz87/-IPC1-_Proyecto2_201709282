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
public class CargarCursos {
    //DEFINIR VARIABLES DE TIPO ARCHIVO
    File archivo;
    FileReader Lector;
    FileWriter Escritor;
    BufferedReader Buffer;
    String [] fila;
    String [] fila2;
    
    
    int contarFilas;
    public static Cursos[] curso;
    
    public CargarCursos(){
        curso= new Cursos[6];
        contarFilas=0;
                        
    }
   
    public Cursos[]  CargaCursos(){
        try{
            JFileChooser seleccionar = new JFileChooser();
            seleccionar.showOpenDialog(seleccionar);
            String path = seleccionar.getSelectedFile().getAbsolutePath();
            archivo = new File(path);
            Lector = new FileReader(archivo);
            Buffer = new BufferedReader(Lector);
            String lec ="";
            String auxiliar ="";
            String auxiliar2="";
            while(true){
                auxiliar=Buffer.readLine();
                
                if(auxiliar!=null){
                    //SE SEPARA POR PALABRAS EL ARREGLO
                    fila=auxiliar.split(";");
                    
                    //OBTENEMOS CADA VARIABLE DEL ARCHIVO Y CREAMOS UN OBJETO DE TIPO CURSOS
                    int ncur=Integer.parseInt(fila[0]);
                    int catedratico= Integer.parseInt(fila[1]);
                    int creditos = Integer.parseInt(fila[2]);
                    boolean lab = Boolean.valueOf(fila[3]);
                    char seccion = fila[4].charAt(0);
                    //SEPARAMOS LOS PRE REQUISITOS Y LOS ALMACENAMOS EN UN ARRAY
                    fila2 = fila[5].split(",");
                    int[] pre = new int[3];
                    for(int i=0; i<3; i++){
                        pre[i]= Integer.parseInt(fila2[i]);
                        
                    }
                    int post = Integer.parseInt(fila[6]);
                    boolean estado = Boolean.valueOf(fila[7]);
                    
                    Cursos c1 = new Cursos(ncur, catedratico, creditos, lab, seccion, pre, post, estado);
                    //INSTANCIAMOS UN ARREGLO DE TIPO CURSO PARA ALMACENAR LOS CURSOS
                    curso[contarFilas]=c1;
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
            return curso;
        
        }
        catch(IOException e){
            System.out.println("ERROR DE ARCHIVO");
        }
        return null;
    }
    
    
   
    
}
