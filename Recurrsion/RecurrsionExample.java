package Recurrsion;

public class RecurrsionExample {

    public static void main(String[] args) {
       System.out.println( RecurrsionExample.print(6));

    }
    

    private static int print(int n){
        if(n!=0)
        return n*print(n-1);
        else
        return 1;
    }
    
}
