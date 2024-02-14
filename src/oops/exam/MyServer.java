package oops.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    
    public static void main(String[] args) {
    final int PORT = 5000;

    
    try {
        ServerSocket serverSocket = new ServerSocket(PORT);
        
        Socket clientSocket = serverSocket.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        String recieveMessage;

        while ((recieveMessage = reader.readLine()) != null){
            System.out.println("Recieved message from client : " + recieveMessage);
            if (recieveMessage.equals("EXIST")){
                break;
            }
            // send a response to client
            out.println("Server have recieved this message from client : " + recieveMessage);

        }
        reader.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    catch(Exception e) {
        System.out.println(e);
    }
    

        
    }
    

    
}
