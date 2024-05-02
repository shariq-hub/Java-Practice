package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> p1=i-> i>0;
        Predicate<Integer> p2 = i-> i%2==0;


        System.out.println(p2.test(1));
        System.out.println(p2.test(9));


    }
    
}
