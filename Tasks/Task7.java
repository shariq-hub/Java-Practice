package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
    List<String> values = new ArrayList<>();
    while(console.hasNext()){
        String input = console.nextLine();
        values.add(input);
    }
    console.close();
    doSplitCombine(values);
}

public static void doSplitCombine(List<String> values){
    List<String> results = new ArrayList<>();
    for(String value:values){

        // Splitting based on ';'
        String[] splittedCommand = value.split(";");
        String operationType = splittedCommand[0];
        String memberType = splittedCommand[1];
        String val = splittedCommand[2];

        StringBuilder builder = new StringBuilder();

        // If it is Split
        if("S".equalsIgnoreCase(operationType)){  
            if("M".equalsIgnoreCase(memberType)){ // Split Method
                val = val.substring(0,val.length()-2);
                char[] charArray = val.toCharArray();
                for(int i=0;i<charArray.length;i++){
                    if(Character.isUpperCase(charArray[i])){
                        builder.append(" ");
                    }
                    builder.append(Character.toLowerCase(charArray[i]));  
                }  
            }else if("C".equalsIgnoreCase(memberType)){ //Split Class
                char[] charArray = val.toCharArray();
                for(int i=0;i<charArray.length;i++){  
                    if(i==0){
                        builder.append(Character.toLowerCase(charArray[i]));
                    }else if(Character.isUpperCase(charArray[i])){
                        builder.append(" ");
                        builder.append(Character.toLowerCase(charArray[i]));
                    }else{
                         builder.append(charArray[i]);
                    }          
                }
            }else if("V".equalsIgnoreCase(memberType)){ // Split Variable
                char[] charArray = val.toCharArray();
                for(int i=0;i<charArray.length;i++){
                    if(Character.isUpperCase(charArray[i])){
                        builder.append(" ");
                    }
                    builder.append(Character.toLowerCase(charArray[i]));
                }
            }
            results.add(builder.toString());
        }else if("C".equalsIgnoreCase(operationType)){ // If it is Combine

            String[] splittedString = val.split(" ");

            if("M".equalsIgnoreCase(memberType)){ // Combine Method
               builder.append(splittedString[0]);
               for(int i =1;i<splittedString.length;i++){
                   char[] arr = splittedString[i].toCharArray();
                   arr[0]=Character.toUpperCase(arr[0]);
                   builder.append(String.valueOf(arr));
               }
               builder.append("()");
            }else if("C".equalsIgnoreCase(memberType)){ // Combine Class
               for(int i =0;i<splittedString.length;i++){
                   char[] arr = splittedString[i].toCharArray();
                   arr[0]=Character.toUpperCase(arr[0]);
                   builder.append(String.valueOf(arr));
               } 
            }else if("V".equalsIgnoreCase(memberType)){ // Combine Variable
                builder.append(splittedString[0]);
                for(int i =1;i<splittedString.length;i++){
                   char[] arr = splittedString[i].toCharArray();
                   arr[0]=Character.toUpperCase(arr[0]);
                   builder.append(String.valueOf(arr));
                }
            }

            results.add(builder.toString());
        }                                                
    }

   results.stream().forEach(i->{
       System.out.println(i);
   });

}


    
    
}
