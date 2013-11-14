import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pavlo Cherkashyn
 */
public class Lambda {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

// imperative style of programming
//        for (int i = 0; i < numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }

// imperative style of programming, but better
//        for(int num:numbers){
//            System.out.println(num);
//        }


// declarative style of programming
//        numbers.forEach(value -> System.out.println(value));

//how it would look without lambda
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//
//            @Override
//            public Consumer<Integer> andThen(Consumer<? super Integer> after) {
//
//                return null;
//            }
//        });

// easier
//        numbers.forEach(System.out::println);

// another example - thread
// imperative
// new Thread(new Runnable() {
//    @Override
//    public void run() {
//         runSomething();
//    }
//}).start();

// declarative
//        new Thread(Entry::runSomething).start();

// another example comparator
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -o1.compareTo(o2);
//            }
//        });

        Collections.sort(numbers, (o1, o2)->-o1.compareTo(o2));

        numbers.forEach(System.out::println);

    }


    public static void runSomething(){
        System.out.println("Hello, World!");
    }
}
