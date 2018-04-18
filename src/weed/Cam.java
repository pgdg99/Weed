
package weed;

import becker.robots.City;
import becker.robots.Direction;

public class Cam extends Drone {
    private String camType;

    public Cam(String camType, City city, int i, int i1, Direction drctn, int i2, int b, RechargeStation charge) {
        super(city, i, i1, drctn, b, charge);
        this.camType = camType;
    }
    
    
    
}
