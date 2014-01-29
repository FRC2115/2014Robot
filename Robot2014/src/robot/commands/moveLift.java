/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.commands;

/**
 *
 * @author Tripp
 */
public class moveLift extends CommandBase {
    
    private double angle;
    public moveLift(double angle) {
        requires(lift);
        this.angle = angle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
       angle = (angle/360);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        lift.moveLift(angle);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}