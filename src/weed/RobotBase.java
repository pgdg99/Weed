package weed;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Drone(objetos,0, 2, Direction.EAST,10);
            Weed flor = new Weed(objetos, 0, 3);
            Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            Thing t = estudiante.examineThings(new WeedPred()).next();
            if(t instanceof Weed){
               estudiante.pickThing();
            }
            
            estudiante.move();
            semaforo.cambiarEstado();
            Thread.sleep(500);
            semaforo.cambiarEstado();
           
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

