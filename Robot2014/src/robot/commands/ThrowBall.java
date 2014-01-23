package robot.commands;

public class ThrowBall extends CommandBase {

    public ThrowBall() {
        requires(launcher);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        launcher.set(true);
        setTimeout(.75);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        launcher.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}