/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.punto1.modelo;

import becker.robots.City;
import becker.robots.Thing;

/**
 *
 * @author Fabian Giraldo
 */
public class Semaforo extends Thing{
    private String[] images = { "GreenLight.gif","YellowLight.gif", "RedLight.gif" };
    private int state ;
    
    public Semaforo(City city, int i, int i1) {
        super(city, i, i1);
        this.state = 0;
        setIcon(new Bicon(this.images[this.state]));
    }
    
    public void cambiarEstado(){
       this.state = ((this.state + 1) % 3);
        setIcon(new Bicon(this.images[this.state]));
    }
    
}
