package Important_Java_Topics;

import java.io.*;
import java.net.Socket;

/**
 * <p>
 *     Java Socket and ServerSocket class to create Client/Server Architecture.
 *     Using Socket class, connecting to Server socket on localhost and port number 6666
 * </p>
 */
public class MyClient1 {
    public static void main(String[] args) throws IOException {
        Socket cl=new Socket("localhost",5555);

        DataInputStream din=new DataInputStream(cl.getInputStream());
        DataOutputStream dout=new DataOutputStream(cl.getOutputStream());
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String input="";
        String output="";

        while (!input.equals("stop"))
        {
            input=reader.readLine();
            dout.writeUTF(input);
            dout.flush();

            output=din.readUTF();
            System.out.println("Server says  : "+output);

        }
        dout.close();
        cl.close();
    }
}
