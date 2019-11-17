package Important_Java_Topics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 * Using ServerSocket class creating Server application for port number 6666.
 * </p>
 */
public class MyServer {
    public static void main(String[] args) {

        //Creating a Server
        try {
            ServerSocket server = new ServerSocket(6666);
            Socket s = server.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println(" Received message =   " + str);
            s.close();
        }catch (IOException io)
        {
            io.printStackTrace();
        }
    }

}
