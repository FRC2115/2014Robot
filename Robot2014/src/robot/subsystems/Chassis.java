/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;
import robot.commands.*;

/**
 *
 * @author Tripp
 */
public class Chassis extends Subsystem {
    private Jaguar leftJag = new Jaguar(RobotMap.LEFT_MOTOR), rightJag = new Jaguar(RobotMap.RIGHT_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void driveWithJoystick(double leftSpeed, double rightSpeed)
    {
        leftJag.set(leftSpeed);
        rightJag.set(rightSpeed);
    }
            
}