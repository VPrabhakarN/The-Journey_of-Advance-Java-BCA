import java.io.*;
import java.net.*;

class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server");
            dos.flush();
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
