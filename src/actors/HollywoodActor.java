package actors;

import akka.actor.UntypedActor;

/**
 * @author Pavlo Cherkashyn
 */
public class HollywoodActor extends UntypedActor {

    @Override
    public void onReceive(Object o) throws Exception {
        System.out.println("HollywoodActor.onReceive "+o);
//        System.out.println("sender is " + getContext().sender());
    }
}
