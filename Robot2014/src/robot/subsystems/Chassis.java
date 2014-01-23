package robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;
import robot.commands.*;

public class Chassis extends Subsystem {

    private Jaguar leftJag = new Jaguar(RobotMap.LEFT_MOTOR), rightJag = new Jaguar(RobotMap.RIGHT_MOTOR);

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }

    public void driveWithJoystick(double leftSpeed, double rightSpeed) {
        leftSpeed *= -1;
        rightSpeed *= -1;
        leftJag.set(leftSpeed);
        rightJag.set(rightSpeed);
        System.out.println("Left: " + leftJag.getRaw() + "\nRight: " + rightJag.getRaw()); //will remove
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftJag.set(leftSpeed);
        rightJag.set(rightSpeed);
    }

    public void stop() {
        leftJag.set(0);
        rightJag.set(0);
    }
}