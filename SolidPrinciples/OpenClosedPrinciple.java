package SolidPrinciples;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        //Open Closed Principle States that a class should be open for extension but closed for modification.
        StudentReportGenerator studentReportGenerator=new StudentReportGenerator();
        Report s1=new Student1();
        Report s2=new Student2();
        studentReportGenerator.generateReport(s1);
        studentReportGenerator.generateReport(s2);

    }
    
}

//Bad Example because every time a new student come we have to change Student Report class
// class StudentReportGenerator{
//     private void generateStudent1Report(){};
//     private void generateStudent2Report(){};
// }


//Good Example
//Create either an abstract class or an interface
interface Report{
     void generateReport();
}

class StudentReportGenerator{
    public void generateReport(Report r){
        r.generateReport();
    }
}

class Student1 implements Report{
        public void generateReport(){
            System.out.println("Student 1 report");
         }
}
class Student2 implements Report{
        public void generateReport(){
            System.out.println("Student 2 Report");
         }
}

