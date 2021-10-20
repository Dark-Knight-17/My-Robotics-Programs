/*
 * To change this license header, choose License Headers in Project Properties.
 * 
1,2 - 10 marks, last 3 -35 marks ,rest 30 marks.
To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics.practicals;

import ch.aplu.robotsim.*;

/**
 *
 * @author M
 */
/*practical 3 - Write a program to do a square using a while loop, doing steps with a for loop, to change directions based on condition, controlling motor speed using switch case,*/
public class P3_Loop_Switch_Condition {
    
    
     
    
    void doSquare(int times){
        
  TurtleRobot robot = new TurtleRobot();
  int i=0;
  int limit=times*4;
  //using for
  //for(int i=0;i<=10;i++){
//     
// gear.forward(500);
// gear.left(900);
// gear.forward(3000);
//
//}
while (true) // to complete a square this loop will be executed 4 times;
{
i+=1;
robot.forward(120); //move forward
robot.left(90); // turn left / 90 degrees
if(i==limit)break;
}
System.out.println("Did square "+times+" times");
}  

    void Steps(){
    
NxtRobot robot = new NxtRobot();

Gear gear = new Gear();
robot.addPart(gear);
gear.setSpeed(30);
  for(int i=0;i<=10;i++){
     
 gear.forward(800);
 gear.left(900);
 gear.forward(900);
gear.right(900);
 

}
}
    
    
    void controlSpeed(){
    
    int motorSpeed=0;
    
    NxtRobot robot = new NxtRobot();
    Motor motA = new Motor(MotorPort.A);
    Motor motB = new Motor(MotorPort.B);
    robot.addPart(motA);
    robot.addPart(motB);
    motA.forward();
    motB.forward();

    while(true){
     
        switch(motorSpeed){
            
            default:
                motorSpeed+=10;
                
            case 10:
                motA.setSpeed(motorSpeed);
                motB.setSpeed(motorSpeed);
                System.out.println("Setting motor speed to "+motorSpeed);
                Tools.delay(2000);
                motorSpeed+=10;
                break;
                
                 
    
            case 20:
                motA.setSpeed(motorSpeed);
                motB.setSpeed(motorSpeed);
                System.out.println("Increasing motor speed to "+motorSpeed);
                Tools.delay(2000);
                motorSpeed+=10;
                break;
                 
                
           case 30:
                motA.setSpeed(motorSpeed);
                motB.setSpeed(motorSpeed);
                System.out.println("Increasing motor speed to "+motorSpeed); 
                Tools.delay(2000);
                motorSpeed+=5;
                break;
                
           
           case 35:
               System.out.println("Too much motor speed "+motorSpeed+"\n Switching back motor speed to 10"); 
               motorSpeed=10;
               motA.setSpeed(motorSpeed);
               motB.setSpeed(motorSpeed);
               Tools.delay(2000);
               break;            
                
   }}
    }
    
    
    void changeDirections(){
    
NxtRobot robot = new NxtRobot();
Gear gear = new Gear();
robot.addPart(gear);
int gearSpeed=10;
gear.setSpeed(gearSpeed);


while (true){
    
 gear.forward(300);
 gearSpeed+=1; 
 gear.setSpeed(gearSpeed);
 
if(gear.getSpeed()==20){ // turns left
    
    gear.left(800);
    gear.forward(100);
    gearSpeed+=5;
    }
else if (gearSpeed==35){  //turns right
    
    gear.right(800);
    gear.forward(100);
    gearSpeed+=5;

}
else if(gearSpeed==45){ // turns back
    
    gear.right(900);
    gear.forward(1000);
    gearSpeed+=5;
    Tools.delay(2000);
    robot.exit();
    break;
}
}
} 
    
    
    
    public static void main(String[] args) {
        
       //  new P3_Loop_Switch_Condition().doSquare(3);
        // new P3_Loop_Switch_Condition().Steps();
//         new P3_Loop_Switch_Condition().changeDirections();
         new P3_Loop_Switch_Condition().controlSpeed();
         
    }
    
}
