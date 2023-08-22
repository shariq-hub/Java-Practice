package Tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

interface B{
    public void print();
     static void print2(){
        System.out.println("Hello From interface Method!");
    }
     default void print3(){
        System.out.println("Hello From Interface I am default Method");
    }
}

abstract class A implements B{
    
    public void print2(){
        System.out.println("Hello From Abstract Class");
    }

}




public class Task3 {

    public static void main(String[] args) {
       

      A a=new A() {

        @Override
        public void print() {
        System.out.println("I am print method from Abstract A Class");
        }
        
      };
   a.print2();
   a.print3();
   a.print();        
   B.print2();    
}
    
}
