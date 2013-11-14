package interfaces;

/**
 * @author Pavlo Cherkashyn
 */
public interface IFly {
    public void takeOff();
    public default void cruise() {
        System.out.println("IFly.cruise");
    };
    public void turn();
    public void land();
}
