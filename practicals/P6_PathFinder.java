/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics.practicals;

/**
 *
 * @author M
 */
/*Practical no :-6

TITLE:- write a program to create a path following robot
*/

import ch.aplu.robotsim.*;

public class P6_PathFinder {
    
    void P6_PathFinder(){
    
    NxtRobot robot = new NxtRobot();
    Gear gear = new Gear();
    LightSensor ls1 = new LightSensor(SensorPort.S1); // right
    LightSensor ls2 = new LightSensor(SensorPort.S2); // left
    robot.addPart(gear);
    robot.addPart(ls1);
    robot.addPart(ls2);
    gear.forward();

while (true)
    {
int rightValue = ls1.getValue();
int leftValue = ls2.getValue();
int d = rightValue - leftValue;
if (d > 100) // left dark , turn right
gear.rightArc(0.1);
if (d < -100) // right dark, turn left
gear.leftArc(0.1);
if (d > -100 && d < 100 &&rightValue> 500)
gear.forward();
    }

    }
           public static void main(String[] args) {
               new P6_PathFinder().P6_PathFinder();
        
    }
            // ------------------ Environment --------------------------
static
  {
NxtContext.setStartPosition(250, 490);
NxtContext.setStartDirection(-90);
NxtContext.useBackground("sprites/path.gif");

  } 
           
    
}
