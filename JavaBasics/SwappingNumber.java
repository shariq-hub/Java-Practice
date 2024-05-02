public class SwappingNumber{
    public static void main(String[] args) {
        
        //Change variable values without using 3rd variable

        int a=30;
        int b=20;
        //Output : a=20 , b=10

        System.out.println("Values before Shifting : a = "+a+" b = "+b);

        a=a+b; //a=50
        b=a-b; //b=30
        a=a-b; //a=20
        

        System.out.println("Values After Shifting : a = "+a+" b = "+b);




    }
}