package interfaces;

/**
 * @author Pavlo Cherkashyn
 */

//diamond problem #1: implements Helicopter, Quadracopter, both have the default for the same method - resolved compile time
//diamond problem #2:


public class Plane extends WaterLanding implements Helicopter{
    @Override
    public void takeOff() {
        System.out.println("Plane.takeOff");
    }

    @Override
    public void turn() {
        System.out.println("Plane.turn");
    }

    @Override
    public void land() {
        System.out.println("Plane.land");
    }
}
