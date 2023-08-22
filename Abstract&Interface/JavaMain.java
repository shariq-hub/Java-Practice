import java.io.File;

public class JavaMain {

    public static void main(String[] args) {

        // Consumer<Integer> consumer=t ->System.out.println("Printing "+t);
        
        // consumer.accept(10);

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
try{

    File file=new File("D://SomeBPMNConcepts.txt");
    boolean value=file.canRead();
    if(value){
      System.out.println("The File is Created");
    }
    else{
      System.out.println("File Already Exist");
    }
   

  }catch(Exception e){
    System.out.println("Some Exception occur"+e.getMessage());

  }
  }

  }
