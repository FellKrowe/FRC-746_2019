package org.usfirst.frc886.FallFiesta886.commands;

import org.usfirst.frc886.FallFiesta886.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class dr_creepDrive extends Command {

	double left, right;
	
    public dr_creepDrive(double leftVal,double rightVal) {
    	left = leftVal;
    	right = rightVal;
    	
    }
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.setTankDrive(left, right, false);
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
