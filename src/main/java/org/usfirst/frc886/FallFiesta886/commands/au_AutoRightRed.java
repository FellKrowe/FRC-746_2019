package org.usfirst.frc886.FallFiesta886.commands;


import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class au_AutoRightRed extends CommandGroup {

    public au_AutoRightRed() {
    	addSequential(new au_tankMove(.60,.60,1.2));
    	addSequential(new au_tankMove(.5,-.5,0.7));
    	//addParallel(new au_timedExtend(2.9));
    	addSequential(new au_tankMove(.6,.6,1));
    	//addSequential(new au_doNothing(2.9));
    	//addParallel (new au_timedRetract(2));
    	//addSequential(new au_tankMove(.3,-.3,1));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
