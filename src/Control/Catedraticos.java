/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author carlosmartinez
 */
public class Catedraticos {
    public int carne, dpi, curso, contrasena;
    public String nombre, correo, direccion;

    public Catedraticos(int carne, int dpi, int curso, int contrasena, String nombre, String correo, String direccion) {
        this.carne = carne;
        this.dpi = dpi;
        this.curso = curso;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getCarne() {
        return carne;
    }

    public int getContrasena() {
        return contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCurso() {
        return curso;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDpi() {
        return dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " EL CARNE ES: "+carne+ " DPI: " + dpi+" NOMBRE: " + nombre+" CORREO: " + correo+ " DIRECCION: " + direccion+ " NO CURSO: " + curso+ " CONTRASENA: " + contrasena;
    }

    
    
    
    
}
