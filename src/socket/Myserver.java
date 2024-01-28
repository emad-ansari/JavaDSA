package socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dinput = new DataInputStream(s.getInputStream());
            String message = (String)(dinput.readUTF());
            System.out.println("message from client side is : " + message);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
