import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testing extends AbstractList<Integer>{
    private int size;
 
    public testing(int size) {
        this.size = size;
    }
 
    @Override
    public Integer get(int index) {
        return index;
    }
 
    @Override
    public int size() {
        return size;
    }
 
    public static void main(String[] args) {
        List<Integer> list = new testing(5);
       System.out.println(list);
       
    }
}
