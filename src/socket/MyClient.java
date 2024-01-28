package socket;
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
        try {
            
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            // sending some text on server 

            dout.writeUTF("hello this is my client");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
