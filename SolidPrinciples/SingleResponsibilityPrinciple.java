package SolidPrinciples;

public class SingleResponsibilityPrinciple {

    //Singleton Pattern states that a class should have only one responsibility
    public static void main(String[] args) {
        
    }    
}

//Bad Example
class Employee{
    private String name;
    private int id;

    private void calculateSalary(){};
    private void hireEmployee(){};
    private void sendReport(){};
    }

    
    //Good Example
    class Emplopyee{
        private String name;
        private int id;
    }

    class FinanceTeam{
        private void calculateSalary(){};
    }
    class HRTeam{
        private void hireEmployee(){};
    }
    



