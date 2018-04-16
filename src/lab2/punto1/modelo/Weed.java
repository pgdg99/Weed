/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.punto1.modelo;

import becker.robots.*;

/**
 *
 * @author Fabian Giraldo
 */
public class Weed extends Thing implements Runnable 
 {
    private double humity;
    private double temperature;
    private int cantFerti;
    
    public Weed(double humity, double temperature, int cantFerti, City city, int i, int i1) {
        super(city, i, i1);
        this.humity = humity;
        this.temperature = temperature;
        this.cantFerti = cantFerti;
        setIcon(new Bicon("plant.png"));
    }    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
