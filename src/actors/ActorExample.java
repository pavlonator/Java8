package actors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author Pavlo Cherkashyn
 */
public class ActorExample {
    public static void main(String[] args) throws InterruptedException {
        ActorSystem as = ActorSystem.create();
        ActorRef spielberg = as.actorOf(Props.create(HollywoodActor.class));
        ActorRef depp = as.actorOf(Props.create(HollywoodActor.class));

        depp.tell("Wonka", spielberg);
        as.apply();
        Thread.sleep(2000);
        as.shutdown();
    }
}
