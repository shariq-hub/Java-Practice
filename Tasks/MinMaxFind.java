
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> elements=new ArrayList<>();
        elements.add(4);
        elements.add(2);
        elements.add(5);
        elements.add(1);
        elements.add(3);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i : elements){
        if(i>max){
            max=i;
        }
        if(i<min){
            min=i;
        }
        }
        System.out.println("Min value is "+min);
        System.out.println("Max Value is "+max); 
    }
    
}
