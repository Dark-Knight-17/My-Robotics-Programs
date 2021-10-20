/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics.practicals;

import ch.aplu.robotsim.*;

/**
 *
 * @author M
 */
public class P7_Register_Obstacles {
    
    
  void resistObstacles() { 
      
 LegoRobot robot=new LegoRobot(); 
 Gear gear=new Gear(); 
 TouchSensor ts=new TouchSensor(SensorPort.S3);  
 robot.addPart(gear);  
 robot.addPart(ts);  
 gear.setSpeed(30);  
 gear.forward(); 
 while(true) 
 { 
 if(ts.isPressed()) 
 { 
 gear.backward();  
 gear.left(750); 
 gear.forward(); 

} 
 
} 
 }    
    
   static 
{ 
 RobotContext.showNavigationBar(); 
 RobotContext.useObstacle("sprites/bar0.gif",250,200); 
 RobotContext.useObstacle("sprites/bar1.gif", 400, 250); 
 RobotContext.useObstacle("sprites/bar2.gif", 250, 400);  
 RobotContext.useObstacle("sprites/bar3.gif", 100, 250); 
 } 
 
 public static void main(String[] args) {  
     
     
     new P7_Register_Obstacles().resistObstacles();
 
} 
} 

    

