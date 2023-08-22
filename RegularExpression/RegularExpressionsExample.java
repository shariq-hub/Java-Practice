package RegularExpression;

public class RegularExpressionsExample {

    public static void main(String[] args) {
        //Regular Expressions
        //if I want to Split a String with just one space I will just pass a space in split method like s.split(" ");
        //but what if i want it to split with any number of spaces? then I will use something like s.split(" "+);--> it's called Repitition
        //there are 3 things repititon,Concatenation,Alternation
        String s1="Splitting a string, it's as easy as 1 2 33!  Right?";
        String []s2=s1.split("[123]"); // or if I use ("it*") it will return me the list of both just i and it 
        //For Alternation Example it's same as | bar ex:("it|st") it will see either this string or this 
        //also "[123]" what java will do is match any character inside this [], whatever inside [] match anything, it's character classes it will return single characters not list
        //then there is ^ it's called carrot it indicates not any character in this set for example:("^a-z123 ") means except these return whatever

        for (int s22 = 0; s22 < s2.length; s22++) {
            System.out.print(s2[s22]);
        }

        



           
    }
    
}
