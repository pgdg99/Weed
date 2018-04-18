
package weed;

import becker.robots.*;

public abstract class Drone extends RobotSE {
    
    protected int Battery;
    protected RechargeStation charge;
    
    public Drone(City city, int i, int i1, Direction drctn, int cant, RechargeStation charge) {
        super(city, i, i1, drctn);
        this.Battery = cant;
        setIcon(new Tile("drone1.png"));
        this.charge = charge;
    }
    
    public boolean comBat(){
        int cantSteps;
        //cantSteps+=Maths.abs(this.getAvenue()-charge.;
        return false;
    }
     
    
}
