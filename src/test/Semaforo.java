
package test;

import becker.robots.City;
import becker.robots.Thing;
import weed.Tile;

public class Semaforo extends Thing{
    private String[] images = { "GreenLight.gif","YellowLight.gif", "RedLight.gif" };
    private int state ;
    
    public Semaforo(City city, int i, int i1) {
        super(city, i, i1);
        this.state = 0;
        setIcon(new Tile(this.images[this.state]));
    }
    
    public void cambiarEstado(){
       this.state = ((this.state + 1) % 3);
        setIcon(new Tile(this.images[this.state]));
    }
    
}
