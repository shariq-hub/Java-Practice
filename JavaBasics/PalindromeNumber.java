import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        //Palindrome number is a number which will be same if put in reverse
        //example a=12321

        //Program to check if a Number is Palindrome or not?

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt(); //12321
               scanner.close();
        int result=0;
        int lastValue=0;
        int actualvalue=a;
       while(a>0){
        lastValue=a%10;
        result=result*10+lastValue; // here we divide by 10 because it's a number so we have to maintain the number
        System.out.println("result is "+result);
        a=a/10;
       }
       if(result==actualvalue){
        System.out.println("Number is Palindrome");
       }
       else{
        System.out.println("Number is not Palindrome");
       }




    }
    
}
