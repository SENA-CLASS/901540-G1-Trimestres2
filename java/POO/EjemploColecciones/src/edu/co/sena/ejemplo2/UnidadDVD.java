/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo2;

/**
 *
 * @author hernando
 */
public class UnidadDVD implements Comparable<UnidadDVD> {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(UnidadDVD o) {
        int bandera = -1;
        if (this.id.equals(o.getId())) {
            bandera = 0;
        }
        return bandera;
    }

    @Override
    public String toString() {
        return "UnidadDVD{" + "id=" + id + '}';
    }
    
    
}
