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
public class Ingeniero extends Empleado {
private int id;
private String nombre;
private String direccion;
private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

@Override
    public String getNombre() {
        return nombre;
    }

@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@Override
    public String getDireccion() {
        return direccion;
    }

@Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

@Override
    public double getSalario() {
        return salario;
    }

@Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

 

  
}
