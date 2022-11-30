package org.usfirst.frc886.FallFiesta886.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class au_AutoLeftHab extends CommandGroup {

    public au_AutoLeftHab() {
    	addSequential(new au_tankMove(.60,.60,2.15));
    	addSequential(new au_tankMove(.4,-.4,0.75));
    	
    	addSequential(new au_tankMove(.5,.5,.8));
    	addSequential(new au_doNothing(3));
    	
    	addSequential(new au_tankMove(-.3,-.3,1));
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
