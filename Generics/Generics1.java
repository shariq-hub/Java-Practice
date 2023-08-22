package Generics;

import java.util.ArrayList;
import java.util.List;


 interface Shape {
    double getArea();
    double getCircumference();
}
 interface DeletableShape extends Shape {
}

 class Rectangle implements DeletableShape {

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    public double getCircumference() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCircumference'");
    }
    // implementation details
}

public class Generics1 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();


    }
   

    
    
}
