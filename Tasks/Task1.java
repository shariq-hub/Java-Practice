package Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task1 {
    
        public static void main(String[] args) {
            int count = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter some text? ");
            String text = input.nextLine();
            System.out.println("Please enter word for searching and count the occerence in your text");
            String wordToSearch = input.nextLine();
            input.close();
    
            try {
                //  writing data
                FileOutputStream fout = new FileOutputStream("text.txt");
                byte[] data = text.getBytes();
                fout.write(data);
                fout.flush();
                fout.close();
                //reading data
                FileInputStream fis = new FileInputStream("text.txt");
                byte[] readData = new byte[fis.available()];
                fis.read(readData);
                fis.close();
                String strData = new String(readData);
                StringTokenizer stringTokenizer = new StringTokenizer(strData," ?");
                int tokens = stringTokenizer.countTokens();
                System.out.println("No of words in your text:" +tokens);
                while (stringTokenizer.hasMoreTokens()) {
                 
                    String token = stringTokenizer.nextToken();
                    if (token.equals(wordToSearch)) {
                      count++; 
                    }
                    
                }
                System.out.println(wordToSearch + " is repeated: " + count);
    
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }
    }
    

