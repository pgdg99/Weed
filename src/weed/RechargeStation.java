
package weed;

import becker.robots.*;
import java.util.ArrayList;

public class RechargeStation extends Thing implements Runnable {
    private ArrayList<Charge> charge;

    public RechargeStation(int cant, City city, int i, int i1) {
        super(city, i, i1);
        charge= new ArrayList<>(cant); 
        setIcon(new Tile("solarpanel.png"));
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
