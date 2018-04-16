package lab2.punto1.vista;

import becker.robots.*;
import lab2.punto1.modelo.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Sembrador drone1;
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            
            
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            //drone1 = new Sembrador(20, 30, objetos, 1, 1, Direction.EAST, 100);
            Weed flor = new Weed(14.1, 20.5, 15, objetos, 10, 5);
            Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            drone1.move ();
            System.out.println(drone1.getSpeed());
            drone1.setSpeed(5.0);
            drone1.move ();

            Thing t = drone1.examineThings(new WeedPred()).next();
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

