/*
Imagenes tomadas de:
 https://www.flaticon.com/free-icon/drone_90905
 */
package weed;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Fabian Giraldo
 */
public class Drone extends Robot{
    
    public Drone(City city, int i, int i1, Direction drctn, int i2) {
        super(city, i, i1, drctn, i2);
        setIcon(new Bicon("drone1.png"));
    }
    
}
