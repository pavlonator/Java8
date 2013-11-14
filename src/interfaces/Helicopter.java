package interfaces;

/**
 * @author Pavlo Cherkashyn
 */
public interface Helicopter extends IFly {
    public default void cruise() {
        System.out.println("Helicopter.cruise");
    }

}
