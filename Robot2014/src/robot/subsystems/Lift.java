/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
//import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;
import robot.commands.moveLift;

public class Lift extends Subsystem {
    
    public double stow = 0, ground = 120;
    private Jaguar servo = new Jaguar(RobotMap.LIFT_MOTOR);
//    private Servo s = new Servo(servo);

    public void initDefaultCommand() {
        setDefaultCommand(new moveLift(stow));
    }
    
    public void moveLift(double angle){
        servo.setPosition(stow);
    }
}