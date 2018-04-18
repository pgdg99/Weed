
package test;

import becker.robots.IPredicate;
import becker.robots.Sim;
import weed.Weed;

public class CheckWeed implements IPredicate
  { 

    @Override
     public boolean isOK(Sim s)
     {  return s instanceof Weed;
     }
  }
