package Important_Java_Topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import static java.net.InetAddress.getByName;

/**
 * Programs to find IP address and name of local Machine.
 * Programs to find IP address of Domains . websites.
 */
public class MyInetAddress {

    public static void main(String[] args) throws IOException {

        localMachineInfo();
        remoteMachineInfo();
    }

    /**
     * <p>
     * To find IP Address and HostName of local Machine
     * </p>.
     */
    public static void localMachineInfo() throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("Local Machine IP address  : " + inetAddress.getHostAddress());
        System.out.println("Local Machine Name  : " + inetAddress.getHostName());
    }

    /**
     * <p>
     * To find IP Address and HostName of Remote Machine
     * </p>.
     */
    public static void remoteMachineInfo() throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getByName("www.cathkidston.com");
        System.out.println("Remote Machine IP address  : " + inetAddress.getHostAddress());
        System.out.println("Remote Machine name  : " + inetAddress.getHostName());
    }
}
