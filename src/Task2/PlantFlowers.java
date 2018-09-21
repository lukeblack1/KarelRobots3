//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task2;

import Task2.Garden;
import Task2.Gardener;
import becker.robots.*;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    /*
        City berlin = new City();
        Wall eWall = new Wall(berlin, 1,2, Direction.EAST);
        Wall nWall = new Wall(berlin, 1,2, Direction.NORTH);
        Wall wWall = new Wall(berlin, 1,2, Direction.WEST);
        Wall sWall = new Wall(berlin, 1,2, Direction.SOUTH);
      */
        Garden berlin = new Garden();
        berlin.buildWalls();
        
        Gardener karel = new Gardener(berlin,2,3,Direction.SOUTH,8);
        
        
       //Plant
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     
     karel.move();
     karel.move();
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.move();
     
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     
     //END OF MAP CONFIGURE
     
     
     
     karel.move();
     karel.move();
     karel.pickThing();
     karel.turnLeft();
     karel.move();
     karel.pickThing();
     karel.move();
     karel.pickThing();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.move();

     karel.pickThing();
     karel.move();
     karel.pickThing();
     
     //PROBLEM
     
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.move();
     
     
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.putThing();
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     karel.move();
     karel.putThing();
     
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.move();
     karel.move();
     karel.move();
     karel.turnLeft();
     karel.move();
     karel.move();
     
     
    
     
     
     
        //karel.plantFlowers();
        
    }

    private static void putThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        
        
        
    
    

