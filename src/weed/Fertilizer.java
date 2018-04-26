
package weed;

import becker.robots.City;
import becker.robots.Direction;

public class Fertilizer extends Drone {
    private int seeds;
    private int fert;

    public Fertilizer(City city, int x, int y, Direction dir, int bat, RechargeStation charge, int seeds, int fert) {
        super(city, x, y, dir, bat,charge);
        this.seeds = seeds;
        this.fert = fert;
    }
    
    public void plant (int x, int y, double humidity, double temperature, int fert){
        this.moveTo(x, y);
        
    }
}
