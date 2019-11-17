package Important_Java_Topics;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * <p>
 *     Java Socket and ServerSocket class to create Client/Server Architecture.
 *     Using Socket class, connecting to Server socket on localhost and port number 6666
 * </p>
 */
public class MyClient {

    public static void main(String[] args) {

        // creating client
        {
            try {
                Socket client = new Socket("localhost", 6666);
                DataOutputStream dout = new DataOutputStream(client.getOutputStream());
                dout.writeUTF("HELLO SERVER");
                dout.flush();
                dout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
