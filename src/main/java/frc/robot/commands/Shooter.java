/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;

public class Shooter extends CommandBase {
  private final ShooterSubsystem shooter;

  public Shooter(ShooterSubsystem shooterSubsystem) {
    shooter = shooterSubsystem;
    addRequirements(shooter);
  }

  @Override
  public void initialize() {
    

  }

  @Override
  public void execute() {
    shooter.Shoot();
  }

  @Override
  public void end(boolean interrupted) {
  shooter.Stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
