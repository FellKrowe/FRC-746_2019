// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc886.FallFiesta886.subsystems;

import org.usfirst.frc886.FallFiesta886.RobotMap;
import org.usfirst.frc886.FallFiesta886.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Arm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController armMotor = RobotMap.armarmMotor;
    private final SpeedController climbMotor = RobotMap.climbMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void stop() {
    	armMotor.set(0);
    }
    
    public void setArmMotor(double speed) {
		if (speed > 1 || speed < -1) {
			System.out.println("WARNING! Unsafe speeds");
		} 
		
		else {
			armMotor.set(speed);
		}
	}
    
    
    public void cStop() {
    	climbMotor.set(0);
    }
    
    public void setClimbMotor(double speed) {
		if (speed > 1 || speed < -1) {
			System.out.println("WARNING! Unsafe speeds");
		} 
		
		else {
			climbMotor.set(speed);
		}
	}

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

