package Tasks;

import java.util.Base64;

public class Task2 {
    
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        byte[] encodedBytes = Base64.getEncoder().encode(originalString.getBytes());
        String encodedString = new String(encodedBytes);
        System.out.println("Encoded string: " + encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
