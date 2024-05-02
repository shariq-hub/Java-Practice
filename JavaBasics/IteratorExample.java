import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        // OurGenericList<Integer> list=new OurGenericList<>();
        // list.addItem(1);
        // list.addItem(2);
        // list.addItem(3);
        // for(int i:list){
        //    System.out.println(i);
        // }
        List<String> myList = new ArrayList<String>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
       ListIterator<String> list=myList.listIterator(myList.size());
       while(list.hasPrevious()){
        System.out.println(list.previous());
       }      
    }
    
}
class OurGenericList<T> implements Iterable<T>{
    private List<T> items;
    //private T[] items;
    private int size;

    public OurGenericList(){
        this.size=0;
       // this.items=(T[])new Object[100];
            this.items=new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator();
    }
    public void addItem(T item){
     ///   this.items[size++] =item;
     items.add(item);
     size++;
    }
     public T getItem(int index){
       //return items[index];
       return items.get(index);
    }
    
private class OurGenericListIterator implements Iterator<T>{

    private int index=0;
    
    @Override
    public boolean hasNext() {
        return index<size;
    }

    @Override
    public T next() {
      //  return items[index++];
      return items.get(index++);
        
    }

}
}