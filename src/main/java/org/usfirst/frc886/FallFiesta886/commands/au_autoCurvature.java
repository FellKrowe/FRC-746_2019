package org.usfirst.frc886.FallFiesta886.commands;
import org.usfirst.frc886.FallFiesta886.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class au_autoCurvature extends Command {
	
	double throttle;
	double turning;
	double seconds;
	boolean quickTurn;


    public au_autoCurvature(double xSpeed, double zRotation, boolean isQuickTurn ,double timer) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	throttle = xSpeed;
    	turning = zRotation;
    	seconds = timer;
    	quickTurn = isQuickTurn;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.stop();
    	setTimeout(seconds);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.curvatureDrive(throttle, turning, quickTurn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
