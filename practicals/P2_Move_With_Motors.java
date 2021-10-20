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
import ch.aplu.robotsim.*;

public class P2_Move_With_Motors {
    
    /*PRACTICAL NO-2

TITLE :Write a program to create a robot with two motors and move it forward, left,right.
  @author M

*/
    
    void P2_Move_With_Motors(){
    
    NxtRobot robot = new NxtRobot();
    Motor motA = new Motor(MotorPort.A);
    Motor motB = new Motor(MotorPort.B);
robot.addPart(motA);
robot.addPart(motB);

motA.forward();
motB.forward();
Tools.delay(2000);

motA.stop();
Tools.delay(1050);
motA.forward();
Tools.delay(2000);

motB.stop();
Tools.delay(1050);   
motA.forward();
Tools.delay(1050); 
motB.forward();
Tools.delay(1050); 
motA.forward();
motB.forward();
 

robot.exit();

}
    public static void main(String[] args) {
        new P2_Move_With_Motors().P2_Move_With_Motors();
    }
}
