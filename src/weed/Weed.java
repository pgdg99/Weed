
package weed;

import becker.robots.*;

public class Weed extends Thing implements Runnable 
 {
    private double humity;
    private double temperature;
    private int fert;
    
    public Weed(double humity, double temperature, int fert, City city, int i, int i1) {
        super(city, i, i1);
        this.humity = humity;
        this.temperature = temperature;
        this.fert = fert;
        setIcon(new Tile("plant.png"));
    }    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
