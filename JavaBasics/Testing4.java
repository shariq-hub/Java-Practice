import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testing4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(12);
        //[1,3,10,12]
        //[3,1,10,12]
        //[10,3,1,12]
        //[12,10,3,1]
        
        Collections.sort(list, new MyComparator());
        System.out.println(list);
       
    
    }
}

class MyComparator implements Comparator<Integer>{
  
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }
        else if(o2>o1){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
