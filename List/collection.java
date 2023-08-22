package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collection {

    public static void main(String[] args) {

        // List<String> a=new ArrayList<>();
        // a.add("Hello");
        // a.add("World");


        // Map<String,String> h=new HashMap<>();
        

// Program to find a palindrome Number

     int a=14241;
     int b=a;

     int lastValue=a%10; //last value
     int answer=0;  // decrement last value

     while(a>0){
        lastValue=a%10;
        answer=answer*10+lastValue;
        a=a/10;
     }
     if(b==answer){

        System.out.println("Number is Palindrome");
     }
     else{
        System.out.println("Number is not Palindrome");
     }


    }
    
}
