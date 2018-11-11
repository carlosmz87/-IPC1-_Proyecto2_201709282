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
public class Cursos {
    
    public int curso, catedraticos, creditos, post;
    public boolean lab, estado;
    public int[] pre;
    public char seccion;
    
    public Cursos(int curso, int catedraticos, int creditos, boolean lab, char seccion, int[] pre, int post, boolean estado){
        this.curso=curso;
        this.catedraticos=catedraticos;
        this.creditos=creditos;
        this.lab=lab;
        this.seccion=seccion;
        this.pre=pre;
        this.post=post;
        this.estado=estado;
    }

    public int getCatedraticos() {
        return catedraticos;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getCurso() {
        return curso;
    }

    public int getPost() {
        return post;
    }

    public int[] getPre() {
        return pre;
    }

    public char getSeccion() {
        return seccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isLab() {
        return lab;
    }

    public void setCatedraticos(int catedraticos) {
        this.catedraticos = catedraticos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public void setPre(int[] pre) {
        this.pre = pre;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
    
        return " NO. CURSO: " + curso + " CATEDRATICOS: " + catedraticos + " CREDITOS " + creditos +" LABORATORIO: " + lab + " SECCION: "
                + seccion + " PRE-REQUISITOS: " + pre[0] + " , " + pre[1] + " , " + pre[2] + " POST-REQUISITOS: " + post + " ESTADO: " + estado;
    }
    
    
    
}
