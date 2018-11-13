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
public class Semestres {
    public int numero, curso, catedratico, pre[], post, carnet, nota;
    public boolean lab, estado, asignado;
    public String nombre;
    
    public Semestres(int numero, int curso, int catedratico, boolean lab, int pre[], int post, int nota, boolean estado, int carnet, String nombre, boolean asignado ){
        this.numero=numero;
        this.curso=curso;
        this.catedratico=catedratico;
        this.lab=lab;
        this.pre=pre;
        this.post=post;
        this.nota=nota;
        this.estado=estado;
        this.carnet=carnet;
        this.nombre=nombre;
        this.asignado=asignado;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getCatedratico() {
        return catedratico;
    }

    public int getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public int getPost() {
        return post;
    }

    public int[] getPre() {
        return pre;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setCatedratico(int catedratico) {
        this.catedratico = catedratico;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public void setPre(int[] pre) {
        this.pre = pre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }
    
    
    public String toString() {
        return " EL SEMESTRE: " + numero + " NO. CURSO: " + curso + " NO. CARNET CATEDRATICO: " + catedratico + 
                " LABORATORIO: " + lab + " PRE- REQUISITO 1: " + pre[0] + " PRE-REQUISITO 2: " + pre[1] + " PRE-REQUISITO 3: " + pre[2] +
                " POST-REQUISITO: " + post + " NOTA DEL CURSO: " + nota + " ESTADO DEL CURSO: " + estado + " CURSO ASIGNADO: " + asignado + 
                " NO. CARNET ESTUDIANTE: " + carnet + " NOMBRE DEL ESTUDIANTE: " + nombre;
    }
    
    
}
