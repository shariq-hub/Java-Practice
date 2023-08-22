package DesignPatterns;

interface Office{
    public String getId();
    public String getName();
    public String getEmail();

   
	

}

class PrivateOffice implements Office{

    private String id;
    private String name;
    private String email;

    public PrivateOffice(String id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
    public  String toString(){
	        return "id "+this.getId()+" Email is "+this.getEmail()+" Name is "+this.getName();
	}
    
}

class GovermentOffice implements Office{

    private String id;
    private String name;
    private String email;


      public GovermentOffice(String id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
    public  String toString(){
	        return "id "+this.getId()+" Email is "+this.getEmail()+" Name is "+this.getName();
	}
}


class Nadra{


    public static Office getOffice(String officeName,String id,String name,String email){
        if("GovermentOffice".equalsIgnoreCase(officeName)) return new GovermentOffice(id, name, email);
        else if("PrivateOffice".equalsIgnoreCase(officeName)) return new PrivateOffice(id, name, email);
        return null;
    }

}


public class FactoryDesignPattern {

    public static void main(String[] args) {

        Office govermentOffice=Nadra.getOffice("GovermentOffice", "1", "Shariq", "shariqshaikh226@gmail.com");
        System.out.println("Goverment office Employee is "+govermentOffice.toString());
        Office privateOffice=Nadra.getOffice("PrivateOffice", "2", "Jonathan", "jonathan226@gmail.com");
        System.out.println("Private office Employee is "+privateOffice.toString());

    }
    
}




