// Java program to demonstarte the URL Class 
import java.net.*;

class URL_CLASS{
    public static void main(String args[]) throws MalformedURLException{

        // defining the object of URL class

        URL obj = new URL("https://www.youtube.com/");

        // displaying the information
        System.out.println(obj.getProtocol());
        System.out.println(obj.getHost());
        System.out.println(obj.getPort());
        System.out.println(obj.getFile());
        }
       

    }
