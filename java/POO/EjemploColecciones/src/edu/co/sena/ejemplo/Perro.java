/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo;

/**
 *
 * @author hernando
 */
public class Perro implements Comparable<Perro> {

    private String idPerro;
    private String nombre;
    private String raza;
    private String sexo;
    private String color;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(String idPerro) {
        this.idPerro = idPerro;
    }

    @Override
    public int compareTo(Perro o) {
        int id = Integer.parseInt(this.idPerro);
        int idC = Integer.parseInt(o.getIdPerro());
        int retorno = 0;
        if (id < idC) {
            retorno = -1;
        } else if (id > idC) {
            retorno = 1;
        } else if (id == idC) {
            retorno = 0;
        }
        return retorno;
    }
    @Override
    public int compareTo(Estudiante o) {
       int retoro=0;
       if(!(this.tipoDocumento.equals(o.getTipoDocumento) && this.numeroDocumento.equal(o.getTipoDocumento()))){
       retorno=-1;
       }
       
        return retorno;
    }

}
