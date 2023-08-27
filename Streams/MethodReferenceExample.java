import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class A{


    A(String name){
        this.name=name;
    }

     String name;
    public static void print(String name){
        System.out.println("Static Method"+name);

    }
    public void print2(){
        System.out.println("Normal Method");

    }
    @Override
    public String toString(){
        return name;
    }

    public List<String> getList(){
       return IntStream.range(1, 10)
        .mapToObj(i-> " Employee is "+new A("Shariq"))
        .collect(Collectors.toList());
    }

}



public class MethodReferenceExample{

    public static void main(String[] args) {
       A a=new A("Shariq");
       a.getList()
       .forEach(A::print);
        
    }
}