package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
        if(list.get(i)>max){
            max=list.get(i);
        }
        if(list.get(i)<min){
            min=list.get(i);
        }

        }
                System.out.println("Min value is "+min);
        System.out.println("Max Value is "+max);


   
    
    }
    
}
