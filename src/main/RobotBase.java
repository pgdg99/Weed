package main;

import test.Semaforo;
import weed.Fertilizer;
import test.CheckWeed;
import weed.Weed;
import becker.robots.*;
import weed.RechargeStation;

public class RobotBase
{    
      
        public static City objetos;
        public static Fertilizer drone1;
        public static RechargeStation cell;
        
	public static void main (String[] args) throws InterruptedException{
            
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            RechargeStation cell=new RechargeStation(99,objetos,1,1);
            Fertilizer drone1=new Fertilizer(objetos,1,1,Direction.NORTH,15,cell,5,6);
            
              
            
            Weed flor = new Weed(14.1, 20.5, 15, objetos, 15, 5);
            	    
            drone1.moveTo(5, 8);
            drone1.moveTo(3, 4);
            

	}
        
}

