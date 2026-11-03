package org.firstinspires.ftc.teamcode.subsystems.turret;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import static java.lang.Math.abs;

import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;

public class imuAlign {
    private double yShoot;
    private double xShoot;
    private double angleShoot;

    public void update(double xPos, double yPos, double angle, boolean blue) {
        if (yPos > 72){
            yShoot = 60;
        }
        else{
            yShoot = 144-60;
        }
        if (blue){
            xShoot = 144-60;
        }
        else{
            xShoot = 60;
        }
        angleShoot=Math.atan2(abs(xPos-xShoot),abs(yPos-yShoot));

    }
}
