/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.commands;

/**
 *
 * @author Tripp
 */
public class FillAirTank extends CommandBase {
    
    public FillAirTank() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return compressor.getPressureSwitchValue();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}