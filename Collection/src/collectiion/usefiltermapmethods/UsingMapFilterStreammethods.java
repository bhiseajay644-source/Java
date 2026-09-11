package collectiion.usefiltermapmethods;

import java.util.*;
import java.util.stream.Stream;

public class UsingMapFiltermethods {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,7,2,9,4,6,5,8);
        System.out.println("List is: "+nums);
        Stream<Integer> stream=nums.stream();
       // System.out.println("Print stream using Lambda: ");
        // stream.forEach(ele -> System.out.println(ele));
        System.out.println("Print stream using Lambda: ");
        stream.forEach(System.out::println);
        System.out.println("Method for the double: ");

        //Stream<Integer> stream1=nums.stream();
       // Stream<Integer> doubles=stream1.map(n->n+n);
        //doubles.forEach(ele-> System.out.println(ele));

        nums.stream().map(n->n+n).forEach(ele-> System.out.println(ele));
        System.out.println("Without using filter method: ");
        nums.stream().map(n->n%2==0).forEach(ele-> System.out.println(ele));
        System.out.println("With using filter method: ");
        nums.stream().filter(n->n%2==0).forEach(ele-> System.out.println(ele));
    }
}
