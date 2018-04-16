/*
Imagenes tomadas de:
 https://www.flaticon.com/free-icon/drone_90905
 */
package lab2.punto1.modelo;

import becker.robots.*;

/**
 *
 * @author Fabian Giraldo
 */
public abstract class  Drone extends RobotSE {
    
    protected int Battery;
    protected ZonaCarga charge;
    
    public Drone(City city, int i, int i1, Direction drctn, int cant, ZonaCarga charge) {
        super(city, i, i1, drctn);
        this.Battery = cant;
        setIcon(new Bicon("drone1.png"));
        this.charge = charge;
    }
    
    public boolean comBat(){
        int cantSteps;
        //cantSteps+=Maths.abs(this.getAvenue()-charge.;
        return false;
    }
     
    
}
