package Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ThreadSample {

    public static void main(String[] args) {
        Example example=new Example();
      System.out.println(  Thread.currentThread().getName());
        System.out.println("Hello Shariq");
      CompletableFuture.runAsync(example);
    }
    
}


class Example extends Thread{


    @Override
    public void run(){
	try{	
              System.out.println(  Thread.currentThread().getName());

	         // TimeUnit.SECONDS.sleep(10);
             Thread.sleep(1);
                      System.out.println("Inside ComletableFuture Thread ");

    }catch(Exception ex){
        System.out.println("some Exception : "+ex.getMessage());
    }
    }

}
