package interfaces;

/**
 * @author Pavlo Cherkashyn
 */
public interface Quadracopter extends IFly {
    public default void cruise() {
        System.out.println("Quadracopter.cruise");
    }
}
