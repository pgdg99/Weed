/*
  Clase que permite chequear si un Thing es de un tipo especifico.
 */
package weed;

import becker.robots.IPredicate;
import becker.robots.Sim;

/**
 *
 * @author Fabian Giraldo
 */
public class WeedPred implements IPredicate
  { 
     public boolean isOK(Sim s)
     {  return s instanceof Weed;
     }
  }
