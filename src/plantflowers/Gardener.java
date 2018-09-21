
package Task2;

import becker.robots.*;

public class Gardener extends Robot

{
 public Gardener(City aCity,int aStreet,int anAvenue,
                 Direction aDirection,int numThings)
 {
     super(aCity,aStreet,anAvenue,aDirection,numThings);
 }
 
 public void plantFlowers()
 {
     this.plantOneSide();
     this.plantOneSide();
     this.plantOneSide();
     this.plantOneSide();
 }
 
 public void plantOneSide()
 {
     this.move();
     this.putThing();
     this.move();
     this.putThing();
     this.turnLeft();
     
 }
 
 
 
 
}


