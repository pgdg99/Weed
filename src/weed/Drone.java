
package weed;

import becker.robots.*;
import java.lang.Math;

public abstract class Drone extends RobotSE {
    
    protected int battery;
    protected RechargeStation charge;
    
    public Drone(City city, int x, int y, Direction dir, int bat, RechargeStation charge) {
        super(city, x, y, dir);
        this.battery = bat;
        setIcon(new Tile("drone1.png"));
        this.charge = charge;
    }
            
    public void moveTo(int x, int y){
        int currentX=this.getStreet();
        int currentY=this.getAvenue();
        int reqEnergy=(Math.abs(x-currentX))+(Math.abs(y-currentY));
        
        if (reqEnergy<=battery/2){
            if(x>currentX){
                if(this.getDirection()==Direction.NORTH){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.SOUTH){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnAround();
                }
                this.move(Math.abs(x-currentX));
                battery=-(Math.abs(x-currentX));
            }

            if(x<currentX){
                if(this.getDirection()==Direction.NORTH){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.SOUTH){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnAround();
                }
                this.move(Math.abs(x-currentX));
                battery=-(Math.abs(x-currentX));
            }

            if(y>currentY){
                if(this.getDirection()==Direction.NORTH){
                    this.turnAround();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnLeft();
                }
                this.move(Math.abs(y-currentY));
                battery=-(Math.abs(y-currentY));
            }

            if(y<currentY){
                if(this.getDirection()==Direction.SOUTH){
                    this.turnAround();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnRight();
                }
                this.move(Math.abs(y-currentY));
                battery=-(Math.abs(y-currentY));
            }
            
        }else{
            int chargeX=charge.getX();
            int chargeY=charge.getY();
            
            if(chargeX>currentX){
                if(this.getDirection()==Direction.NORTH){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.SOUTH){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnAround();
                }
                this.move(Math.abs(chargeX-currentX));
                battery=-(Math.abs(chargeX-currentX));
            }

            if(chargeX<currentX){
                if(this.getDirection()==Direction.NORTH){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.SOUTH){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnAround();
                }
                this.move(Math.abs(chargeX-currentX));
                battery=-(Math.abs(chargeX-currentX));
            }

            if(chargeY>currentY){
                if(this.getDirection()==Direction.NORTH){
                    this.turnAround();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnRight();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnLeft();
                }
                this.move(Math.abs(chargeY-currentY));
                battery=-(Math.abs(chargeY-currentY));
            }

            if(chargeY<currentY){
                if(this.getDirection()==Direction.SOUTH){
                    this.turnAround();
                }
                if(this.getDirection()==Direction.EAST){
                    this.turnLeft();
                }
                if(this.getDirection()==Direction.WEST){
                    this.turnRight();
                }
                this.move(Math.abs(chargeY-currentY));
                battery=-(Math.abs(chargeY-currentY));
            }
            for(int i=0;i<=20;i++){
                battery++;
                int c= battery;
                this.setLabel(Integer.toString(c));
            }
            
        }
        
        
    }
    
    
}
