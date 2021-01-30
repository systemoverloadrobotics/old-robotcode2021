package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.CONSTANTS.DRIVE;
import edu.wpi.first.wpilibj.SpeedController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.EncoderType;
import frc.robot.CONSTANTS;

import java.io.Console;
import java.util.function.BooleanSupplier;

public class DriveTrain extends SubsystemBase {
    
    private CANSparkMax rightMaster = new CANSparkMax(DRIVE.RIGHT_MASTER_ID, MotorType.kBrushless);
    private CANSparkMax rightFollower1 = new CANSparkMax(DRIVE.RIGHT_FOLLOWER_1_ID, MotorType.kBrushless);
    private CANSparkMax rightFollower2 = new CANSparkMax(DRIVE.RIGHT_FOLLOWER_2_ID, MotorType.kBrushless);
    private CANSparkMax leftMaster = new CANSparkMax(DRIVE.LEFT_MASTER_ID, MotorType.kBrushless);
    private CANSparkMax leftFollower1 = new CANSparkMax(DRIVE.LEFT_FOLLOWER_1_ID, MotorType.kBrushless);
    private CANSparkMax leftFollower2 = new CANSparkMax(DRIVE.LEFT_FOLLOWER_2_ID, MotorType.kBrushless);
    
    private CANEncoder leftMasterEncoder = new CANEncoder(leftMaster, EncoderType.kQuadrature, 4069);
    private CANEncoder rightMasterEncoder = new CANEncoder(rightMaster, EncoderType.kQuadrature, 4069);

    private DoubleSolenoid shifter = new DoubleSolenoid(CONSTANTS.PCM_ID, DRIVE.FORWARD_CHANNEL_ID, DRIVE.REVERSE_CHANNEL_ID);

    private SpeedControllerGroup rightGroup = new SpeedControllerGroup(rightMaster, rightFollower1, rightFollower2);
    private SpeedControllerGroup leftGroup = new SpeedControllerGroup(leftMaster, leftFollower1, leftFollower2);

    public DifferentialDrive robotDrive = new DifferentialDrive(leftGroup, rightGroup);

    BooleanSupplier m_align;


    public DriveTrain(BooleanSupplier align){
        m_align = align;

        rightMaster.restoreFactoryDefaults();
        rightFollower1.restoreFactoryDefaults();
        rightFollower2.restoreFactoryDefaults();
        leftMaster.restoreFactoryDefaults();
        leftFollower1.restoreFactoryDefaults();
        leftFollower2.restoreFactoryDefaults();
    }

    public void driveArcade(double speed, double turn) {
        //incase we need arcade drive
        robotDrive.arcadeDrive(-speed * DRIVE.SPEED_MULTIPLIER, -turn * DRIVE.TURN_MULTIPLIER);
    }



}
