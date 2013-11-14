package interfaces;

/**
 * @author Pavlo Cherkashyn
 */
public abstract class WaterLanding implements IFly {
    @Override
    public void cruise() {
        System.out.println("WaterLanding.cruise");
    }
}
