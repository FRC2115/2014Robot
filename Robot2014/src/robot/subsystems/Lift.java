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
import robot.commands.MoveLift;

public class Lift extends Subsystem {
    
    private Solenoid lift = new Solenoid(RobotMap.LIFT_SOLENOID);
    public AnalogChannel sonar = new AnalogChannel(1);
//    private Servo s = new Servo(servo);

    public void initDefaultCommand() {
        setDefaultCommand(new AutoLift());
    }
    
    public void moveLift(boolean b){
        lift.set(b);
    }
    
    public void autoLift()
    {
        if(sonar.getVoltage() < .25)
            lift.set(true);
        else
            lift.set(false);
    }
}