package robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public Joystick leftJoy = new Joystick(0), rightJoy = new Joystick(1);

    public JoystickButton throwBallButton = new JoystickButton(rightJoy, 1),
            liftBallButton = new JoystickButton(rightJoy, 2);
    
    public OI() {
        throwBallButton.whenPressed(new ThrowBall());
        liftBallButton.whileHeld(new MoveLift());
    }
}
