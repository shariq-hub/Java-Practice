import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsBasics {

    public static void main(String[] args) {
        List<Integer> listData=new ArrayList<>();

        listData.add(1);
        listData.add(2);
        listData.add(5);
        listData.add(4);
        listData.add(6);
        listData.add(9);
        listData.add(7);
        //Remember Stream doesn't change original Data 

        //To convert Integer to Double 
        List<Double> list= listData.stream()
        .map(t-> new Double(t))
        .collect(Collectors.toList());
        list.forEach(t->System.out.println(t));

        //To Sort a List
        List<Integer> sortedList= listData.stream()
        .sorted()
        .collect(Collectors.toList());
        sortedList.forEach(t-> System.out.println(t));

        //To Find occurence of characters in a String

         String s="Hey, This is Shariq, Hello World";

     Map<String,Long> occurence= Arrays.stream(s.split(""))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(occurence);

        
    }
    
}
