package Networking;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
        ServerSocket serverSocket=new ServerSocket(8001);
        Socket s=serverSocket.accept();
        DataInputStream dataInputStream=new DataInputStream(s.getInputStream());
        String str=(String)dataInputStream.readUTF();
        System.out.println("Message is "+str);
        serverSocket.close();
        }catch(Exception ex){
            System.out.println("Some Error "+ex);
        }
        
        }
    }