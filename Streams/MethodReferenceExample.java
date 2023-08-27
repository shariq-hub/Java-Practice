import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


interface B{
    A getMessage(String message);
}


class A{


    A(String name){
        this.name=name;
        System.out.println(name);
    }

     String name;
    public static void print(A name){
        System.out.println("Static Method"+name);

    }
    public void print2(){
        System.out.println("Normal Method");

    }
    @Override
    public String toString(){
        return name;
    }

    public List<A> getList(){
       return IntStream.range(1, 10)
        .mapToObj(i-> new A("Shariq"))
        .collect(Collectors.toList());
    }

}



public class MethodReferenceExample{

    public static void main(String[] args) {
      //Static Method Reference
        A a=new A("Shariq");
       a.getList()
       .forEach(A::print);


       //instance method Reference
         A a1=new A("Shariq");
       a1.getList()
       .forEach(A::print2);


        //Constructor Reference
         B a2=A::new;
         a2.getMessage("Something");
         

      
        
        
    }
}