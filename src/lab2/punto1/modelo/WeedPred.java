/*
  Clase que permite chequear si un Thing es de un tipo especifico.
 */
package lab2.punto1.modelo;

import becker.robots.IPredicate;
import becker.robots.Sim;

/**
 *
 * @author Fabian Giraldo
 */
public class WeedPred implements IPredicate
  { 

    /**
     *
     * @param s
     * @return
     */
    @Override
     public boolean isOK(Sim s)
     {  return s instanceof Weed;
     }
  }
