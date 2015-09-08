/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.tostring;

/**
 *
 * @author hernando
 */
public class MotoElectrica extends Moto {

    private double voltage;
    private double amperaje;

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(double amperaje) {
        this.amperaje = amperaje;
    }

    @Override
    protected String referencia() {
        return "estoy el clase motoelectrica"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String arrancar() {
        return "arranco por uso de electricidad"; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String toString() {
        return "MotoElectrica{" + "rueda=" + this.getRueda() + "color="
                + this.getColor() + "marca=" + this.referencia() + "voltage="
                + this.voltage + ", amperaje=" + this.amperaje +", arranque="+this.arrancar() + '}';
    }

}
