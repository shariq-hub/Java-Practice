import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Testing2{
    public static void main(String[] args) {
    //     List<String> myList = new ArrayList<String>();
 
    //     // Adding elements to the List
    //     // Custom inputs
    //     myList.add("A");
    //     myList.add("B");
    //     myList.add("C");
    //     myList.add("D");
 
    //    Iterator<String> list=myList.iterator();

    //    while(list.hasNext()){
    //     System.out.println(list.next());
    //    }

   Queue<Integer> queue=new LinkedList<>();
   Deque<Integer> stack=new ArrayDeque<>();

  


  stack.push(1);
  stack.push(2);
  stack.push(3);
 
  queue.offer(1);
  queue.offer(2);
  queue.offer(3);

    System.out.println(queue);


 System.out.println(queue.poll());

 System.out.println(queue);



 System.out.println(stack);


 System.out.println(stack.pop());

 System.out.println(stack);







  


    }




}


