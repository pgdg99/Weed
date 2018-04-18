package main;

import test.Semaforo;
import weed.Fertilizer;
import test.CheckWeed;
import weed.Weed;
import becker.robots.*;

public class RobotBase
{    
      
        public static City objetos;
        public static Fertilizer drone1;
        
	public static void main (String[] args) throws InterruptedException{
            
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            
            
            
            
            Weed flor = new Weed(14.1, 20.5, 15, objetos, 10, 5);
            Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    
            drone1.move ();
            System.out.println(drone1.getSpeed());
            drone1.setSpeed(5.0);
            drone1.move ();

            Thing t = drone1.examineThings(new CheckWeed()).next();
            if(t instanceof Weed){
               drone1.pickThing();
                
            }
            
            drone1.move();
            semaforo.cambiarEstado();
            Thread.sleep(500);
            semaforo.cambiarEstado();
           
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                drone1.move();
        }
}

