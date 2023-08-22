package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer=t->System.out.println("Hello from "+t);

      //  consumer.accept("Shariq");

        List<String> list=new ArrayList<>();
        list.add("This");
        list.add("World");
          //foreach method accept the consumer functional interface 
        list.forEach(t-> System.out.println("Hello inside Foreach "+t));




        
      
    }
    
}
