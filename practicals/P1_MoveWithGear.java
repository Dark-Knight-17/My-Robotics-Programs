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

/*PRACTICAL NO 1 b:

TITLE:- Write a program to create a robot to move forward,turn left and right WITH GEARS
*/
import ch.aplu.robotsim.*;

public class P1_MoveWithGear {
    
    void MoveWithGear(){
        
NxtRobot robot = new NxtRobot();
Gear gear = new Gear();
robot.addPart(gear);
gear.forward(2000);
gear.setSpeed(30);
gear.left(480);
gear.forward(2000);
gear.right(800);
gear.forward(4000);
      //Tools.delay(2000);
robot.exit();
    }
    
    public static void main(String[] args) {
        new P1_MoveWithGear().MoveWithGear();
    }
    
}
