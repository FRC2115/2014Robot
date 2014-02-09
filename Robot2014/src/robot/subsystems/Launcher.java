package robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.RobotMap;

public class Launcher extends Subsystem {
    
    private Solenoid left = new Solenoid(RobotMap.LAUNCHER_LEFT_SOLENOID),
            right = new Solenoid(RobotMap.LAUNCHER_RIGHT_SOLENOID);
    
    public void initDefaultCommand() {
        set(false);
    }
    
    public void set(boolean b) {
        left.set(b);
        right.set(b);
    }
}