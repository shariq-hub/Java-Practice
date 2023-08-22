// import java.lang.reflect.Method;
// import java.util.HashMap;
// import java.util.Map;

// interface B{


//   public  void method1();
//    static void method2(){
//     System.out.println("default method");
//   }
// }



//   //differenfe between abstract and interface
//   //abstract class can have constructor
//   //interface can't have constructor
//   //abstract class can have abstract and non abstract methods
//   //interface can have only abstract methods after java 8 it can also have default and static methods
//   //abstract class can have final, non final, static and non static variables
//   //interface can have only static and final variables
//   //abstract class can provide the implementation of interface
//   //interface can't provide the implementation of abstract class
//   //abstract class can extend another java class and implement multiple java interfaces
//   //interface can extend another java interface only
//   //the keyword used to access the abstract class is extends
//   //the keyword used to access the interface is implements
//   //abstract class can have main method
//   //interface can't have main method
//   //abstract class can be extended using keyword "extends"
//   //interface can be implemented using keyword "implements"
//   //abstract class can have static method
//   //interface can't have static method
//   //abstract class can have final method
//   //interface can't have final method
//   //abstract class can have private method
//   //interface can't have private method
// //}

// interface a{
//   void print1();
// }
// interface b{
//   void print2();
// }
// interface d{
//   void print3();

// }
// interface C extends a,d,b{



// }

// class E{
//   int a;
//   int b;

//   public void print1(){
//     System.out.println("print1");
//   }
//   public void print2(){
//     System.out.println("print2");
//   }
  
// }


// public class mainMethod {
//     public static void main(String[] args) {
//       try{
//       E e=new E();
//       String className = "a";
//       Class<T> c1=Class.forName(className);
//        System.out.println(c1.getName());
//        System.out.println(c1.getSuperclass().getName());
       
//        //System.out.println(c1.());
//       }catch(Exception e){
//         System.out.println(e);
//       }

      
      
//     //   B obj=new B() {
//     //     public void method1() {
//     //       System.out.println("method1");
//     //   }
//     // };
//     //  obj.method2();
     
//   //  obj.method1();
//    // obj.method2();

//    //Lamdas Expression

   
   

//     //   Map<String,Object> ab1=new HashMap<String,Object>();
//     //   Map<String,Object> ab2=new HashMap<String,Object>();
//     // ab1.put("one", "Something1");
//     // ab2.put("one2", ab1);
//     // System.out.println(ab2);  
    
    
//     }
// }
