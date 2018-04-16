/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.punto1.modelo;

import becker.robots.City;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author Fabian Giraldo
 */
public class Punto extends Thing
 {
    public Punto(City city, int i, int i1) {
        super(city, i, i1);
        setColor(Color.red);
       
    }
    
    
}
