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

TITLE:- Write a program to create a robot to move forward,turn left and right WITHOUT GEARS
*/

import ch.aplu.robotsim.*;

 
public class P1b_MoveWithoutGears {
    
  
    
   void MoveWithoutGears ()
  {
TurtleRobot robot = new TurtleRobot();
robot.forward(100);
robot.left(90);
robot.forward(50);
robot.right(90);
robot.forward(50); 
robot.exit();
  
}
    
public static void main(String[] args)
  {
new P1b_MoveWithoutGears ().MoveWithoutGears();
  }}
