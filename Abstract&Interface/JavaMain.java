import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;



public class JavaMain {


  public static String toExcelColumnString(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char digit = (char) (remainder + 'A');
            result.insert(0, digit);
            columnNumber = (columnNumber - 1) / 26;
        }

        return result.toString();
    }

  
  public static  void main(String[] args) {
   //Program to find Vowels in a String.
  //   String s="Hello   How    are    you??";

  //  char []arr={'a','e','i','o','u'};
  //  int countforvowels=0;
  //  for(int i=0; i<s.length(); i++){
  //   for(int j=0; j<arr.length; j++){
  //     if(s.charAt(i)==arr[j]){
  //       countforvowels+=1;
  //     }

  //   }
  //  }

  //  System.out.println(countforvowels);


  //Program to reverse a String

  // String h="Hello How are you ? ";

  // StringBuilder stringBuilder=new StringBuilder();

  // for(int i=h.length()-1; i>=0; i--){
  //   stringBuilder.append(h.charAt(i));
  // }


  // System.out.println(stringBuilder);


  //Program to find no of letters in a String

       String s="Hello   How    are    you??";
       int noofletters=0;

       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)==' ')
          continue;
          else
          noofletters+=1;
       }
       System.out.println(noofletters);
       






  
   
  //  for (int splited2 = 0; splited2 < splited.length; splited2++) {
  //   System.out.println(splited[splited2]);
  //  }

    // int number1 = 1;
    // int number2 = 3;
    // int number3 = 27;

    // System.out.println(number1 + " -> " + toExcelColumnString(number1));
    // System.out.println(number2 + " -> " + toExcelColumnString(number2));
    // System.out.println(number3 + " -> " + toExcelColumnString(number3));



//  Runnable r=()->System.out.println("Hello World");
  
          // Consumer<Integer> consumer=t ->System.out.println("Printing "+t);
        
         

          //Predicate is for Condition Wise Check
          //Function is for Input and Returning the specific output

       
       //   Collections.sort(null);
       
       // int i = 42;
        //Integer j = Integer.valueOf(i); // use Integer.valueOf() instead of autoboxing

        // consumer.accept(10);

        // Consumer<String> consumerString=(t)->System.out.println(t);

        // consumerString.accept("Hello My World");

        


        //Use-Case

        // Predicate<Integer> p=t-> t%2==0;


        // Comparator<Integer> c=(t1,t2)->t1.compareTo(t2);
        // List<Integer> list1=Arrays.asList(1,2,3,4,5);
        // list1.stream().forEach(t ->System.out.println("Printing "+t));     
       // list1.stream().
       

     //Program to Understand Bytes in Java

    //    String text1="HelloWorld";
    //    String encodedString=Base64.getEncoder().encodeToString(text1.getBytes());
    //      System.out.println("Encoded String is "+encodedString);
    //      System.out.println("Encoded String in Bytes is "+encodedString.getBytes());

    //      //I want to see what's inside encodedString contains not it's memory address
    //      byte[] encodedBytes=encodedString.getBytes();
    //         for(byte b:encodedBytes){
    //             System.out.print(Integer.toBinaryString(b)+" ");
    //         }

    // List<Integer> list1=Arrays.asList(1,2,3,4,5);
    // Consumer<Integer> consumer=t ->System.out.println("Printing "+t);
    // list1.stream().forEach(consumer);
    // initialize the class with Integer data
// try{

//     File file=new File("D://SomeBPMNConcepts.txt");
//     boolean value=file.canRead();
//     if(value){
//       System.out.println("The File is Created");
//     }
//     else{
//       System.out.println("File Already Exist");
//     }
   

//   }catch(Exception e){
//     System.out.println("Some Exception occur"+e.getMessage());

//   }




    





  }




 
  }




 


  