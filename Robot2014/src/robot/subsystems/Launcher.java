package robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;

public class Launcher extends Subsystem {
    
    private Solenoid s = new Solenoid(RobotMap.LAUNCHER_SOLENOID);
    
    public void initDefaultCommand() {
        s.set(false);
    }
    
    public void set(boolean b) {
        s.set(b);
    }
}