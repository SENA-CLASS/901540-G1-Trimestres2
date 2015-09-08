/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.prueba;

/**
 *
 * @author hernando
 */
public class Empleado  {
    private int id;
    private String nombre;
    private String direccion;
    private double salario;
   

    public int getEmpledo() {
        
        return id;
    }

    public void setEmpledo(int id) {
        
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
