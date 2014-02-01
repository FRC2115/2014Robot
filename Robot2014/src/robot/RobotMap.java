package robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static final int LEFT_MOTOR = 1,
            RIGHT_MOTOR = 2,
            //Solenoids
            LAUNCHER_SOLENOID = 1,
            LIFT_SOLENOID = 2,
            //Compressor
            COMPRESSOR_CHANNEL = 1,
            //Relay switch
            RELAY_SWITCH_CHANNEL = 1;
            //Servos;
}
