package robotics.practicals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */

/*  Practical 5 TITLE : Write a program to create a robot to that does a circle using two motors.*/
import ch.aplu.robotsim.*;

public class P5_CircleUsingMotors {
    int i=0;
    
    // this code commented coz this is in the journal still not acheiving what we want - use of motors
//    void P5_CircleUsingMotors(){
//        
//NxtRobot robot = new NxtRobot();
//Gear gear = new Gear();
//robot.addPart(gear);
//gear.setSpeed(60);
//gear.leftArc(0.2,7000); 
//gear.rightArc(0.2);
//Tools.delay(5000);
//robot.exit();
//   
//    }
    void P5_CircleUsingMotors(){
        
     NxtRobot robot = new NxtRobot();
    Motor motA = new Motor(MotorPort.A);
    Motor motB = new Motor(MotorPort.B);
    robot.addPart(motA);
    robot.addPart(motB);
    
    motA.setSpeed(80);
    motB.setSpeed(80); // to make the robot move fast ;-)
    
  // The lesser the mototr speed the more the while loop will be executed 
while (true)
{
  i+=1;
motA.forward(); //turn left so that the robot will make circle in clockwise direction if you want anticlock then replace it with B
Tools.delay(100); // stop movement for some minute amount of time to make arc
motA.forward(); //
motB.forward(); // move forward
Tools.delay(100);
motB.stop(); // to stop the motor B so that robot can continue in clockwise direction 
motA.forward();//
motB.forward();  //again continue forward
Tools.delay(100); // again delay 
motB.stop();

}

 }
  
    public static void main(String[] args) {
        new P5_CircleUsingMotors().P5_CircleUsingMotors();
    }
}
