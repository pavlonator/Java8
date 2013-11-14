import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pavlo Cherkashyn
 */
public class Collections {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //imperative collection processing
        int sum = 0;
        for (int num : numbers) {
            sum += num * 2;
        }
        System.out.println(sum);

        // declarative collection processing
        //        int result = numbers.stream().
        //                mapToInt(value->value*2).
        //                sum();
        //        System.out.println(result);

        // imperative collection processing
        System.out.println(sumOfEvenNumbersTimesTwo(numbers));
//        sumOfEvenNumbersTimesTwo(numbers);
//        sumOfOddNumbersTimesTwo(numbers);


        //declarative
        System.out.println(numbers.stream().
                filter(value -> value % 2 != 0).
                mapToInt(value -> value * 2).
                sum());


        System.out.println(numbers.stream().
                filter(value->value%2==0).
                filter(value->value%3==0).
                mapToInt(value -> value).
                findFirst().getAsInt());

        //parallelStream, num of threads


    }



    public static int sumOfAllNumbersTimesTwo(List<Integer> numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num * 2;
        }
        return sum;
    }

    public static int sumOfEvenNumbersTimesTwo(List<Integer> numbers){
        int sum = 0;
        for (int num : numbers) {
            if(num%2==0){
                sum += num * 2;
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersTimesTwo(List<Integer> numbers){
        int sum = 0;
        for (int num : numbers) {
            if(num%2!=0){
                sum += num * 2;
            }
        }
        return sum;
    }


}
