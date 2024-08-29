import java.io.*;
import java.net.*;

class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server is waiting for a client...");

            // Accept a client connection
            
            Socket s = ss.accept();
            System.out.println("Client connected!");

            // Read data from the client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("Message: " + str);

            // Close resources
            dis.close();
            s.close();
            ss.close();
            System.out.println("Server closed successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
