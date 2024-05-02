import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testing3 {

    public static void main(String[] args) {
    //    String s=new String("Hello World"); // 2
    //    s.concat("hehehe"); // 4 one will be created in SCP name as hehehe, other will create in heap as Hello Worldhehehe
    //    String s2=s.concat("shariq"); //6
    //    s2.concat("iknow"); // 8
    //    System.out.println(s);
    //    System.out.println(s2);
    //See Data
    
//   String s="helloiamshariq";
//    Function<Integer,Integer> f =x->x*x;

//    System.out.println(f.apply(30));
Aims a=new aim();
a.print();
Aims a2=new aim2();
a2.print();

   
    }
}

@FunctionalInterface
interface Aims{
    public void print();
}
class aim implements Aims{

    @Override
    public void print() {

        System.out.println("Implemented method");
    }
    
}


class aim2 implements Aims{

    @Override
    public void print() {
System.out.println("implemented Method aim2");        
    }
    
}








