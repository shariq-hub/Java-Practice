package FunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(4);



        //Sort a List using Stream API
        List<Integer> soIntegers=    list1.stream()
        .sorted()
        .collect(Collectors.toList());
        
        System.out.println(soIntegers); // output [1,3,4,5]


        // list1.add("Shariq");
        // list1.add("Ahmed");
        // list1.add("Ali");

        // Function<String,String> function = t-> "Hello ";


        // list1.stream()
        // .map(function);


        // list1.stream()
        // .filter(t->t.equals("Shariq") ? true:false)
        // .map(t-> t.length())
        // .collect(Collectors.toList());





        



        


    }
    
}
