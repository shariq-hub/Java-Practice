package Networking;
// package Networking;
// import java.io.DataOutputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.net.Socket;
// import java.nio.ByteBuffer;
// import java.nio.channels.FileChannel;

// public class Client {

//    public static void main(String[] args) {
//     try{
//         // Connect to the server
//         Socket socket = new Socket("localhost", 6666);
    
//         // Create a FileOutputStream to write the received file to disk
//         FileOutputStream fos = new FileOutputStream("C:\\Users\\Shariq Shaikh\\Desktop\\OpenCms- V1.1.docx");
    
//         // Get the FileChannel from the FileOutputStream
//         FileChannel fc = fos.getChannel();
    
//         // Get the InputStream from the socket
//         InputStream is = socket.getInputStream();
    
//         // Create a ByteBuffer to read the file data into
//         ByteBuffer buffer = ByteBuffer.allocate(1024);
    
//         // Read data from the InputStream and write it to the FileChannel
//         while (is.read(buffer) != -1) {
//             buffer.flip();
//             fc.write(buffer);
//             buffer.clear();
//         }
    
//         // Close the FileChannel
//         fc.close();
    
//         // Close the FileOutputStream
//         fos.close();
    
//         // Close the socket
//         socket.close();
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
    
        

//         //DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());



//         // Socket socket=new Socket("localhost",8001);     
//         // DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
//         // dataOutputStream.writeUTF("Hello Server This is Shariq");
//         //dataOutputStream.flush();
//        // dataOutputStream.close();
//         //socket.close();

//         }catch(Exception ex){
//             System.out.println("Error"+ex);
//         }


// }
