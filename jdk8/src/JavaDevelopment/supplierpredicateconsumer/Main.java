package JavaDevelopment.supplier;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
      //  Supplier<String> msg=()->"Welcome to java8";
       // System.out.println("Message is: "+msg.get());

        List<Integer> nums= Arrays.asList(3,8,2,9,5,7,4,6);
        Predicate<Integer> isEven= n->n%2==0;
        Consumer<Integer> c=n-> System.out.println(n*n);

        nums.stream().filter(isEven).forEach(c);
    }
}
