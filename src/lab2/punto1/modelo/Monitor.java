/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.punto1.modelo;

import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author Estudiante
 */
public class Monitor extends Drone {
    private String tipoCam;

    public Monitor(String tipoCam, City city, int i, int i1, Direction drctn, int i2, int cant, ZonaCarga charge) {
        super(city, i, i1, drctn, cant, charge);
        this.tipoCam = tipoCam;
    }
    
    
    
}
