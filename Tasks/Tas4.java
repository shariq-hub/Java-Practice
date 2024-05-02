package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tas4 {
    
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(0, new Student("Shariq",21));
        list.add(0, new Student("Umair",29));
        list.add(0, new Student("John Doe",1));

List<String> list2=   list.stream()
        .map(Student::getName)
        .collect(Collectors.toList()); 

System.out.println(list2);


        
    }
}

class Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
 

}


