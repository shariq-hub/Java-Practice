package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {

        List<A<Integer>> a=new ArrayList<>();
        A<Integer> a1=new A(1);
        a.add(a1);
        a.forEach(x->System.out.println(x));
    }
   
}

//we can't use ? on class level because It doesn't make sense to use it ! because if I use T I can get it and access in on class
class A<T>{

    private T value;

    public A(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    @Override
    public String toString(){
        return "value is : "+value;

    }

}