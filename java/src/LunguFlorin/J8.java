package LunguFlorin;

import java.lang.management.MonitorInfo;

/**
 * J8. Va rog sa setati caracteristicile si metodele de setare si citire pentru clasa fiu MountainBike a clase parinte Bicycle
 * asa cum a fost definita in Laboratorul 4
 */
public class J8 {
    public static void main(String[] arg) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.changeCadence(3);
        mountainBike.speedUp(10);
        mountainBike.changeGear(2);
        mountainBike.applyBrakes(2);
        System.out.println(mountainBike);
    }
}
class MountainBike implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    @Override
    public String toString() {
        return "cadence : " + cadence + " speed : " + speed + " gear : " + gear;
    }
}

interface Bicycle {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
