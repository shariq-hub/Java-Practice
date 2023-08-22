package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer=t->System.out.println("Hello from "+t);

      //  consumer.accept("Shariq");

        List<String> list=new ArrayList<>();
        list.add("This");
        list.add("World");
          //foreach method accept the consumer functional interface 
        list.forEach(t-> System.out.println("Hello inside Foreach "+t));


        //Predicate is used to get true false value based on condtions
        Predicate<Integer> predicate = t -> t>2 ? true :false;

        System.out.println(predicate.test(3));


        //it has get Method used to return some value only example  
        Supplier<Double> supplier=()-> Math.random()*10;
        System.out.println(supplier.get());











      
    }
    
}
