public class StringsExample {


    public static void main(String[] args) {

        ABD a =new ABD();
        a.a="Hello";

       changeObject(a);

       System.out.println(a.getA());


       String test="Hello";
       //String will not change because String is Immutable
       changeStringTest(test);

       System.out.println("String is "+test);


    
}


private static void changeObject(ABD a){
    a.a="World";
}
private static void changeStringTest(String a){
    a="Changed";

}

}


class ABD{

   public String a;
    
    public  String getA(){
        return a;
    }
}
