package oops.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final int PORT = 5000;

        try{

            Socket clientSocket  = new Socket("localhost", PORT);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader( clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter( clientSocket.getOutputStream(), true);
            String message;
            while (true){
                System.out.println("Enter a message (type EXIT to terminate the program): " );
                // message input by the user
                message = reader.readLine();
                if (message.equals("EXIST")){
                    break;
                }
                // send the message enter by the user to server
                out.println(message);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
