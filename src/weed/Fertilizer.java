
package weed;

import becker.robots.City;
import becker.robots.Direction;

public class Fertilizer extends Drone {
    private int seeds;
    private int fert;

    public Fertilizer(int seeds, int fert, City city, int i, int i1, Direction drctn, int b, RechargeStation charge) {
        super(city, i, i1, drctn, b,charge);
        this.seeds = seeds;
        this.fert = fert;
    }
    
    
}
