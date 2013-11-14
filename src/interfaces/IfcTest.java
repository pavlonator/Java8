package interfaces;

/**
 * @author Pavlo Cherkashyn
 */
public class IfcTest {
    public static void main(String[] args) {
        IFly flyingMachine = new Plane();
        flyingMachine.takeOff();
        flyingMachine.cruise();
        flyingMachine.turn();
        flyingMachine.land();

    }
}
