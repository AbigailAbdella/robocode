package abigailabdella;

import robocode.Robot;
import java.awt.Color;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.HitByBulletEvent;

public class AbigailAbdella extends Robot { 

    boolean movingForward;

    public void run (){


        setBodyColor(java.awt.Color.blue);

        while(true){
            ahead (3000);
            movingForward = true; 
            turnGunLeft(180);
            back(1000);
            turnGunRight(180);
            turnLeft(180);
            turnRight(90);
        }
    }

public void onScannedRobot(ScannedRobotEvent e){
    

fire (10);
}



public void onHitWall(HitWallEvent e){
    turnLeft(180);
    ahead(100);
    }
    

public void onHitByBullet (HitByBulletEvent e){
    goOppositeDirection();
    double energy = getEnergy ();


if (energy < 50){
    fire (1);
}
else {
    fire(10);
}
}


public void goOppositeDirection() {
    if (movingForward) {
        back(3000);
    }else {
        ahead(3000);
    }

}
}


