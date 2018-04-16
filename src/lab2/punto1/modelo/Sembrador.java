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
public class Sembrador extends Drone {
    private int cantSemillas;
    private int cantFerti;

    public Sembrador(int cantSemillas, int cantFerti, City city, int i, int i1, Direction drctn, int cant, ZonaCarga charge) {
        super(city, i, i1, drctn, cant,charge);
        this.cantSemillas = cantSemillas;
        this.cantFerti = cantFerti;
    }
    
    
}
