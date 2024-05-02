import java.util.Arrays;
import java.util.List;

public class references {

    public static void main(String[] args) {
        Testshariq t=new Testshariq();
       List<String> messages = Arrays.asList("Hello", "World", "!");
messages.forEach(t::print);


    }
    
}


class Testshariq{

    public String print(String a){
        return "Testing";
    }
}
