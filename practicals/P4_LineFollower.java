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

/*
Practical no :4

Title :- Write  a program to create a robot with light sensors to follow a line
 In this program the robot has to follow the black line

*/

import ch.aplu.robotsim.*;

public class P4_LineFollower {
    
    void P4_LineFollower(){
        
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        robot.addPart(gear);
        gear.setSpeed(20);
        robot.addPart(ls);

while (true)
    {
int v = ls.getValue();
if (v < 100)  // black
gear.forward();
if (v > 300 && v < 750)  // blue
gear.leftArc(0.05);
if (v > 800)  // yellow
gear.rightArc(0.05);
    }

}
    
    public static void main(String[] args) {
        new P4_LineFollower().P4_LineFollower();
    }
    
      // ---------- Environment ----------------------
static
  {
RobotContext.setStartPosition(50, 490);
RobotContext.setStartDirection(-90);
RobotContext.useBackground("sprites/road.gif");
  
}

}
