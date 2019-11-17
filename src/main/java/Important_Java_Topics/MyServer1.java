package Important_Java_Topics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 * Using ServerSocket class creating Server application for port number 6666.
 * </p>
 */
public class MyServer1 {

    public static void main(String[] args) throws IOException {

        ServerSocket srv=new ServerSocket(5555);
        Socket sc=srv.accept();

        DataInputStream din=new DataInputStream(sc.getInputStream());
        DataOutputStream dout=new DataOutputStream(sc.getOutputStream());
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String input="";
        String output="";

        while (!input.equals("stop"))
        {
            input=din.readUTF();
            System.out.println("Client says  :  " + input);

            output=reader.readLine();
            dout.writeUTF(output);
            dout.flush();

        }
        din.close();
        sc.close();
        srv.close();

    }
}
