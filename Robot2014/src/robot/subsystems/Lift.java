/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;
import robot.commands.AutoLift;

public class Lift extends Subsystem {

    private Solenoid lift = new Solenoid(RobotMap.LIFT_SOLENOID);
    public AnalogChannel sonar = new AnalogChannel(1, 1);
//    private Servo s = new Servo(servo);

    public void initDefaultCommand() {
        setDefaultCommand(new AutoLift());
    }

    public void moveLift(boolean b) {
        lift.set(b);
    }

    public boolean get() {
        return lift.get();
    }

    public void autoLift() {
        if (sonar.getValue() < 25) {
            lift.set(true);
        } else {
            lift.set(false);
        }
    }
}