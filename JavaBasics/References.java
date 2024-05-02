import java.util.ArrayList;
import java.util.Collection;

public class References{

    public static void main(String[] args) {
        
        int [] arr=new int[3];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        

        System.out.println("Value While Initialization is "+arr[0]);
        Example.change(arr);


        System.out.println("After Changing Values are "+arr[0]);

    }
}


class Example{
    public static void change(int [] arr){
        arr[0]=1000;
    }
}
