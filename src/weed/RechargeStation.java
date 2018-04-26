
package weed;

import becker.robots.*;
import java.util.ArrayList;

public class RechargeStation extends Thing implements Runnable {
    private ArrayList<Charge> charge;
    private int x;
    private int y;

    public RechargeStation(int cant, City city, int x, int y) {
        super(city, x, y);
        this.x=x;
        this.y=y;
        charge= new ArrayList<>(cant); 
        setIcon(new Tile("solarpanel.png"));
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Charge> getCharge() {
        return charge;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCharge(ArrayList<Charge> charge) {
        this.charge = charge;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
}
